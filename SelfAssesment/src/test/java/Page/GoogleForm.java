package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleForm {

    WebDriver driver;

    public GoogleForm(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogleForm(){
        driver.get("https://en.wiktionary.org/wiki/Wiktionary:Main_Page");
    }
    public void insertWord(String kata){
        driver.findElement(By.id("searchInput")).sendKeys(kata);
        driver.findElement(By.id("searchButton")).click();
    }

}
