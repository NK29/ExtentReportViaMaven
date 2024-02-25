package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class openGoogle {

    public static void main(String[] args) {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        ExtentTest test = extentReports.createTest("whatup duck");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.google.co.in");
        
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("whatup duck!");
        searchBox.submit();
        
        test.log(Status.PASS, "Test passed");
        
        driver.quit();
        extentReports.flush();
    }
}

