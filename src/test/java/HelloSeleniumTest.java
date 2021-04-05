//https://www.youtube.com/watch?v=aIfP8rOx66E&list=LL&index=2

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {
    @Test
    public void amazon() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void ebay() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void typesOfLocators() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement element;
        element = driver.findElement(By.id("user-name"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("form_input"));
        driver.findElement(By.tagName("input"));
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        driver.quit();

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.findElement(By.linkText("Click me using this link text!"));
        driver.findElement(By.partialLinkText("link text!"));
        driver.quit();

        //3/13/21
        //inspect element tools
        ////*[@=""] = xpath
        //head/a/
        ////*[containts(text(),')]
        //

        //3/14/21
        //find and act
        //driver.findElement(By.id("sign-in")).click();
        ////*[containts(text(),')]/parent::div
        //signIn.getText();
        //signIn.getTagName();
        //signIn.getAttribute();
        //signIn.isDisplayed();
        //signIn.isEnabled();
        //WebElement element = driver.findElement(By,id("sign-in"))
        //Actions action = new Actions(driver);
        //action.click(element).build().perform();

        //3/17/21
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("aler('Hello World');");
        //String originalWindow = driver.getWindowHandle():
        //Set Handels - driver.getWindowhandels();
        //handles.remove(originalWindow);
        //String nextWindow = String.valueof(handles.iterator().next());
        //driver.switchTo().window(nextWindow);
        //assertEquals("new window", drover.getTitle());
        //driver.switchto().window(originial);
        //assertEquals("the interneet", driver.getTitle());
        
        
    }
    
    public static class datatypes {

        public static void main(String[] args) {
            int i = 4523;   //Can store 32 bit integer values only.
            long l = 652345;  //Can store 64 bit integer values only.
            double d1 = 56.2354;         //Can store 64 bit decimal values.
            double d2 = 12456;  //We can use it for integer values too.
            char c = 'd';   //Can store single character only.
            boolean t = true;  //Can store only boolean values like true or false.
            String str = "Hello World";  //Can store any string values.

            System.out.println("Integer Var Is --> "+i);
            System.out.println("Long Var Is --> "+l);
            System.out.println("double Var d1 Is --> "+d1);
            System.out.println("double Var d2 Is --> "+d2);
            System.out.println("char Var c Is --> "+c);
            System.out.println("boolean Var b Is --> "+t);
            System.out.println("boolean Var str Is --> "+str);
        }
    }
}