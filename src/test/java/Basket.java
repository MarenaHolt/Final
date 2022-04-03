import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.CollectionElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.nio.channels.SelectableChannel;
import java.util.Objects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Basket {

    private static Basket basket;

    PageMain pageMain = new PageMain();

    @FindBy(xpath = "//div/span[contains(@class, 'c-header-checkout__logo')] [text() = 'Моя корзина']")
    private SelenideElement headerTitleBasket;

    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__wrapper')]")
    private SelenideElement productCardInBasket;

    @FindBy(xpath = "//input[@value = 'Перейти к оформлению']")
    private SelenideElement buttonGoToRegistration;

    @FindBy(xpath = "//div[contains(@class, 'c-orders-list__content')]//span[contains(@class, 'c-cost-line__title')]")
    private SelenideElement stringInBasketCountGoods;

    private SelenideElement nameInBasket = $(By.xpath("//div[contains(@class, 'c-cart-item__header')]/a[contains(@class, 'c-link')]"));

    private SelenideElement priceSale = $(By.xpath("//div[contains(@class, 'c-cart-item__price-wrapper')]//span[1]"));

    private SelenideElement priceOrder = $(By.xpath("//div[contains(@class, 'c-cost-line__text-wrap')]/span"));

    @FindBy(xpath = "//div[contains(@class, 'c-cart-item__price-wrapper')]//span[1]")
    private ElementsCollection price;


    public int getPriceSaleInt(int i){
        return Integer.parseInt(price.get(i).getText().replaceAll("\\D+",""));
    }

    public int getPriceOrderInt(){
        return Integer.parseInt(priceOrder.getText().replaceAll("\\D+",""));
    }

    public SelenideElement getNameInBasket(){
    return nameInBasket.shouldBe(visible);
    }

    public SelenideElement getPriceSale(){
    return priceSale.shouldBe(visible);
    }

    public SelenideElement getPriceOrder(){
    return priceOrder.shouldBe(visible);
    }

    public SelenideElement getStringInBasketCountGoods(){
    return stringInBasketCountGoods.shouldBe(visible);
    }

    public boolean getHeaderTitleBasket(){
        return headerTitleBasket.isDisplayed();
    }


    public boolean getProductCardInBasket(){
    return productCardInBasket.isDisplayed();
    }

    public boolean getButtonGoToRegistration(){
        return buttonGoToRegistration.isDisplayed();
    }


    Basket() {
    }

    public static Basket getBasket() {
        if (Objects.isNull(basket)) basket = Selenide.page(new Basket());
        return basket;
    }

}