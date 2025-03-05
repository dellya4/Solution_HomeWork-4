package Part1;

public class ConfigManagerDemo {
    public static void main(String[] args) {
        // Create configuration manager
        ConfigurationManager setting = ConfigurationManager.getInstance("100", "en", "medium");
        // Print all setting
        setting.printSetting();
        System.out.println();
        ConfigurationManager setting2 = ConfigurationManager.getInstance("150", "rus", "hard");
        setting2.printSetting();
    }
}
