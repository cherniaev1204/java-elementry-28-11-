package lessons.lesson3;

public class BullMain {
    public static void main(String[] args) {

        Bull bull = new Bull("RedBull", 12);

        System.out.println(bull);
        Bull bull1 = new Bull("RedBull", 20);
        System.out.println(bull.fight(bull1));
        //        System.out.println("Bull count: " + Bull.getCOUNT());
//        Bull[] bulls = new Bull[20];
//        for (int i = 0; i < bulls.length; i++) {
//            bulls[i] = new Bull("Bull" + i);
//        }
//        System.out.println(Bull.getCOUNT());
//    }
    }
}