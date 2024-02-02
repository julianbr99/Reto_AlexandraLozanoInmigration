package co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PagTellAboutYourself {
    public static final Target FRIST_NAME = Target.the("frist name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("last name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email").located(By.id("email"));
    public static final Target MONTH = Target.the("join today").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("day").located(By.id("birthDay"));

    public static final Target YEAR = Target.the("year").located(By.id("birthYear"));

    public static final Target SPEAK = Target.the("speak").
            located(By.xpath("//input[@class='ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched']"));
    public static final Target LANGUAGE = Target.the("language").located(By.xpath("//div[@id='languages']//input"));

    public static final Target NEXT_LOCATION = Target.the("next location").located(By.xpath("//span[contains(text(),'Next: Location')]"));


}

