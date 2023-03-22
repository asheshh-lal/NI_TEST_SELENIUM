import elements.cms;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class cmsTest extends base_test
{
    cms obj;
    cms.cmsElements cmsElements;

    @BeforeClass
    public void setup()
    {
        super.setup();
        obj = new cms(driver);
        obj.goToNi(driver);
        cmsElements=new cms.cmsElements(driver);
    }

    @Test
    public void providerPf() throws InterruptedException
    {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        Actions a = new Actions(driver);
        Thread.sleep(6000);
        cmsElements.pf.click();
        Thread.sleep(30000);
        cmsElements.state.click();
        cmsElements.stateVal.click();
        cmsElements.stateVal.sendKeys("pen");
        cmsElements.stateVal.sendKeys(Keys.ENTER);
        cmsElements.hrr.click();
        cmsElements.hrrVal.sendKeys("York");
        cmsElements.hrrVal.click();
        cmsElements.hrrVal.sendKeys(Keys.ENTER);
        cmsElements.spe.click();
        cmsElements.speVal.sendKeys("car");
        cmsElements.speVal.sendKeys(Keys.ENTER);
        js.executeScript("arguments[0].scrollIntoView(true);", cmsElements.prov);
        cmsElements.prov.click();
        cmsElements.emb.click();
    }
}
