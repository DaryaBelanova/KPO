package seminar8;

public class CustomerBuilder implements UserBuilder {
    User user;
    @Override
    public UserBuilder buildName() {
        user.name = "Customer name";
        return this;
    }

    @Override
    public UserBuilder buildRole() {
        user.role = Role.Customer;
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
        user.creditCardNumber = 12345;
        return this;
    }

    @Override
    public User build() {
        buildName();
        buildRole();
        buildCreditCardNumber();
        return user;
    }
}
