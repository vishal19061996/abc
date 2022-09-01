package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginActiTime(flib.readPropertyFile(PROP_PATH, "username"), flib.readPropertyFile(PROP_PATH, "password"));
		Thread.sleep(5000);
		HomePage hp = new HomePage(driver);
		hp.logoutActitime();
		
	}

}

