package tests.greeting;

import common.CommonActions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.base.BaseTest;

import java.time.LocalTime;

import static constant.Constants.Selectors.TITLE_GREETING;
import static constant.Constants.Urls.PAGE_LOGIN;
import static constant.Constants.VariablesOfGreetings.*;


public class LifePay extends BaseTest {
    @Test
    public void CheckTextGreeting() {
        basePage.goToUrl(PAGE_LOGIN);
        LocalTime currentTime = LocalTime.now();

        WebElement titleGreeting = driver.findElement(By.xpath(TITLE_GREETING));
        String greetingText = titleGreeting.getText();

        if (currentTime.isAfter(LocalTime.of(5, 00, 00)) && currentTime.isBefore(LocalTime.of(12, 0, 0))) {
            Assert.assertEquals(GOOD_MORNING, greetingText);
        } else if (currentTime.isAfter(LocalTime.of(11, 59, 59)) && currentTime.isBefore(LocalTime.of(17, 59, 59))) {
            Assert.assertEquals(GOOD_AFTERNOON, greetingText);
        } else if (currentTime.isAfter(LocalTime.of(18, 00, 00)) && currentTime.isBefore(LocalTime.of(22, 59, 59))) {
            Assert.assertEquals(GOOD_EVENING, greetingText);
        } else {
            Assert.assertEquals(GOOD_NIGHT, greetingText);
        }
        System.out.println("Current time is " + currentTime + ", greeting text is: " + greetingText);
    }

}


