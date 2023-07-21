import org.jetbrains.annotations.NotNull;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestManager {
    static @NotNull String makeApiRequest(String apiUrl, boolean updateCache)  throws Exception {
        URL url = new URL(apiUrl);

        System.out.println("Cache Update.");

        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();

        if(responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();
            String xmlResponse = response.toString();

            // Optionally update the cache file
            if (updateCache) {
                XmlParser.saveXmlResponseToFile(xmlResponse);
            }

            return xmlResponse;

        } else {
            throw new Exception("API request failed with status code: " + responseCode);
        }

    }
}
