package seleniumSessions;

public class CustomXpaths {

	public static void main(String[] args) {
		
		//input[@id='input-name']
		//input[@id='input-name' and @type='text' and @class='form-control']
		
		//input[@class and @id='input-name' and @type='text']
		
		//label[text()='Your Name' and @for='input-name']
		//label[contains(text(),'Your Name') and contains(@class,'control-label')]
		
		//label[starts-with(text(),'Your Name')]
		//label[starts-with(@for,'input-name')]
		
		//-    (//input[@id])[2]
		//- (//input[@id='pass']/parent::div/div/div/div/div/input[@placeholder='Enter your company' and @name='company'])[1]
		//input[@id='pass']/preceding-sibling::input[@id='shub51']
		
		
		
		
	}

}
