package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.BrowserDriver;

public class SignupPage extends BrowserDriver{
    public static String testName = "testName";
    public static String testEmail = "testingEmailForApi@gmail.com";
    public static String testPassword = "testPassword";
    public static String testFirstName = "testFirstName";
    public static String testLastName = "testFullName";
    public static String testAddress1 = "testAddress1";
    public static String testCity = "testCity";
    public static String testState = "testState";
    public static String testZipcode = "testZipcode";
    public static String testCompany = "testCompany";
    public static String testMobileNumber = "123456789";
    public static String testAddress2 = "testAddress2";

    public static void enterNameAndEmail() {
        WebElement nameInput = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        nameInput.click();
        nameInput.sendKeys(testName);

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        emailInput.click();
        emailInput.sendKeys(testEmail);

    }

    public static void clickSignUpBtn(){
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    }

    public static void verifySignUpPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div/div/div/div/h2/b")));
    }

    public static void fillDetails(){
        driver.findElement(By.id("id_gender1")).click();

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.click();
        passwordInput.sendKeys(testPassword);

        WebElement dayInput = driver.findElement(By.id("days"));
        dayInput.click();
        WebElement dayOption = driver.findElement(By.xpath("//*[@id=\"days\"]/option[11]"));
        dayOption.click();

        WebElement monthInput = driver.findElement(By.id("months"));
        monthInput.click();
        WebElement monthOption = driver.findElement(By.xpath("//*[@id=\"months\"]/option[11]"));
        monthOption.click();

        WebElement yearInput = driver.findElement(By.id("years"));
        yearInput.click();
        WebElement yearOption = driver.findElement(By.xpath("//*[@id=\"years\"]/option[7]"));
        yearOption.click();

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.click();
        firstName.sendKeys(testFirstName);

        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.click();
        lastName.sendKeys(testLastName);

        WebElement company = driver.findElement(By.id("company"));
        company.click();
        company.sendKeys(testCompany);

        WebElement address1 = driver.findElement(By.id("address1"));
        address1.click();
        address1.sendKeys(testAddress1);

        WebElement address2 = driver.findElement(By.id("address2"));
        address2.click();
        address2.sendKeys(testAddress2);

        WebElement state = driver.findElement(By.id("state"));
        state.click();
        state.sendKeys(testState);

        WebElement city = driver.findElement(By.id("city"));
        city.click();
        city.sendKeys(testCity);

        WebElement zipcode = driver.findElement(By.id("zipcode"));
        zipcode.click();
        zipcode.sendKeys(testZipcode);

        WebElement mobile_number = driver.findElement(By.id("mobile_number"));
        mobile_number.click();
        mobile_number.sendKeys(testMobileNumber);
    }

    public static void clickCreateAccBtn(){
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
    }

    public static void verifyAccountCreation(){
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"))).click();
    }

}
