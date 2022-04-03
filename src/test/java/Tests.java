import com.codeborne.selenide.*;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Tests {

    @BeforeMethod
    public void beforeMethod() {
        Configuration.pageLoadTimeout = 100000;
        Selenide.open("https://www.mvideo.ru/");
    }

    @AfterMethod
    public void afterMethod() {
        closeWebDriver();
    }


    @Test
    public void test_1() {
        Steps steps = new Steps();
        steps.personalAccountAndOrderStatusVisible();
        steps.compareAndFavoritesAndBasketShouldVisibleAndDisabled();
    }

    @Test
    public void test_2() {
        Steps steps = new Steps();
        steps.blockGoodsOfDayShouldBeExist();
        steps.blockShouldBeText();
        steps.clickButtonBlockGoods();
        steps.basketGoodsActive();
        steps.bubbleExist();
    }

    @Test
    public void test_3() {
        Steps steps = new Steps();
        steps.blockGoodsOfDayShouldBeExist();
        steps.blockShouldBeText();
        steps.clickButtonBlockGoods();
        steps.basketGoodsActive();
        steps.bubbleExist();
        steps.clickBasket();
        steps.urlCompare("https://www.mvideo.ru/cart");
        steps.checkGetHeaderTitleBasket();
        steps.checkGetProductCardInBasket();
        steps.checkGetButtonGoToRegistration();
        steps.stringCompare(steps.getTextStringInBasketCountGoods(), "В корзине 1 товар");
        steps.stringCompare(steps.getTextPriceSale(), steps.getTextPriceOrder());
    }

    @Test
    public void test_4() {
        Steps steps = new Steps();
        steps.scrollAllContainers();
        steps.clickButton();
        sleep(3000);
        steps.clickBasket();
        steps.checkGetProductCardInBasket();
        steps.checkSum();
    }

}

