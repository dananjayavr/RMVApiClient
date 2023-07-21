import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CacheManager {
    static String getCachedResponse() throws Exception {
        File cacheFolder = new File(Main.CACHE_FOLDER);
        if (Main.useCache && cacheFolder.exists() && cacheFolder.isDirectory()) {
            File[] cacheFiles = cacheFolder.listFiles();
            if (cacheFiles != null && cacheFiles.length > 0) {
                File latestCacheFile = findLatestCacheFile(cacheFiles);
                if (latestCacheFile != null && !isCacheOutdated(latestCacheFile)) {
                    return XmlParser.loadXmlResponseFromFile(latestCacheFile);
                } else {
                    return RequestManager.makeApiRequest(Main.API_URL, true);
                }
            }
        } else {
            cacheFolder.mkdirs();
        }
        return RequestManager.makeApiRequest(Main.API_URL, true);
    }

    private static boolean isCacheOutdated(@NotNull File cacheFile) {
        String fileName = cacheFile.getName();
        Pattern pattern = Pattern.compile("cached_(\\d{8}_\\d{6}).xml");
        Matcher matcher = pattern.matcher(fileName);

        if (matcher.matches()) {
            String timeStampString = matcher.group(1); // Extract timestamp from the file name
            try {
                long fileTimeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").parse(timeStampString).getTime();
                long currentTime = System.currentTimeMillis();
                long timeElapsed = currentTime - fileTimeStamp;
                return timeElapsed > 3600000; // 3600000 ms = 1 hour
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        // If the file name doesn't match the pattern or timestamp extraction fails, consider the cache outdated.
        return true;
    }

    private static File findLatestCacheFile(@NotNull File[] cacheFiles) {
        File latestFile = null;
        long latestTimeStamp = Long.MIN_VALUE;
        Pattern pattern = Pattern.compile("cached_(\\d{8}_\\d{6}).xml");

        for (File file : cacheFiles) {
            String fileName = file.getName();
            Matcher matcher = pattern.matcher(fileName);

            if (matcher.matches()) {
                String timeStampString = matcher.group(1); // Extract timestamp from the file name
                try {
                    long timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").parse(timeStampString).getTime();
                    if (timeStamp > latestTimeStamp) {
                        latestFile = file;
                        latestTimeStamp = timeStamp;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        return latestFile;
    }
}
