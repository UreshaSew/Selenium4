
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
   public static void main(String[]args){
       System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.facebook.com/");
       driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("Amal");
//       driver.findElement(By.id("u_0_r")).sendKeys("Perera");
//       driver.findElement(By.id("u_0_u")).sendKeys("1234567891");
//       driver.findElement(By.id("u_0_11")).sendKeys("123");
//driver.findElement(By.id("day")).sendKeys("27");
//driver.findElement(By.id("month")).sendKeys("January");
//driver.findElement(By.id("year")).sendKeys("1990");

   }



}
