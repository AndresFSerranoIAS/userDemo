package co.com.bancolombia.userdemo.domain.model.user.attributes;

public class UserImage {
    private final String value;

    public UserImage(String value) {
        if(value==null||value==""){
            value = "default.jpg";
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
