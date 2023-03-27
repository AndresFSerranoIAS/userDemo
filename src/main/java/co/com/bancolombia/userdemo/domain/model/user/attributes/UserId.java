package co.com.bancolombia.userdemo.domain.model.user.attributes;

public class UserId {
    private  final Long value;

    public UserId(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return value;
    }
}
