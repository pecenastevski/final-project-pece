package tests;

import data.LoginRegisterData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakingOrderTests extends BaseTest {
    @Test
    public void testingOrderProcedure() {


        makingOrderPage.clickSignIn();
        makingOrderPage.enterEmail(LoginRegisterData.email);
        makingOrderPage.enterPassword(LoginRegisterData.password);
        sleep(2000);
        Assert.assertEquals(makingOrderPage.getEmail(0),"");
        makingOrderPage.submitButton();
        makingOrderPage.setSearchBar("dress");
        makingOrderPage.setSubmitSearch();
        makingOrderPage.firstItem();
        makingOrderPage.enterQuantity1("");
        makingOrderPage.decreaseQuantity();
        makingOrderPage.decreaseQuantity();
        makingOrderPage.setSize();
        Assert.assertEquals(makingOrderPage.returnSizeOfFirstItem(0),"M");
        makingOrderPage.setColor();
        makingOrderPage.addingToCart();
        makingOrderPage.continueShopping();
        makingOrderPage.backToMain();
        js.executeScript("window.scrollBy(0,300)");
        makingOrderPage.secondItem();
        makingOrderPage.increaseQuantity();
        makingOrderPage.setSize();
        Assert.assertEquals(makingOrderPage.returnSizeOfFirstItem(0),"M");
        makingOrderPage.setItem2Color();
        makingOrderPage.addingToCart();
        makingOrderPage.continueShopping();
        makingOrderPage.backToMain();
        js.executeScript("window.scrollBy(0,750)");
        makingOrderPage.selectThirdItem();
        makingOrderPage.increaseQuantity();
        makingOrderPage.setSizeForThirdItem();
        Assert.assertEquals(makingOrderPage.returnSizeOfThirdItem(0),"L");
        makingOrderPage.setItem3Color();
        makingOrderPage.addingToCart();
        makingOrderPage.proceedToCheckout();
        makingOrderPage.deleteItemFromCart();
        js.executeScript("window.scrollBy(0,750)");
        makingOrderPage.clickProceedToCheckoutInCart();
        makingOrderPage.enterOrderMessage("Send it as fast as possible");
        makingOrderPage.lastProceed();
        makingOrderPage.clickAgree();
        js.executeScript("window.scrollBy(0,100)");
        makingOrderPage.clickProceedToPayment();
        makingOrderPage.clickPayByBank();
        makingOrderPage.clickOrderConfirm();
        Assert.assertEquals(makingOrderPage.returnOrderComplete(), "Your order on My Store is complete.");
        sleep(5000);


    }
}
