package tests.website;

import org.junit.Test;
import tests.base.BaseTest;

import static constant.Constants.Urls.PAGE_LOGIN;

public class ResourceAvailable extends BaseTest {
    @Test
    public void GoToUrl() {
        basePage.goToUrl(PAGE_LOGIN);
    }
}
//smoke test for check parallel launch tests
