package functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
<<<<<<< Updated upstream

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Illya on 07.11.2014.
=======
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bionic on 11/5/14.
>>>>>>> Stashed changes
 */
public class FunctionalTest {

    public static WebDriver driver;
<<<<<<< Updated upstream
    public static final String BASE_URL = "http://hotline.ua";

    @BeforeSuite
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown () {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");  //cause Firefox crashes on .quit();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (driver != null) {
            driver.quit();
        }
    }

=======

    @BeforeSuite
    public void setUP () {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test

    @AfterSuite
    public void tearDown() {

    }
>>>>>>> Stashed changes
}
