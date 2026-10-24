package com.msmaugg.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructorul principal
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // browser + version -> isHeadless = false
    public BrowserConfig(BrowserType browser, String version) {
       this(browser,version,false);
    }

    // doar browser -> version = "latest", isHeadless = false
    public BrowserConfig(BrowserType browser) {
        this(browser,"latest");
    }

    // Metoda factory statica
    public static BrowserConfig createDefaultChromeConfig(){
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afisare a configuratiei
    public void afiseazaConfig() {
        System.out.println("Configurație browser:");
        System.out.println("Browser: " + browser);
        System.out.println("Versiune: " + version);
        System.out.println("Headless: " + (isHeadless ? "da" : "nu"));
        System.out.println();
    }
}
