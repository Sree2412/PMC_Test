package HomePage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.HomePage;

import java.io.IOException;

public class TC0002_CreatenewForm_SL_US extends testBase {
    uiActions.HomePage Homepage;

    //uiActions.DesiredCapability desiredCapability;
    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        init();
    }

    @Test
    public void createNewFormslus() {
        log.info("=======started NewFormcreation Test===========");
        HomePage homepage = new HomePage(driver);
        homepage.NewFormcreation_slus();
        Assert.assertEquals(true, homepage.getProjectInformationheader());
        log.info("=======Finished NewFormcreation Test===========");
    }

    @AfterClass
    public void endTest() {

        closeBrowser();
    }

}
