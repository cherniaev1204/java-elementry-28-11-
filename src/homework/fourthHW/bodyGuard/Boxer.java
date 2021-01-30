package homework.fourthHW.bodyGuard;

public class Boxer extends AbstractGuard {

    @Override
    String applyMartialArts(Attacker attacker) {
        return "Use box skills to save clients life";
    }
}
