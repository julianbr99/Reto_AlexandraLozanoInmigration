package co.com.utest.web.alexandralozanoimmigrationlaw.models;

public class Location {
    private String city;
    private String codepostal;


    public Location(String city, String codepostal) {
        this.city = city;
        this.codepostal = codepostal;

    }

    public String getCity() {
        return city;
    }

    public String getCodepostal() {
        return codepostal;
    }

}
