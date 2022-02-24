package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDrıver {


    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.6:4444/"), new ChromeOptions());

        driver.get("https://www.amazon.com");
        String currentUrk = driver.getCurrentUrl();
        System.out.println("currentUrk = " + currentUrk);
driver.close();









    }









}
