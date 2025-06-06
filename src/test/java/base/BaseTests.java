package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    //object
    private WebDriver driver;

    //create method
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //now instantiate the webdriver object
        driver = new ChromeDriver();
        driver.get("https://www.nike.com/za/?cp=85135377279_search_&Macro=-nike%20south%20africa-g-10678360682-103658242925-e-c-EN-extended-452163089502-kwd-301610651417-9195590&ds_rl=1252249&gad_source=1&gad_campaignid=10678360682&gbraid=0AAAAADq9vlNCDSd4wb5jnbHuNV9AsRBlX&gclid=CjwKCAjwo4rCBhAbEiwAxhJlCatdULgDqkwpVdPI7EI6R39mFXGd7H9RAJbnchfvGepXxHaqx7OW5xoCcHsQAvD_BwE&gclsrc=aw.ds");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

//        driver.manage().window().maximize();
        WebElement inputsLink = driver.findElement(By.xpath("//*[@id=\"gen-nav-commerce-header-v2\"]/nav/header/div/div/div[2]/nav/ul/li[1]/div/a"));
        inputsLink.click();

        List<WebElement> sizes = driver.findElements(By.tagName("div"));
        System.out.println(sizes.size());

        WebElement imageLink = driver.findElement(By.xpath("//*[@id=\"skip-to-products\"]/div[1]/div/figure/a[2]/div/img"));
        imageLink.click();

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
