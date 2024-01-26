package seminar8;

public class AdminBuilder implements UserBuilder {
    User user;
    @Override
    public UserBuilder buildName() {
        user.name = "Admin name";
        return this;
    }

    @Override
    public UserBuilder buildRole() {
        user.role = Role.Admin;
        return this;
    }

    @Override
    public UserBuilder buildImageURL() {
        return this;
    }

    @Override
    public UserBuilder buildStoreName() {
        return this;
    }

    @Override
    public UserBuilder buildMaxNumberItems() {
        return this;
    }

    @Override
    public UserBuilder buildCreditCardNumber() {
        return this;
    }

    @Override
    public User build() {
        buildName();
        buildRole();
        return user;
    }
}
