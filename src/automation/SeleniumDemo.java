package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
public static void main(String[] args) {
	String driverPath = "C:\\Users\\gurpr\\git\\testrepository1\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	By searchBox = By.id("user-name"); // locator strategy
	WebElement searchBoxElement = driver.findElement(searchBox); //find element with LS
	searchBoxElement.sendKeys("Standard_user"); //Action

    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    
    By loginBtn By.id("login-button");
    WebElement login = driver.findElement(loginBtn);
    login.click();
    
    By dropdown = By.className("product_sort_container");
    WebElement dropElem = driver.findElement(dropdown);
    Select dropDownSelect = new Select(dropElem);
    dropDownSelect.selectByValue("lohi");
}
}
