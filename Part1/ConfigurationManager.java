package Part1;

import java.util.HashMap;
import java.util.Map;

public final class ConfigurationManager {
    private static ConfigurationManager instance;
    final Map<String, String> setting;

    private ConfigurationManager(String maxPlayer, String defaultLanguage, String gameDifficulty) {
        setting = new HashMap<>();
        setting.put("maxPlayer", maxPlayer);
        setting.put("defaultLanguage", defaultLanguage);
        setting.put("gameDifficulty", gameDifficulty);
    }

    public static ConfigurationManager getInstance(String maxPlayer, String defaultLanguage, String gameDifficulty) {
        if (instance == null) {
            instance = new ConfigurationManager(maxPlayer, defaultLanguage, gameDifficulty);
        }
        return instance;
    }

    public String getSetting(String key) {
        return setting.get(key);
    }

    public void printSetting() {
        System.out.println("Setting: ");
        for (String s : setting.keySet()) {
            System.out.println(s + ": " + setting.get(s));
        }
    }
}
