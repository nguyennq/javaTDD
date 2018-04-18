package vn.nguyen.Model;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nals on 4/18/18.
 */

@Config(
        browser = Browser.SAFARI,
        url     = "http://seleniumhq.org",
        hub = ""
)
public class HomePageTest extends Locomotive{

    @Test
    public void testDownloadLinkExists() {
        validatePresent(HomePage.LOC_LNK_DOWNLOADSELENIUM);
    }

    @Test
    public void testTabsExist() {

    }

}