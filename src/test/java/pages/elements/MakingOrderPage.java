package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakingOrderPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By signIn = By.className("login");
    private By enterEmail = By.id("email");
    private By enterPassword = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By searchBar = By.id("search_query_top");
    private By submitSearch = By.name("submit_search");
    private By chooseFirstItem = By.xpath("//*[@id='center_column']/ul/li[2]");
    private By setQuantity = By.id("quantity_wanted");
    private By increaseQuantity = By.className("icon-plus");
    private By decreaseQuantity = By.className("icon-minus");
    private By chooseSizeForItem1 = By.xpath("//*[@id=\"group_1\"]/option[2]");
    private By chooseColor = By.xpath("//*[@id=\"color_24\"]");
    private By firstItemAddtoCart = By.xpath("//*[@id=\"add_to_cart\"]");

    private By continueShopping = By.xpath("//*[@title='Continue shopping']");
    private By backToShopping = By.name("back");
    private By secondItem = By.xpath("//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]");
    private By secondItemQuantity = By.xpath("//*[@id=\"quantity_wanted\"]");
    private By secondItemColor = By.id("color_13");
    private By thirdItem = By.xpath("//*[@id=\"center_column\"]/ul/li[7]/div/div");
    private By chooseSizeThirdItem = By.xpath("//*[@id=\"group_1\"]/option[3]");
    private By thirdItemColor = By.id("color_11");
    private By proceedToCheckout = By.xpath("//*[@title='Proceed to checkout']");
    private By deleteItemFromCart = By.xpath("//*[@id='3_14_0_604376']");
    private By proceedToCheckoutInCart = By.xpath("//*[@class='button btn btn-default standard-checkout button-medium']");
    private By addOrderMessage = By.xpath("//*[@class='form-control']");
    private By finalProceed = By.xpath("//*[@name='processAddress']");
    private By agreement = By.xpath("//*[@id='uniform-cgv']");
    private By proceedToPayment = By.xpath("//*[@name='processCarrier']");
    private By bankPayment = By.xpath("//*[@class='bankwire']");
    private By orderConfirming = By.xpath("//*[@class='button btn btn-default button-medium']");
    private By returnEmail = By.xpath("//*[@id='email']");
    private By returnPassword = By.xpath("//*[@id=\"passwd\"]");
    private By returnBankMessage = By.xpath("//*[@class=\"cheque-indent\"]");


    public MakingOrderPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void clickSignIn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterEmail)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
    }

    public void submitButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signInButton)).click();
    }


    public void setSearchBar(String searchItem) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys(searchItem);
    }

    public void setSubmitSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitSearch)).click();
    }

    public void firstItem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseFirstItem)).click();
    }

    public void enterQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setQuantity)).click();
    }

    public void enterQuantity1(String quantity) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(setQuantity)).sendKeys(quantity);
    }

    public void increaseQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(increaseQuantity)).click();
    }

    public void decreaseQuantity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(decreaseQuantity)).click();
    }

    public void setSize() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseSizeForItem1)).click();
    }

    public void setColor() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseColor)).click();
    }

    public void addingToCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemAddtoCart)).click();
    }

    public void continueShopping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping)).click();

    }

    public void backToMain() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(backToShopping)).click();
    }

    public void secondItem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondItem)).click();
    }

    public void secondItemQuantity(String quantity) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondItemQuantity)).sendKeys(quantity);
    }

    public void setItem2Color() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondItemColor)).click();
    }

    public void selectThirdItem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(thirdItem)).click();
    }

    public void setSizeForThirdItem() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseSizeThirdItem)).click();
    }

    public void setItem3Color() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(thirdItemColor)).click();
    }

    public void proceedToCheckout() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckout)).click();
    }

    public void deleteItemFromCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteItemFromCart)).click();
    }

    public void clickProceedToCheckoutInCart() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckoutInCart)).click();
    }

    public void enterOrderMessage(String msg) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addOrderMessage)).sendKeys(msg);
    }

    public void lastProceed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(finalProceed)).click();

    }

    public void clickAgree() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(agreement)).click();
    }

    public void clickProceedToPayment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToPayment)).click();
    }

    public void clickPayByBank() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bankPayment)).click();
    }

    public void clickOrderConfirm() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderConfirming)).click();
    }

    public String getEmail(int email) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnEmail)).get(email).getText();
    }

    public String returnOrderComplete() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(returnBankMessage)).getText();
    }

    public String returnPassword(int pass){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnPassword)).get(pass).getText();
    }
    public String returnSizeOfFirstItem(int sizeI1){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chooseSizeForItem1)).get(sizeI1).getText();
    }
    public String returnSizeOfThirdItem(int sizeI3){
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chooseSizeThirdItem)).get(sizeI3).getText();
    }
    public String returnOrderMessage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(addOrderMessage)).getText();
    }
}






