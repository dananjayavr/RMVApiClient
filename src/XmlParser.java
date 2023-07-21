import de.rmv.hapirest.model.DepartureBoard;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XmlParser {
    public static @NotNull String loadXmlResponseFromFile(File cacheFile) {
        StringBuilder xmlResponse = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(cacheFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                xmlResponse.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Cache Hit.");
        return xmlResponse.toString();
    }

    static DepartureBoard parseXmlResponse(String xmlResponse) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(DepartureBoard.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(xmlResponse);

        return (DepartureBoard) unmarshaller.unmarshal(reader);
    }

    static void saveXmlResponseToFile(String xmlResponse) {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = Main.CACHE_FOLDER + File.separator + "cached_" + timeStamp + ".xml";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(xmlResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
