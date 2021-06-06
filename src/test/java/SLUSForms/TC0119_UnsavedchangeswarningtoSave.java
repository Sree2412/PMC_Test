package SLUSForms;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;
import uiActions.ProdspecPageext;

import java.io.IOException;

    public class TC0119_UnsavedchangeswarningtoSave extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void unsavedchangeswarningtosave() {
            log.info("=======started unsavedchangeswarningtosave Test===========");
            ProdspecPageext prodspecPageext = new ProdspecPageext(driver);
            prodspecPageext.unsavedchangewarningtosave_slus();
            Assert.assertEquals(true, prodspecPageext.verifyunsavedchangeswarningtosave());
            log.info("=======Finished unsavedchangeswarningtosave Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }

