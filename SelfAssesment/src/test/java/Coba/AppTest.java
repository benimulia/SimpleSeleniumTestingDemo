package Coba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;

    @Before
    public void initiate() {
        System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver();
        System.out.println("Chrome browser is open");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void end() {
        driver.close();
        System.out.println("FINISH");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGoogleForm()
    {
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/viewform");
        WebElement radioMagang = driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i11']"));
        radioMagang.click();
        //System.out.println(radioMagang.isSelected());
        driver.findElement(By.xpath("//span[text()='Berikutnya']")).click();

        //isi data next page
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i1']")).sendKeys("BENI MULIA TABARUS");
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i5']")).sendKeys("3471011603990001");
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i9']")).sendKeys("088216152324");
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i13']")).sendKeys("IT-ECO");
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i17']")).sendKeys("HIMAWAN DJAJA");
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i21']")).sendKeys("081319332818");
        driver.findElement(By.xpath("//span[text()='Berikutnya']")).click();

        //next page
        driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i8']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @aria-labelledby='i11']")).sendKeys("-");
        driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i22']")).click();
        driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i32']")).click();
        driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i42']")).click();
        driver.findElement(By.xpath("//span[text()='Berikutnya']")).click();

        //next page
        
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[14]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[16]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[18]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[20]/span/div[3]/div/div/div[3]/div")).click();

        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[22]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[24]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[26]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[28]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[30]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[32]/span/div[3]/div/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[34]/span/div[3]/div/div/div[3]/div")).click();

        driver.findElement(By.xpath("//div[contains(@role ,'radio') and @id='i12']")).click();
        driver.findElement(By.xpath("//span[text()='Berikutnya']")).click();

        driver.findElement(By.xpath("//span[text()='Kirim']")).click();


    }
}
