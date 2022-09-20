import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SU{
    @Test
public void registerform() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hemamalini.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hema");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mathi");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("hemasri3232@gmail.com");
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("hema@323");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("06");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2001");
        //driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("8939727289");
        driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Looking for a latest samsung mobile");
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
}
    @Test
    public void max_20() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hemamalini.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hemamalinimathialagan");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mathiyalaganmuthaiah");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("hema 3232@gmail.com");
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("hema@323");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("06");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2001");
        //driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("893978");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Looking for a latest samsung mobile");
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        driver.switchTo().alert().accept();
        
        driver.close();
    }
    @Test
    
        public void min_3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hemamalini.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Hem");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mat");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("hema3232@gmail.com");
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("hema@323");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("06/03/2001");
        //driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03");
        //driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2001");
        //driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//div[@class='col-md-3']//input[@name='gender']")).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("89397@#@67");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Looking for a latest Samsung mobile");
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        //driver.switchTo().alert().accept();
        driver.close();
       
    }
}