package co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PagPrincipalUtest {
    public static final Target JOIN_TODAY = Target.the("join today").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
