package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
public static void main(String[] args)  {
	FirefoxDriver driver = new FirefoxDriver ();
	driver.get("https://www.monsterindia.com");
	Select select =new Select(driver.findElement(By.xpath("/html/body/div[1]/header/header/div/div[2]/div/div/nav/div[1]/ul[1]/li[1]/label/a")));
	select.selectByValue("3");
}
}
	
	