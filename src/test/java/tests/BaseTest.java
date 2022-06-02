package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.elements.MakingOrderPage;
import pages.elements.LoginRegisterPage;


public class BaseTest {
    public String browser = "chrome";
    public static final int TIMEOUT = 20;
    public WebDriver driver = null;
    public WebDriverWait wait = null;
    public JavascriptExecutor js;
    public static final String URL="http://automationpractice.com/index.php";
    public LoginRegisterPage loginRegisterPage;
    public MakingOrderPage makingOrderPage;
 //   protected static void hoverOver(WebElement element);


    @BeforeMethod
    public void set_up() {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edgedriver.exe");
            driver = new ChromeDriver();
        }else {
            System.out.println("Browser not supported");
        }
        wait = new WebDriverWait(driver,TIMEOUT);
        js = (JavascriptExecutor) driver;
        loginRegisterPage = new LoginRegisterPage(driver,wait);
        makingOrderPage = new MakingOrderPage(driver,wait);


        driver.manage().window().maximize();
        driver.get(URL);


    }
    @AfterMethod
    public void tear_down() {
        driver.quit();

    }

    @Test
    public void test1(){
        System.out.println("successful test");
    }
    public void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
