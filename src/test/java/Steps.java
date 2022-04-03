import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class Steps {

    private Basket basket;

    private PageMain pageMain;

    public Steps() {
        pageMain = PageMain.getPage();
        basket = Basket.getBasket();
    }

    public void personalAccountAndOrderStatusVisible(){
        pageMain.getPersonalAccount().shouldBe(visible).shouldBe(enabled).shouldNotHave(Condition.attribute("class", "disabled"));
        pageMain.getOrderStatus().shouldBe(visible).shouldBe(enabled).shouldNotHave(Condition.attribute("class", "disabled"));
    }


    public void compareAndFavoritesAndBasketShouldVisibleAndDisabled(){
    pageMain.getCompare().shouldBe(visible).shouldHave(Condition.attribute("class", "disabled"));
    pageMain.getFavorites().shouldBe(visible).shouldHave(Condition.attribute("class", "disabled"));
    pageMain.getBasketGoods().shouldBe(visible).shouldHave(Condition.attribute("class", "disabled"));
    }

    public void basketGoodsActive() {
        pageMain.getBasketGoods().shouldBe(visible).shouldBe(enabled).shouldNotHave(Condition.attribute("class", "disabled"));
    }

    public void scrollAllContainers(){
        pageMain.scrollAllPage();
    }


//    public void checkVisibleMostViewed(){
//        boolean checkVisibleMostViewed = pageMain.getMostViewed();
//        Assert.assertTrue(checkVisibleMostViewed);
//    }

    public void clickButton() {
        pageMain.clickButtons(0);
        pageMain.clickButtons(1);
    }


    public void blockGoodsOfDayShouldBeExist() {
        pageMain.getBlockGoodsOfDay().shouldBe(exist);
    }

    public void blockShouldBeText () {
        pageMain.elementShouldBeText(pageMain.getBlockGoodsOfDay(), "Скидка");
        pageMain.elementShouldBeText(pageMain.getBlockGoodsOfDay(), "В корзину");
    }

    public void clickButtonBlockGoods() {
        pageMain.getButtonGoodsOfDayInBasket().click();
    }

    public void bubbleExist() {
        pageMain.getBubble().shouldBe(text("1"));
    }

    public void clickBasket() {
        pageMain.getBasketGoods().click();
    }

    public void urlCompare (String url_2){
        String url_1 = WebDriverRunner.url();
        Assert.assertEquals(url_1,url_2);
    }

    public void stringCompare(String str_1, String str_2){
        Assert.assertEquals(str_1, str_2);
    }

//    public String getTextNameInBasket(){
//        return basket.getNameInBasket().getText();
//    }

    public String getTextPriceSale(){
        return basket.getPriceSale().getText().replace("¤", " ");
    }

    public String getTextPriceOrder(){
        return basket.getPriceOrder().getText().replace("¤", " ");
    }

//    public String getTextPriceFirstGoodOfDay(){
//        return pageMain.getPriceFirstGoodOfDay().getText();
//    }
//
//    public String getTextNameFirstGoodOfDay(){
//        return  pageMain.getNameFirstGoodOfDay().getText();
//    }

    public int getPriceSaleInt_1(int i){
        return basket.getPriceSaleInt(i);
    }

    public int getPriceOrderInt(){
        return basket.getPriceOrderInt();
    }

    public void checkSum (){
        int sum = getPriceSaleInt_1(0) + getPriceSaleInt_1(1);
        int sumOrder = getPriceOrderInt();
        Assert.assertEquals(sum, sumOrder);
    }

    public void checkGetHeaderTitleBasket(){
        boolean checkGetHeaderTitleBasket = basket.getHeaderTitleBasket();
        Assert.assertTrue(checkGetHeaderTitleBasket);
    }

    public void checkGetProductCardInBasket(){
        boolean checkGetProductCardInBasket = basket.getProductCardInBasket();
        Assert.assertTrue(checkGetProductCardInBasket);
    }

    public void checkGetButtonGoToRegistration(){
        boolean checkGetButtonGoToRegistration = basket.getButtonGoToRegistration();
        Assert.assertTrue(checkGetButtonGoToRegistration);
    }

    public String getTextStringInBasketCountGoods(){
        return basket.getStringInBasketCountGoods().getText();
    }

















}
