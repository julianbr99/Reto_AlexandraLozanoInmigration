package co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PagAddYourAddress {

    public static final Target CITY  = Target.the("city").locatedBy("//ngf-input-container[@class='ngf-input-container--error']");
    public static final Target SELEC_CITY = Target.the("select city").located(By.xpath("//div[contains(text(),'Cali, Valle del Cauca, Colombia')]"));


    public static final Target CODE_POSTAL = Target.the("code postal").
            located(By.xpath("//input[@id='zip']"));




    public static final Target COONTRY = Target.the("coontry").
            located(By.xpath("//span[@class='ui-select-refreshing glyphicon glyphicon-refresh ui-select-spin ng-hide']"));

    public static final Target NEXT_DEVICES = Target.the("coontry").
            located(By.xpath(" //span[contains(text(),'Next: Devices')]"));







}
