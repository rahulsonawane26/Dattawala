package Practise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFF {

	public static void main(String[] args) throws Exception {

		WebDriver driver;

		int browserselection, urlselection;
		String browser = null, url = null;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for Chrome and Enter 2 for Firefox");

		browserselection = input.nextInt();

		switch (browserselection) {

		case 1:
			browser = "chrome";
			break;
		case 2:
			browser = "firefox";
			break;
		default:
			System.out.println("Incorrect Selection");
			throw new Exception("Browser not valid");
		}

		System.out.println("Enter 1 for google and Enter 2 for facebook");

		urlselection = input.nextInt();

		switch (urlselection) {

		case 1:
			url = "https://www.google.com/";
			break;
		case 2:
			url = "https://www.facebook.com/";
			break;
		default:
			System.out.println("Incorrect Selection");
			throw new Exception("URL not valid");

		}

		System.out.println("The browser chosen is " + browser + " The URL chosen is " + url);

		if ((browser.equalsIgnoreCase("chrome")) && (url.equalsIgnoreCase("https://www.google.com/")
				|| url.equalsIgnoreCase("https://www.facebook.com/"))) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			driver.close();

		} else if ((browser.equalsIgnoreCase("firefox")) && (url.equalsIgnoreCase("https://www.google.com/")
				|| url.equalsIgnoreCase("https://www.facebook.com/"))) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			driver.close();
		}

	}

}
