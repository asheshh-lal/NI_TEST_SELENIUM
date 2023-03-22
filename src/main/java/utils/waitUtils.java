package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitUtils {
    WebDriver driver = new ChromeDriver();
    WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));
}
