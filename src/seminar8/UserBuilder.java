package seminar8;

public interface UserBuilder {
    UserBuilder buildName();

    UserBuilder buildRole();

    UserBuilder buildImageURL();

    UserBuilder buildStoreName();

    UserBuilder buildMaxNumberItems();

    UserBuilder buildCreditCardNumber();

    User build();
}
