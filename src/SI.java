import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SI {
            public void signIn() throws InterruptedException
           {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\hemamalini.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                LP landingp = new LP(driver);
                String name =  "Hema2307";
                String password = "Hehk@21";
                landingp.goTo();
                landingp.loginpage(name, password);
                Thread.sleep(2000);
              
           }
            public void signIn2() throws InterruptedException
            {
                String name =  "he3";
                String password ="h1@";
                WebDriver driver = new ChromeDriver();
                LP landingp = new LP(driver);
                landingp.goTo();
                landingp. min3(name, password);
                Thread.sleep(2000);
                driver.quit();
                
                
            }
            public void signIn3() throws InterruptedException
            {
                String name =  "Hemamalinimathiyalagan";
                String password = "hemamalinimuthaiah@123";
                WebDriver driver = new ChromeDriver();
                LP landingp = new LP(driver);
                landingp.goTo();
                landingp.max20(name, password);
                Thread.sleep(2000);
                driver.quit();
                
            }
            public void signIn4() throws InterruptedException
            {
                String name =  "hemama";
                String password = "mathi@332";
                WebDriver driver = new ChromeDriver();
                LP landingp = new LP(driver);
                landingp.goTo();
                landingp.invalid(name, password);
                Thread.sleep(2000);
                driver.quit();
            
            }
}
