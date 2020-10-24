package day2;

public class DemoWebDriver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		ChromeDriver chromeDriver = new ChromeDriver();

		chromeDriver.chromeSettings();
		
		WebDriver webDriver = new WebDriver() {
			
			@Override
			public void refresh() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void get(String url) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
