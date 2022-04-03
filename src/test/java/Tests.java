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













//    @Test
//    public void test_2() {
//        Configuration.pageLoadTimeout = 90000;
//        Selenide.open("https://www.mvideo.ru/");
        //div[@class = 'carousel']

    /*    Steps steps = new Steps();
        steps.blockGoodsOfDayShouldBeExist();
        steps.blockShouldBeText();
        steps.clickButtonBlockGoods();
        steps.basketGoodsActive();
        steps.bubbleExist();*/



//        $(By.xpath("//div[@class = 'carousel']")).shouldBe(visible).shouldHave(text("Скидка")).shouldHave(text("В корзину"));
//        $(By.xpath("//mvid-day-products-block//mvid-day-product[2]/button")).click();
//        steps.basketGoodsActive();
//        $(By.xpath("//mvid-bubble")).shouldBe(exist).shouldBe(text("1"));
//
      //  Configuration.holdBrowserOpen = true;
  //  }

//    @Test
//    public void test_3() {
//        Configuration.pageLoadTimeout = 90000;
//        Selenide.open("https://www.mvideo.ru/");
        //div[@class = 'carousel']
        //Steps steps = new Steps();
      //  Basket basket = new Basket();
     //   PageMain pageMain = new PageMain();

     /*   steps.blockGoodsOfDayShouldBeExist();
        steps.blockShouldBeText();
        steps.clickButtonBlockGoods();
        steps.basketGoodsActive();
        steps.bubbleExist();
        steps.clickBasket();*/


       // Basket basket = new Basket();

    /*   steps.urlCompare("https://www.mvideo.ru/cart");


       steps.checkGetHeaderTitleBasket();
       steps.checkGetProductCardInBasket();
       steps.checkGetButtonGoToRegistration();
       steps.stringCompare(steps.getTextStringInBasketCountGoods(), "В корзине 1 товар");*/

       // steps.shouldBeVisible(basket.getHeaderTitleBasket());
     //   steps.shouldBeVisible(basket.getProductCardInBasket());
      //  steps.shouldBeVisible(basket.getButtonGoToRegistration());
      //  steps.shouldBeVisible(basket.getStringInBasketCountGoods());
       // steps.stringCompare(steps.getTextNameFirstGoodOfDay(), steps.getTextNameInBasket());
       // steps.stringCompare(steps.getTextPriceFirstGoodOfDay(), steps.getTextPriceSale());
      /*  steps.stringCompare(steps.getTextPriceSale(), steps.getTextPriceOrder());*/

//                pageMain.nameFirstGoodOfDay, basket.nameInBasket);
///       steps.stringCompare(pageMain.priceFirstGoodOfDay, basket.priceSale);
//        steps.stringCompare(steps.getTextPriceOrder()
//                basket.getPriceSale(), basket.getPriceOrder());


//        Assert.assertEquals(name, nameInBasket);
//        Assert.assertEquals(price, priceSale);
//        Assert.assertEquals(priceSale, priceOrder);
//
//
//
//
//
//
//
//
//        $(By.xpath("//div[@class = 'carousel']")).shouldBe(visible).shouldHave(text("Скидка")).shouldHave(text("В корзину"));
//        $(By.xpath("//mvid-day-products-block//mvid-day-product[2]/button")).click();
//        steps.basketGoodsActive();
//        $(By.xpath("//mvid-bubble")).shouldBe(exist).shouldBe(text("1")).click();
//
//        String url = WebDriverRunner.url();
//        Assert.assertEquals(url,"https://www.mvideo.ru/cart");
//
//
//
//
//        $(By.xpath("//div/h2[contains(@class, 'cart-header__title')] [text() = 'Моя корзина']")).shouldBe(exist);
//        $(By.xpath("//div[contains(@class, 'c-cart-item__wrapper')]")).shouldBe(exist).shouldBe(visible);
//        $(By.xpath("//input[@value = 'Перейти к оформлению']")).shouldBe(exist).shouldBe(visible).shouldBe(enabled);
//        $(By.xpath("//div[contains(@class, 'c-cost-line__title-wrap')]")).shouldBe(exist).shouldBe(visible).shouldBe(text(
//                "В&nbsp;корзине&nbsp;1&nbsp;товар"));
//
//        String price = $(By.xpath("//mvid-price-2//span[contains(@class, 'price__main-value')]")).getText();
//        System.out.println(price);








     //   Configuration.holdBrowserOpen = true;
  //  }


  /*  @Test
    public void test_12() {
        Configuration.pageLoadTimeout = 90000;
        Selenide.open("https://www.mvideo.ru/");*/
//        String price = $(By.xpath("//div[contains(@class, 'carousel-desktop')]")).shouldBe(exist).shouldBe(visible)
//                + $(By.xpath("//mvid-price-2//span[contains(@class, 'price__main-value')]")).getText();


      /* String price = $(By.xpath("//mvid-day-product[contains(@class, 'main')]//span[contains(@class, 'price__main-value')]")).shouldBe(visible).getText();
       String name = $(By.xpath("//mvid-day-product[contains(@class, 'main')]//div[contains(@class, 'title')]")).shouldBe(visible).getText();
               //("//mvid-day-product[contains(@class, 'product')] [contains(@class, 'ng-star-inserted')] [contains(@class, 'main')]//span[contains(@class, 'price__main-value')]")).getText();
        System.out.println(price);
        System.out.println(name);

        $(By.xpath("//div[@class = 'carousel']")).shouldBe(visible).shouldHave(text("Скидка")).shouldHave(text("В корзину"));
        $(By.xpath("//mvid-day-products-block//mvid-day-product[2]/button")).click();
        $(By.xpath("//mvid-bubble")).shouldBe(exist).shouldBe(text("1")).click();


        String nameInBasket = $(By.xpath("//div[contains(@class, 'c-cart-item__header')]/a[contains(@class, 'c-link')]")).shouldBe(visible).getText();

        String priceSale = $(By.xpath("//div[contains(@class, 'c-cart-item__price-wrapper')]//span[1]")).shouldBe(visible).getText().replace("¤", " ");
                //.replace("¤", " ");
        String priceOrder = $(By.xpath("//div[contains(@class, 'c-cost-line__text-wrap')]/span")).shouldBe(visible).getText().replace("¤", " ");
        //.replace("¤", " ");

        System.out.println(nameInBasket);
        System.out.println(priceSale);
        System.out.println(priceOrder);
        Assert.assertEquals(name, nameInBasket);
        Assert.assertEquals(price, priceSale);
        Assert.assertEquals(priceSale, priceOrder);

    }*/


  //  @FindBy(xpath = "//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]/h2[text()='Самые просматриваемые']")

//    private SelenideElement sam = $(byText("Самые просматриваемые"));
//
//    private SelenideElement getSam (){
//       return sam;
//    }
//
//    private void scrollIntoView(SelenideElement element) {
//        element.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
//    }
//
//    private String containerMostViewedGoods = "//mvid-simple-product-collection-mp[contains(., 'Самые просматриваемые')]";
//
//  //  @FindBy (xpath = "//mvid-simple-product-collection-mp[contains(., 'Самые просматриваемые')]")
//    @FindBy(xpath = "//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]/h2[text()='Самые просматриваемые']")
//    private static SelenideElement mostViewedGoodsContainer;
//
//    private SelenideElement getMostViewedGoodsContainer(){
//        return mostViewedGoodsContainer;
//    }
//
//  //  Tests tests = new Tests();
//
//
////   public static Tests getMostViewedGoods () {
////        if (Objects.isNull(mostViewedGoodsContainer)) mostViewedGoods = Selenide.page(new MostViewedGoodsPage());
////       return (Tests) mostViewedGoodsContainer;
////    }
//
//
//
//
//    @Test
//    public void test_4() {
////        Configuration.pageLoadTimeout = 100000;
////        Selenide.open("https://www.mvideo.ru/");
//
//     //   sleep(10000);
//        Steps steps = new Steps();
//        steps.scrollAllContainers();
//     //   steps.scrollMostViewed();
//        steps.clickButton();
//
//
//
//    //    $(By.xpath("//mvid-simple-product-collection-mp[.//h2[contains(text(), 'Самые просматриваемые')]]")).shouldBe(visible).scrollTo();
//
//
//       // $(By.xpath("//h2[text()='Хиты продаж']")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").shouldBe(visible);
//      //  $(By.xpath("//h2[text()='Новинки, актуальные предложения']")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").shouldBe(visible);
//     //   $(By.xpath("//h2[text()='Популярные категории']")).scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").shouldBe(visible);
//
//
////        $(By.xpath("//h2[text()='Самые просматриваемые']//ancestor::div[@class='block-wrapper']")).scrollTo().
////                scrollIntoView(true);
//      //  getMostViewedGoodsContainer().scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}").shouldBe(visible, Duration.ofSeconds(30));
//
//
//
//
//     //   scrollIntoView(getSam());
//      //  sam.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
//
//     //   sam.shouldBe(visible);
//
//     //   scrollIntoView(sam);
//
//
////        $(By.xpath("//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]/h2[text()='Самые просматриваемые']")).
////                scrollIntoView("{block: \"center\"}").shouldBe(exist);
//
//                //scrollTo();
//
//      //  $(byText("Самые просматриваемые")).scrollIntoView(false);
//
//                //shouldBe(visible).scrollTo(byTextCaseInsensitive());
//
//      // $(By.xpath("//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]/h2[text()='Самые просматриваемые']")).wait();
//             //  scrollTo();
////$$(By.xpath("//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]//div[contains(@class, 'mvid-carousel-inner')]//button[contains(@title, 'Добавить в корзину')]")).get(1).click();
//
//
//        Configuration.holdBrowserOpen = true;
//
//
//    }
//
//
////    public void seee(){
////        private final String parent = "//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]//div[contains(@class, 'mvid-carousel-inner')]//button[contains(@title, 'Добавить в корзину')]";
////
////                //"//div[@class ='catalog-item']"; //div-ы
//       // private final String childCost = "/div[@class='catalog-item-store']/div[@class='catalog-item-price']";//переход от div к цене
////
////        public void randomSelectionElement() {
////            List listCardsGoods = $$x(parent);//лист дивов
//////            SelenideElement cost = $x(parent + childCost); //перешли к элементу Цена
//////            ElementsCollection costList = $$x(parent + childCost);//коллекция цен
//////            List sortCost = costList.stream().filter(SelenideElement -> Integer.valueOf(cost.getText().replace(" руб", "").replace(",", ".")) < 290).);
//////            Random rand = new Random();
////            for (int i = 0; i < listCardsGoods.length; i++) {
////                int randomIndex = rand.nextInt(sortCost.size());//выбираем рандомный индекс
////                sortCost.get(randomIndex);//берем элемент
////                //взять xpath этой цены и перейти к его кнопке Купить
////                sortCost.remove(randomIndex);
////            }
//
//
//
//    }
//
////        $(By.xpath("//mvid-header-icon[@title='Корзина']")).shouldHave(Condition.attribute("class", "disabled")).shouldBe(visible);
////        $(By.xpath("//mvid-header-icon[@title='Избранное']")).shouldHave(Condition.attribute("class", "disabled")).shouldBe(visible);
////        $(By.xpath("//mvid-header-icon[@title='Сравнение']")).shouldHave(Condition.attribute("class", "disabled")).shouldBe(visible);
////        $(By.xpath("//mvid-header-icon//a[@title='Статус заказа']")).
////                shouldBe(visible).shouldNotHave(Condition.attribute("class", "disabled")).shouldBe(enabled);
////        $(By.xpath("//mvid-header-icon//a[contains(@class, 'link')][@title='Личный кабинет']")).
////                shouldBe(visible).shouldNotHave(Condition.attribute("class", "disabled")).shouldBe(enabled);
//
//
//
//
//
//
//
//
////    Page page = new Page();
////   $(byText("Сравнение")).shouldBe(Condition.visible).shouldHave(Condition.attribute("class", "header-icon_disabled"));
////    $(byText("Избранное")).shouldBe(Condition.visible).shouldBe(disabled);
////
//
////                $(By.xpath("//div//header//mvid-tap-bar//p[contains(text(), 'Статус')]")).
////                        shouldBe(Condition.visible).isEnabled();
////        $(By.xpath("//div//header//mvid-tap-bar//p[contains(text(), 'Корзина')]")).
////                shouldBe(Condition.visible).shouldBe(Condition.disabled);
//
//// $(By.xpath("//div//mvid-header-icon")).shouldBe(visible);
////$(byClassName("nav-tabs")).shouldBe(visible);
//
//// private SelenideElement love =
////         $(Objects.requireNonNull(title("Избранное"))).shouldHave(Condition.attribute("class", "disabled"));
////1      $(By.xpath("//div//header//mvid-tap-bar//p[contains(text(), 'Корзина')]")).shouldHave(Condition.attribute("class", "disabled"));
////shouldHave(attribute("disabled"));
//
//
////        disabled
////
////        class="disabled"
////     $(By.className("header_fixed")).shouldHave(Condition.attribute("Сравнение")).shouldBe(Condition.visible).shouldHave(Condition.attribute("class", "header-icon_disabled"));
////     header-icon_disabled
//// (class("header-icon_disabled"));
////(Condition.attribute("class", "header-icon_disabled"));
////isEnabled();
////    shouldHave(attribute(“class”, “active checked”))
////   Configuration.holdBrowserOpen = true;
//
//
////mvid-header-icon//a[@title='Статус заказа']
////    $(By.xpath("//mvid-header-icon//a[contains(@class, 'link')]")).shouldBe(visible);
////  $(byText("Сравнение").shouldHave(attribute("disabled"))
//
//
//
////mvid-header-icon//a[contains(@class, 'link')]
////        $(By.className("disabled")).shouldHave(value("Сравнение"), value("Избранное"), value("Корзина"));
////shouldHave(attribute("disabled"))
////shouldBe(disabled);