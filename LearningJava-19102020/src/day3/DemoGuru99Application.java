package day3;

public class DemoGuru99Application {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();

		try {

			guru.invokeBrowser();

			guru.login();

			guru.addCustomer();

			guru.addAccount();

			guru.logout();

			guru.closeBrowser();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			guru.closeBrowser();
		}

	}

}
