package co.com.utest.web.alexandralozanoimmigrationlaw.models;

public class Person {
    private String fristname;
    private String lastname;
    private String email;
    private String month;
    private String day;
    private String year;
    private String spekean;

    private Location location;

    private Device device;

    public Person() {
    }

    public Person(String fristname, String lastname, String email, String month, String day, String year, String spekean, Location location, Device device) {
        this.fristname = fristname;
        this.lastname = lastname;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
        this.spekean = spekean;
        this.location = location;
        this.device = device;
    }


    public Location getLocation() {
        return location;
    }

    public Device getDevice() {
        return device;
    }

    public String getFristname() {
        return fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getSpekean() {
        return spekean;
    }
}

