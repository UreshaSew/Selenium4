import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().fullscreen();

      //  driver.navigate().to("https://egig2go.com/egig_qa/");
//String baseurl = "https://egig2go.com/egig_qa/";   >> Example 1 start
//        driver.manage().window().maximize();
//String expectedTitle = "Egig2go";
//String actualTitle ="";
//driver.get(baseurl);
//if(actualTitle.contentEquals(expectedTitle)) {
//    System.out.println("Test Passed");
//}else{
//    System.out.println("Test Failed");
//}   >> Example 1 end


String baseurl ="https://www.facebook.com/";
        String tagname ="";
        driver.get(baseurl);
        tagname = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagname);
            }

        }



