package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rep
{
    rep.repElements repElements;

    public rep(WebDriver driver)
    {
        repElements = new rep.repElements(driver);
    }

    public void goToNi(WebDriver driver) {
        driver.get("https://asheshlalshrestha.cotiviti.com/");
    }

    public static class repElements
    {
        public repElements(WebDriver driver)
        {
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[2]/a[1]/img[1]")
        public WebElement rep = null;

        @FindBy(xpath = "//*[@id=\"username\"]")
        public WebElement userName = null;

        @FindBy(id = "password")
        public WebElement pw = null;

        @FindBy(xpath = "//*[@id=\"fm1\"]/div[3]/div[1]/input[3]")
        public WebElement log = null;

        @FindBy(id = "toggle-master-mode")
        public WebElement masterMode = null;

        @FindBy(xpath = "//*[@id=\"auth-content\"]/div/div[5]/div/button")
        public WebElement logIn = null;

        @FindBy(xpath = "//span[contains(text(),'Create new')]")
        public WebElement create = null;

        @FindBy(xpath = "//div[contains(text(),'CMS Provider Profiles Report')]")
        public WebElement provRep = null;

        @FindBy(xpath = "//span[contains(text(),'state')]")
        public WebElement state=null;

        @FindBy(xpath = "//body/div[@id='modal']/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
        public WebElement stateVal=null;

        @FindBy(xpath = "//span[contains(text(),'hrr')]")
        public WebElement hrr=null;

        @FindBy(xpath = "//body/div[@id='modal']/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
        public WebElement hrrVal=null;

        @FindBy(xpath = "//span[contains(text(),'specialty')]")
        public WebElement spe=null;

        @FindBy(xpath = "//body/div[@id='modal']/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
        public WebElement speVal=null;

        @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/svg[1]/g[18]/text[1]")
        public WebElement prov=null;

        @FindBy(xpath = "//button[contains(text(),'Generate')]")
        public WebElement gen=null;

    }
}
