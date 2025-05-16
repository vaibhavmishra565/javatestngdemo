package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter14CoustomCssSelectors {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		int registerImpElementsCount = driver
				.findElements(By.cssSelector(
						"input#input-firstname , input#input-lastname , input#input-email , input#input-telephone"))
				.size();
		if (registerImpElementsCount == 4) {
			System.out.println("Register page elements are present");
			System.out.println("total number of elements are "+ registerImpElementsCount);
		}
		else {
			System.out.println("Fail");
		}

//		driver.get("https://orangehrm.com/en/30-day-free-trial");

//		List<WebElement> countryNames= driver.findElements(By.cssSelector("select[name=\"Country\"]>option"));
//		for (WebElement e : countryNames) {
//			String text=e.getText();
//			System.out.println(text);

//		}

		// css >> cascaded style sheet
		// used for the formatting , look and feel of the page
		// css slector is a locator

//		when there is id in the CSS 
//		#id
//		for eg #username
//		or we can use by tag also 
//		for eg >> input#username

//		When there is a class we USE .
//		 for eg form-control private-form__control
//		here there was two class 
//		 we  can use multiple class as .c1.c2.c3.cn like that 
//		or we can use like only .c2.c3
//		or .c1.c3 
//		or we can use by tagname also
//		tagname.classname 

//		Use of both id and class name also 
//		#id.class
//		or .class#id also 
//		or we can use like tagname.class#id
//		or .c1#id.c2 also 

//		//////////////////// if there is no class or the id //////////////////////////////
//		tagname[attribute = 'value']
//		for eg input[placeholder='E-Mail Address']
//		also we can use with class and id also 
//		for eg input[id='input-email']

//		or we can use as with multiple attribute as 
//		tagname[arrti1='value'][attri2='value']etc 
//		tag name[atrri1='value'][Attri2='value']#id 
//		?for eg  input[name="email"][placeholder="E-Mail Address"]#input-email

		/////////////////////////////////////////////////////////////////////////////////
		// there is no Text() in css
//		there is no support of text method and is the major draw back of css
		////////////////////////////////////////////////////////////////////////////////
//		Contains 
//		we can use contains tag[Attri*='value']
//		for eg input[placeholder*='E-Mail']

//		starts-with 
//		we can use start with as tag[attri^='value']
//		for eg input[placeholder^='E-Mail']

//		ends with which is not present in Xpath 
//		we can use as rag[attri$='value']
//		for eg input[placeholder$='Address']

		//////////////////////////////////////////////////////////////////////////////
//		parent child (indirect + direct)
//		we use space between tags 
//		parenttag childtag
//		for eg form div

//		parent child (direct)
// 		we use >
//		parenttag>childtag 
//		for eg form>div

		////////////////////////////////////////////
//		Child to parent >>> is not possible 
//		backward traversing is not possible in css selector 

//		///////////////////////////////// 
//		sibling concept is not for the preceding sibling 
//		for forward sibling we use like tag+tag(following sibling)
//		label[for="input-email"] +input

//		select#Form_getForm_Country>option[value="Afghanistan"]+option >>>>  + is for only the imediate sibling  
//		select#Form_getForm_Country>option~option is used for all the following sibling
		//////////////// chapter 15///////////////////////////////////////
		////////////////////////////// index in CSS
		//////////////// /////////////////////////////////////////////////////

//		when wev have to find the direct child 
//		select#Form_getForm_Country>option >> gives all the direct child values 
//		select#Form_getForm_Country>option:nth-of-type(2) >>> gives the value of the seconfd option
//		select#Form_getForm_Country>option:nth-of-type(n) >>> gives all the n number of the options (all options)

//		select#Form_getForm_Country>option:first-child >> used for fetching first child 
//		select#Form_getForm_Country>option:last-child  >> used to fetch last child

//		select#Form_getForm_Country>option:nth-child(2) >> gives the value of 2nd child 
//		select#Form_getForm_Country>option:nth-last-child(2) >>>> gives the second last child 
//		select#Form_getForm_Country>option:nth-last-child(n) >>> this gives all the n child

//		select#Form_getForm_Country>option:nth-child(odd) >>> gives all the odd child 
//		select#Form_getForm_Country>option:nth-child(even) >>> gives all the even child

//		select#Form_getForm_Country>option:nth-child(n+5) >> starts from the 5th child 
//		select#Form_getForm_Country>option:nth-child(5n) >> covers all the multiple of 5 , as 5th child , 10th , 15th

//		/////////////////////////////X path for ebeven and odd elements///////////////////
//		//select[@id='Form_getForm_Country']/option[position()mod 2=1] is for odd element as mod 2=1 means its a odd position 
//		//select[@id='Form_getForm_Country']/option[position()mod 2=0] is for even element 

		//////////////////////////////////// COMMA IN CSS
		//////////////////////////////////// ///////////////////////////////////////
//		WE can use multiple webelement by using comma in CSS
//		for eg input#input-firstname , input#input-lastname , input#input-email , input#input-telephone
		
		
	/////////////////////////////////// NOT FUNCTION IN css //////////////////////////////////////
//		for eg input.form-control:not(input[name="search"]):not(input[placeholder="Password"])
		
		
	}

}
