package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapte11coustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com%2Fhs-home&hubs_signup-cta=nav-utility-login&hubs_content=www.hubspot.com%2Fhs-home&hubs_content-cta=nav-utility-login&uuid=e5983f42-f3c7-4047-8cef-0de6b4d454ce&_gl=1*t7v62y*_gcl_au*NzE0MTAwNjAyLjE3NDM0ODUyNjM.*FPAU*NzE0MTAwNjAyLjE3NDM0ODUyNjM.*_ga*MjAyODY4MzAwOS4xNzQzNDg1MjYz*_ga_LXTM6CQ0XK*MTc0MzQ4NTI2Mi4xLjEuMTc0MzQ4NTI2My41OS4wLjA.*_fplc*UTZsQ0tyTFc0c2NPQkdlUHQlMkJUNllRdzY3d2s2SW1kbHc5cUVyYyUyQiUyRktHMkZxaDdtQVNpOEJ0N0QlMkJxYzFPcDZqUnhYZG5ndnNCd1E5bXJrZlhRMG50RWVjUmxlZHVwbU9vTjZrRFFqdDFxeEJ4c3ZEcnlGVU1yM2E0aWFZQmclM0QlM0Q.");
// 		Xpath >> Its Html Xpath >> it is the addreess of the element in DOM 
//		Dom : Is the HTML + XML 

//		There are two types of Xpath 
//		1.Absoloute X path  >> it stsrt from / > its the whole path from Start of DOM to end of DOM for eg 
//		/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
//		2. relative Xpath >> It includes the relative attributes of the element 
		// it start from //
//		for eg // htmlTag[@attribute 'value'] 
//		//input[@type='text']
//		//input[@id="input-email"]
//		//input[@name="email"]

//		Relative path can be combination of two atrributes also 
//		for eg
//		// input[@type='text'and @name="email" and @id='input-email']
//		our end result is to filter out only one result 

//		in Xpath when text is attribute 
//		we use text as a function for eg 
//		text()
//		formula for this 
//		//htmltag[text()='value']
//		for eg //a[text()='Forgotten Password']
//		//h2[text()='New Customer']

//		or is used when either of the two attributes is present 
//		input[@type='text'or @name="email" or @id='input-email']

//		******************** all the links by xpath ******************************
//		//a
		// img
		// href etc
//		for amazon

		// a[@href]>>380
		//a[not(@href)] >>11// for findinding out whose href are not there
//		contains function
//		//htmltag[contains(attribute , 'value')]
//		for eg //input[contains(@name ,'first')]
//		also //htmltag[contains(@attr1 , 'value')and contains (@attri2 , 'value')]
//		for eg //input[contains(@name ,'first')and contains(@placeholder , 'Name')]
//		also this can happen one with cinatains and other without contains
//		//htmltag[contains(@atrr1 , 'value')and @attri2 = 'value']
//		//input[contains(@name , 'first') and @placeholder ='First Name']
//		also 
//		//htmltag[@attri1 ='value'and conatains(@attri2 ,'value')]
//		//input[@name='firstname' and contains(@placeholder ,'Name')]
//		another with text function 
//		htmltag[contains(text(), 'value' )]
//		for eg 
//		//h1[contains(text() , 'Register Account')]
//		//legend[contains(text() , 'Your Personal Details')]
//		//p[contains(text() ,'creating an account you will be able to shop faster, be up to date on an')]
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
//		Dynamic ID
//		eg <input id="firstname_123">
//		eg <input id="firstname_456"> then in this case
//		//input[contains(@id , 'firsname_')]
//		eg//input[contains(@name , 'email' )]
		
		///////////////////////////////////////////////////////////////////
//		contains with attribute and no contains with text 
//		//htlmtag[contains(@attri , 'value') and text()='value']
//		for eg //a[contains(@class ,'primary') and text() ="123"  ]
		////////////////////////////////////////////////////////////////////
//		contains with attribute and contains with text also
//		//htmltag[contains(@attr,'value') and contains(text() , 'value')]
//		for eg //a[contains(@href ,'index') and contains (text() , 'Wish') and contains(@class, 'list-group-item')]
//		/////////////////////////////////////////////////////////////
//		starts-with() ...... shows whatever attribute starts with 
//		//htmltag[starts-with(@attri , 'value')]
//		for eg //input[starts-with(@placeholder , 'First')]
//		also // htmltag[starts-with(text() , 'value')]
//		for eg //h1[starts-with(text() , 'Register')]
//		there is no ends with function 
		///////////////////////////////////////////////////////////////////////
//		driver.findElement(By.className("form-control private-form__control"));// Compound class names not permitted
//		as there are multiple classes which are seperated by space 
//		but for x path compound class can be used 
		
//        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//input[@class ='form-control private-form__control']"));
		//input[contains(@class , 'btn')]
//		also contains can be used 
//		driver.findElement(By.xpath("//input[contains(@class , 'btn')]")).click();
		
//		driver.findElement(By.xpath("//input[contains(@@@@class , 'btn')]/option")).click(); // invalid slector exception 
//	    if the attribute is wrong then it is no such element exception 
//		////////////////////////////////////////////////////////////////////////////////////////
		
//		indexing and group capture ////////////////////////////////////
//		(//a[text() ='Forgotten Password'])[1] here this whole is the group capture 
//		1 and 2 in square bracket is indexing 
		
		
		
		
		

	}

}
