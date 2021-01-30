package homework.fourthHW.bodyGuard;

public class Main {
    public static void main(String[] args) {
        Attacker attacker1 = new Attacker(true);
        Attacker attacker2 = new Attacker(true);
        Attacker attacker3 = new Attacker(true);
        AbstractGuard jiujist = new JiuJist();
        System.out.println(jiujist.saveLife(attacker2));
        AbstractGuard karatist = new Karatist();
        System.out.println(karatist.saveLife(attacker3));
        AbstractGuard boxer = new Boxer();
        System.out.println(boxer.saveLife(attacker1));
    }


}
