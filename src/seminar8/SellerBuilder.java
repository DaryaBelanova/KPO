package seminar8;

public class SellerBuilder implements UserBuilder {
    User user;
    @Override
    public UserBuilder buildName() {
        user.name = "Seller name";
        return this;
    }

    @Override
    public UserBuilder buildRole() {
        user.role = Role.Seller;
        return this;
    }

    @Override
    public UserBuilder buildImageURL() {
        user.imageURL = "Some url";
        return this;
    }

    @Override
    public UserBuilder buildStoreName() {
        user.storeName = "Some store name";
        return this;
    }

    @Override
    public UserBuilder buildMaxNumberItems() {
        user.maxNumberItems = 123;
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
        buildImageURL();
        buildStoreName();
        buildMaxNumberItems();
        return user;
    }
}
