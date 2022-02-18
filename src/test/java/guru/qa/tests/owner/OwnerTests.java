package guru.qa.tests.owner;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {
    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    @Tag("owner")
    void loginTest() {
        String login = "some login";
        String password = "some password";

        System.out.println("Login: " + login);
        System.out.println("Login: " + password);

        String message = format("I logged in  as %s with password %s", login, password);
        System.out.println(message);
    }
}
