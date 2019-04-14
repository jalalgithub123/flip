package com.sample.flip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\CUCUMBER\\FaceBookTest\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMI58Wm5O7P4QIVEiQrCh1VEwk8EAAYASAAEgKX-PD_BwE&ef_id=EAIaIQobChMI58Wm5O7P4QIVEiQrCh1VEwk8EAAYASAAEgKX-PD_BwE:G:s&s_kwcid=AL!739!3!339091972992!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
	
}
}
