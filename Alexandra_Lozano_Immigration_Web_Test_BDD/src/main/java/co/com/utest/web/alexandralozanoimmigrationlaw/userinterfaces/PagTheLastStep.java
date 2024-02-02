package co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagTheLastStep {

    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confrim password")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED = Target.the("stay informed")
            .located(By.xpath("//div[contains(text(),'STAY INFORMED!')]"));

    public static final Target UTEST_TERMS = Target.the("utest terms")
            .located(By.xpath("(//label[@class='input-check-box signup-consent']//span[@class='checkmark signup-consent__checkbox error'])[1]"));


    public static final Target UTEST_PRIVACY_POLICY = Target.the("utest privacy policy")
            .located(By.xpath("(//label[@class='input-check-box signup-consent']//span[@class='checkmark signup-consent__checkbox error'])"));


    public static final Target MESAGGE_FINAL = Target.the("complete setup")
            .located(By.xpath("//ui-view//h1"));
}
