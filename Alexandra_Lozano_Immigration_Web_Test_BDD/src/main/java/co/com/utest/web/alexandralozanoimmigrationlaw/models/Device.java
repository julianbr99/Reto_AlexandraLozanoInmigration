package co.com.utest.web.alexandralozanoimmigrationlaw.models;

public class Device {
    private String yourcomputer;
    private String version;
    private String lenguage;
    private String mobiledevice;
    private String model;
    private String operatingsystem;

    public Device(String yourcomputer, String version, String lenguage, String mobiledevice, String model, String operatingsystem) {
        this.yourcomputer = yourcomputer;
        this.version = version;
        this.lenguage = lenguage;
        this.mobiledevice = mobiledevice;
        this.model = model;
        this.operatingsystem = operatingsystem;
    }

    public String getYourcomputer() {
        return yourcomputer;
    }

    public String getVersion() {
        return version;
    }

    public String getLenguage() {
        return lenguage;
    }

    public String getMobiledevice() {
        return mobiledevice;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingsystem() {
        return operatingsystem;
    }
}
