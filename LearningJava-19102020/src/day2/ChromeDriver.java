package day2;

public class ChromeDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Navigate to URL - "+ url);
		
	}

	@Override
	public String getTitle() {
		String title = "Simpli Learn";
		return title;
	}

	@Override
	public void refresh() {

		System.out.println("Refresh page");
		
	}
	
	public void chromeSettings() {
		System.out.println("Define chrome browser settings...");
	}

}
