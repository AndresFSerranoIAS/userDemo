package co.com.bancolombia.userdemo.domain.model.user.attributes;

import org.springframework.util.Assert;

import java.util.regex.Pattern;

public class UserEmail {
    private final String value;

    public UserEmail(String value) {
        this.value = value;
        Assert.isTrue(Pattern.matches("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+",value),"El campo deberá tener la estructura de un email");
    }

    public String getValue() {
        return value;
    }
}
