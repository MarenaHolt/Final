import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PageMain {

    private static PageMain pageMain;

    @FindBy(xpath = "//mvid-header-icon[@title='Корзина']")
    private SelenideElement basketGoods;

    @FindBy(xpath = "//mvid-header-icon[@title='Избранное']")
            private SelenideElement favorites;

    @FindBy(xpath = "//mvid-header-icon[@title='Сравнение']")
            private SelenideElement compare;

    @FindBy(xpath = "//mvid-header-icon//a[@title='Статус заказа']")
            private SelenideElement orderStatus;

    @FindBy(xpath = "//mvid-header-icon//a[contains(@class, 'link')][@title='Личный кабинет']")
            private SelenideElement personalAccount;

   // -----

    @FindBy(xpath = "//div[contains(@class, 'mp-wrapper')]/*")
    private ElementsCollection allWrappers;

    @FindBy(xpath = "//mvid-simple-product-collection [contains(@class, 'page-carousel-padding')]/h2[text()='Самые просматриваемые']")
    private SelenideElement mostViewed;

    @FindBy(xpath = "//h2[contains(text(), 'Самые просматриваемые')]/..//button[contains(@title, 'Добавить в корзину')]")
    private ElementsCollection mostViewedButtons;

    // ----

    @FindBy(xpath = "//div[@class = 'carousel']")
    private SelenideElement blockGoodsOfDay;

    @FindBy(xpath = "//mvid-day-products-block//mvid-day-product[2]/button")
    private SelenideElement buttonGoodsOfDayInBasket;

    @FindBy(xpath = "//mvid-bubble/.")
    private SelenideElement bubble;

    private SelenideElement priceFirstGoodOfDay = $(By.xpath("//mvid-day-product[contains(@class, 'main')]//span[contains(@class, 'price__main-value')]"));
    private SelenideElement nameFirstGoodOfDay = $(By.xpath("//mvid-day-product[contains(@class, 'main')]//div[contains(@class, 'title')]"));

    public SelenideElement getPriceFirstGoodOfDay(){
        return priceFirstGoodOfDay.shouldBe(visible);
    }

    public SelenideElement getNameFirstGoodOfDay(){
        return nameFirstGoodOfDay.shouldBe(visible);
    }

    public void scrollAllPage(){
        for (SelenideElement allWrapper : allWrappers) {
            allWrapper.scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");
        }
    }

    public void clickButtons(int number){
        mostViewedButtons.get(number).scrollIntoView("{block: 'center'}").click();
    }

    PageMain() {
    }

    public static PageMain getPage() {
        if (Objects.isNull(pageMain)) pageMain = Selenide.page(new PageMain());
        return pageMain;
    }

    public SelenideElement getBasketGoods(){
        return basketGoods;
    }

    public SelenideElement getFavorites(){
        return favorites;
    }

    public SelenideElement getCompare(){
        return compare;
    }

    public SelenideElement getPersonalAccount(){
        return personalAccount;
    }

    public SelenideElement getOrderStatus(){
        return orderStatus;
    }

    public SelenideElement getBlockGoodsOfDay(){
        blockGoodsOfDay.shouldBe(Condition.visible);
        return blockGoodsOfDay;
    }

    public SelenideElement getButtonGoodsOfDayInBasket(){
        return buttonGoodsOfDayInBasket;
    }


    public SelenideElement getBubble() {
        bubble.shouldBe(exist).shouldBe(visible);
        return bubble;
    }

    public void elementShouldBeText(SelenideElement element, String text) {
        element.shouldBe(text(text));
    }


    public boolean getMostViewed(){
        return mostViewed.isDisplayed();
    }

}
