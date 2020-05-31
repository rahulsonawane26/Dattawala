package Practise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = null;
		String baseurl;
		String browservalue;

		System.out.println("Enter the Broswer :  ");
		Scanner input = new Scanner(System.in);
		String browser = input.nextLine();

		if (browser.equalsIgnoreCase("chrome")) {
			browservalue = "chrome";

		} else if (browser.equalsIgnoreCase("firefox")) {
			browservalue = "firefox";

		} else {
			System.out.println("Incorrect input");
			throw new Exception("No inputs input");
		}

		System.out.println(
				"***********************************************************************************************");

		System.out.println("Enter the URL :  ");
		String url = input.nextLine();

		if (url.equalsIgnoreCase("google")) {

			baseurl = "https://www.google.com/";
		}

		else if (url.equalsIgnoreCase("facebook")) {

			baseurl = "https://www.facebook.com/";
		} else {
			System.out.println("Incorrect url");
			throw new Exception("url not undertood");

		}

		System.out.println("The browser chosen is " + browser + " and URL is " + baseurl);

		if (browservalue.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browservalue.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		System.out.println("***********************************************************************************************");

		driver.manage().window().maximize();
		driver.get(baseurl);
		Thread.sleep(10000);
		driver.quit();

	}
}
