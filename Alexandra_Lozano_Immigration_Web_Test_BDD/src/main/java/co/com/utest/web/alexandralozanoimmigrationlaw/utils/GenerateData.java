package co.com.utest.web.alexandralozanoimmigrationlaw.utils;

import co.com.utest.web.alexandralozanoimmigrationlaw.models.Device;
import co.com.utest.web.alexandralozanoimmigrationlaw.models.Location;
import co.com.utest.web.alexandralozanoimmigrationlaw.models.Person;
import com.github.javafaker.Faker;

public class GenerateData {

    static Faker faker = new Faker();


    public static Person newPerson() {
        return new Person(faker.name().firstName(), faker.name().lastName(), faker.bothify("julian##@hotmail.com"), "October", "25", "1999", "Dutch", newLocation(), newDevice());
    }

    public static Device newDevice() {
        return new Device("Ubuntu", "Ubuntu 20.10 Groovy Gorilla", "Bulgarian", "Asus", "Nexus 7 (2012)", "Android 6");
    }

    public static Location newLocation() {
        return new Location("Cali,Valle", "4545");
    }
}
