package step_definitions;
import java.io.IOException;
import java.util.Properties;

import helpers.ObjectRepository;
import modules.Click;
import modules.ContactusModule;
//import modules.Driver;
import modules.SignInModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class KeywordDrivenFramework {
    public WebDriver driver;
    public Properties OR;
    public KeywordDrivenFramework() throws IOException {
    	driver = Hooks.driver;
    	
    	
     	OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir")+"//src//test//resources//OR.properties");
    }
 
    

       
    
    
    
        
    @When("^I open \"(.*?)\" website$")
    public void i_open_website(String arg1) throws Throwable {
        driver.get(arg1);
    }
    @Then("^I login using credentials \"(.*?)\" and \"(.*?)\"$")
    public void i_login_using_credentials_and(String arg1, String arg2) throws Throwable {
        SignInModule.Execute(driver,OR,arg1,arg2);
    }
    @Then("^I contact customer service with order reference \"(.*?)\" and message \"(.*?)\"$")
    public void i_contact_customer_service_with_order_reference_and_message(String arg1, String arg2) throws Throwable {
        ContactusModule.Execute(driver,OR,arg1,arg2);
    }
    
    @Then("^Click \"(.*?)\"$")
    public void click(String arg1) throws Throwable {
    	System.out.println(arg1);
    	Click.Clickbtn(driver,OR,arg1);
    	}
    
    
    @When("^Clickid \"(.*?)\"$")
    public void clickid(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    	Click.Clickbtnid(driver,OR,arg1);
    }
    
    
    @Then("^verify the \"(.*?)\"$")
    public void verify_the(String arg1) throws Throwable {
    	System.out.println(arg1);
      Click.Visible(driver, OR, arg1);
    }

    @When("^Open \"(.*?)\"$")
    public void open(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // Driver.Opencore(OR, arg1);
    }
    
    public static String Surname;

@When("^Enter \"(.*?)\" as \"(.*?)\"$")
public void enter_as(String arg1, String arg2) throws Throwable {
	
	if(arg1.equals("Surname"))
		
	{
		
		 Surname=arg2;
	}
	
   Click.Entertext(driver, OR, arg1, arg2);
   
  
	   
	  
  
   ;
}



    @When("^Switchtowindow$")
    public void switchtowindow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	try {

    		String title = driver.getTitle();
    		System.out.println("title before switch"+title);

            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
                
                String title1 = driver.getTitle(); 
                System.out.println("title after switch"+title1);
            }
            }catch(Exception e){
            System.out.println( "Unable to Switch Window" + e.getMessage());
            }
    }

    
    @When("^Acceptalert$")
	public void acceptalert() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		Alert alert = driver.switchTo().alert();
	    alert.accept();
		
	}
    
    @Then("^Select \"(.*?)\" from \"(.*?)\"$")
    public void select_from(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       Click.Selectfromthelist(driver, OR, arg1,arg2);
    }

	
	
	
	@Then("^Get \"(.*?)\" and \"(.*?)\"$")
	public void get(String UMRN ,int Rownum) throws Throwable {
	   
		
		
		
		Click.gettext(driver, OR, UMRN,Rownum, Surname);
		
		
	
	    
	}
    
    
    
    
    
    
    
    
    
    
    @When("^Switchtoframe$")
    public void switchtoframe() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	try {

    		driver.switchTo().frame("menu");
    		System.out.println("In frame menu ");
            }
            catch(Exception e){
            System.out.println( "Unable to Switch Window" + e.getMessage());
            }
    }
    
 
    
    @When("^Switchtoframe1$")
    public void switchtoframe1() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	try {

    		WebElement body =driver.findElement(By.cssSelector("body"));
    		
    		System.out.println(body.getText());
    		driver.switchTo().defaultContent();
    		
    		driver.switchTo().frame(1);
    		
    		System.out.println("In frame 1  ");
    		//driver.wait(1000);
            }
            catch(Exception e){
            System.out.println( "Unable to Switch Window frame1" + e.getMessage());
            }
    
    
    
    	
    	
    	
    	
    }
    	
}