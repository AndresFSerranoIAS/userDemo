package co.com.bancolombia.userdemo.domain.model.user.attributes;

import org.springframework.util.Assert;

import java.util.regex.Pattern;

public class UserName {

    private final String value;

    public UserName(String value) {
        this.value = value;
        Assert.isTrue(value!="","Por favor ingrese el nombre del usuario");
        Assert.isTrue(value.length()<=50,"El usuario no puede tener más de 50 caracteres en su nombre");
        Assert.isTrue(Pattern.matches("[\\p{L}\\s]+", value), "Por favor sólo suministre letras del abecedario en el nombre del usuario");
    }

    /*Assert lanza siempre una excepción del tipo IllegalArgumentExcepction */

    public String getValue() {
        return value;
    }

//    private void validation(String value) throws BusinessExcepction{
//
//    }


}
