package lessons.lesson5.phone;

public class PhoneMain {
    public static void main(String[] args) {
        AbstractPhone phone = new ThomasEdisonPhone(1873);

        AbstractPhone phone1 = new Phone(1980);

        AbstractPhone smartphone = new SmartPhone(200);

        AbstractPhone smartphone2 = new SmartPhone(2010);

        User user = new User("Iliya");

        user.callAnotherUser("2212132112", phone);

        user.callAnotherUser("15555", phone1);
        user.callAnotherUser("2232332", smartphone);
        user.callAnotherUser("4144", smartphone2);
    }
}
