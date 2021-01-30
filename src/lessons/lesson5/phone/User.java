package lessons.lesson5.phone;

import lessons.lesson5.phone.AbstractPhone;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(String number, AbstractPhone phone) {
        phone.call(number);
    }
}
