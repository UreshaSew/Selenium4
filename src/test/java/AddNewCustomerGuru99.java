import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewCustomerGuru99 {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");

        driver.findElement(By.name("name")).sendKeys("Kaveesha Rathnayake");
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.id("dob")).sendKeys("27/05/1996");
        driver.findElement(By.name("addr")).sendKeys("Parkland Street" +
                "Colombo ");
        driver.findElement(By.name("city")).sendKeys("Colombo");
        driver.findElement(By.name("state")).sendKeys("SriLanka");
        driver.findElement(By.name("pinno")).sendKeys("123490");
        driver.findElement(By.name("telephoneno")).sendKeys("0751234567");
        driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");

    }
}

