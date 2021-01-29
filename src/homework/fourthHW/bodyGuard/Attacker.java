package homework.fourthHW.bodyGuard;

public class Attacker {
    boolean gun;

    public Attacker(boolean isGun) {
        this.gun = isGun;
    }

    public boolean isGun() {
        if (this.gun == true) {
            return true;
        } else {
            return false;
        }
    }

}
