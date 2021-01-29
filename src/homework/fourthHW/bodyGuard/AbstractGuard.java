package homework.fourthHW.bodyGuard;

public abstract class AbstractGuard {
    abstract String applyMartialArts(Attacker attacker);

    String shoot(Attacker attacker) {
        return "Shoot the attacker";
    }

    String saveLife(Attacker attacker) {
        if (attacker.isGun()) {
            return shoot(attacker);
        } else {
            return applyMartialArts(attacker);
        }
    }

}