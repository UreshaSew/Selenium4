import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       // driver.get("https://www.facebook.com");
       // driver.findElement(By.id("email")).sendKeys("vpusewwandi@gmail.com");
       // driver.findElement(By.id("pass")).sendKeys("uresha19");
       // driver.findElement(By.id("loginbutton")).click();
        //System.out.println("logged in successfully");

        //There are two methods to get web address
        // method 1    -     driver.get("https://www.google.lk/");

        driver.navigate().to("https://www.google.lk/"); // method 2
        driver.findElement(By.name("q")).sendKeys("cat");
        //driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.id("btnK")).click();


    }
}
