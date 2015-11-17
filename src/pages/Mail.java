package pages;

import elements.Button;
import org.openqa.selenium.By;

/**
 * Created by Jax on 17.11.15.
 */
public class Mail {
    private Button MailLink = new Button(By.id("gb_P"));


    public LoginPage clickLogIn(){
        MailLink.click();
        return new LoginPage();
    }
}
