import elements.cms;
import elements.rep;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class repTest extends base_test
{
    rep obj;
    rep.repElements repElements;

    @BeforeClass
    public void setup()
    {
        super.setup();
        obj = new rep(driver);
        obj.goToNi(driver);
        repElements=new rep.repElements(driver);
    }

    @Test
    public void sDd() throws InterruptedException
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        repElements.userName.sendKeys("ashesh.shrestha");
        repElements.pw.sendKeys("Rome555!");
        repElements.log.click();
        repElements.masterMode.click();
        repElements.logIn.click();
        Thread.sleep(20000);
        repElements.rep.click();
        repElements.create.click();
        js.executeScript("arguments[0].scrollIntoView(true);", repElements.provRep);
        repElements.provRep.click();
        Thread.sleep(40000);
        repElements.state.click();
        repElements.stateVal.click();
        repElements.stateVal.sendKeys("pen");
        repElements.stateVal.sendKeys(Keys.ENTER);
        repElements.hrr.click();
        repElements.hrrVal.sendKeys("York");
        repElements.hrrVal.click();
        repElements.hrrVal.sendKeys(Keys.ENTER);
        repElements.spe.click();
        repElements.speVal.sendKeys("car");
        repElements.speVal.sendKeys(Keys.ENTER);
//        js.executeScript("arguments[0].scrollIntoView(true);", repElements.prov);
//        repElements.prov.click();
        repElements.gen.click();

    }

}
