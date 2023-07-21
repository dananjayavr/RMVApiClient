import de.rmv.hapirest.model.Departure;
import de.rmv.hapirest.model.DepartureBoard;
import de.rmv.hapirest.model.ProductType;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class Main {
    // https://www.rmv.de/hapi/location.name?accessId=<access_id>&input=frankfurt%20hauptbahnhof
    public static final String API_URL = "https://www.rmv.de/hapi/departureBoard?accessId=%s&id=A=1@O=Wiesbaden%%20Loreleiring@X=8220662@Y=50077377@U=80@L=3025906@B=1@p=1689358093";
    private static final String CONFIG_FILE = "config.properties";
    public static boolean useCache = true; // Set this to true to use the cached response
    public static final String CACHE_FOLDER = "cache"; // Folder to save the cached XML response

    public static void main(String[] args) {
        try {

            String apiKey = loadApiKey();
            String apiUrlWithAccessId = String.format(API_URL, apiKey);

            String xmlResponse = useCache ? CacheManager.getCachedResponse() : RequestManager.makeApiRequest(apiUrlWithAccessId, true);

            // Update the cache file if needed
            if (!useCache) {
                XmlParser.saveXmlResponseToFile(xmlResponse);
            }

            DepartureBoard departureBoard = XmlParser.parseXmlResponse(xmlResponse);

            for (Departure departure : departureBoard.getDeparture()) {
                List<ProductType> products;
                System.out.println(departure.getDirection() + " : " + departure.getJourneyStatus() + " : " + departure.getTime());
                products = departure.getProduct();

                System.out.println("Products: " + products.size());

                for(ProductType productType : products) {
                    System.out.println(productType.getName());
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String loadApiKey() {
        String apiKey = "";
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                throw new FileNotFoundException("config.properties not found in the classpath.");
            }
            Properties properties = new Properties();
            properties.load(input);
            apiKey = properties.getProperty("api.accessId");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return apiKey;
    }

}