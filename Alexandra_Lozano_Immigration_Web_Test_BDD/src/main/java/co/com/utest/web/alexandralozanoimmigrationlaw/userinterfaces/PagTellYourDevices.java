package co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagTellYourDevices {


    public static final Target YOUR_COMPUTER = Target.the("your computer")
            .located(By.xpath("(//input[@type='search' and @placeholder='Select OS'])[1]"));
    public static final Target CLICK_YOUR_COMPUTER = Target.the("computer").
            located(By.xpath("(//span[@class='btn btn-default form-control ui-select-toggle'])[1]"));
    public static final Target VERSION = Target.the("version")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Version']"));
    public static final Target VERSION_SELECT = Target.the("version")
            .located(By.xpath("//div[@name='osVersionId']//input[@placeholder]"));

    public static final Target LENGUAGE = Target.the("lenguage")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select OS language']"));

    public static final Target LENGUAGE_SELECT = Target.the("select lenguage")
            .located(By.xpath("//div[@name='osLanguageId']//input[@placeholder]"));

    public static final Target YOUR_MOBILE_DAVICE = Target.the("your mobile davice")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select Brand']"));

    public static final Target YOUR_MOBILE_DAVICE_SELECT = Target.the("your mobile davice select ")
            .located(By.xpath("//div[@name='handsetMakerId']//input[@placeholder]"));
    public static final Target MODEL = Target.the("model")
            .located(By.xpath("//div[@class='ui-select-match' and @placeholder='Select a Model']"));
    public static final Target MODEL_SELECT = Target.the("model")
            .located(By.xpath("//div[@name='handsetModelId']//input[@placeholder]"));

    public static final Target OPERATING_SYSTEM = Target.the("operating system")
            .located(By.xpath("(//div[@class='ui-select-match' and @placeholder='Select OS'])[2]"));

    public static final Target OPERATING_SYSTEM_SELECT = Target.the("operating system select")
            .located(By.xpath("//div[@name='handsetOSId']//input[@placeholder]"));

    public static final Target NEXT_LAST_STEP = Target.the("next last step")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));


}
