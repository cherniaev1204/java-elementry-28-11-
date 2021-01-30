package lessons.lesson4;

public class ImmutableUserMain {
    public static void main(String[] args) {
        ImmutableUser user = new ImmutableUser("Iliya","Chernyaev",16);
        user.update("Iliya","Chernyaev",16);
        user.update("df","df",12);
        user.update("Iliya","Chernyaev1",15);
    }
}
