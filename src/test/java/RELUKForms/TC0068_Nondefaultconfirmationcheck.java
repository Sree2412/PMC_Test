
package RELUKForms;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.testBase;
import uiActions.ProdspecPage;

import java.io.IOException;


    public class TC0068_Nondefaultconfirmationcheck extends testBase {
        ProdspecPage prodspecPage;

        @BeforeClass
        public void setUp() throws IOException, InterruptedException {
            init();
        }

        @Test
        public void nondefaultvalueselectionconfirmationcheck() {
            log.info("=======started nondefaultvalueselectionconfirmationcheck Test===========");
            ProdspecPage prodspecpage = new ProdspecPage(driver);
            prodspecpage.nondefaultconfirmationcheck_reluk();
            Assert.assertEquals(true, prodspecpage.verifynondefaultvalueconfirmationchecked());
            log.info("=======Finished nondefaultvalueselectionconfirmationcheck Test===========");
        }

        @AfterClass
        public void endTest() {

            closeBrowser();
        }
    }








