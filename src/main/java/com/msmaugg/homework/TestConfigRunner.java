package com.msmaugg.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        // Constructorul cu 3 parametri
        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX, "125.0", true);

        // Constructorul cu 2 parametri
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "124.0");

        // Constructorul cu 1 parametru
        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME);

        // Metoda factory statica
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        System.out.println("--- Constructor cu 3 parametri ---");
        config1.afiseazaConfig();

        System.out.println("--- Constructor cu 2 parametri ---");
        config2.afiseazaConfig();

        System.out.println("--- Constructor cu 1 parametru ---");
        config3.afiseazaConfig();

        System.out.println("--- Metoda factory createDefaultChromeConfig() ---");
        config4.afiseazaConfig();
    }
}
