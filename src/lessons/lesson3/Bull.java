package lessons.lesson3;

public class Bull {
    public static final String BULL_CREATED = "Bull created";
    public static final String BULL_CREATED_WITH_NAME = "Bull created with name";
    public static int COUNT;

    String name;
    int strength;

    public Bull() {
        COUNT++;
        System.out.println(BULL_CREATED);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Bull(String name, int strength) {
        this.name = name;
        this.strength = strength;
        System.out.println(BULL_CREATED_WITH_NAME);
        COUNT++;
    }

    public Bull(String name) {
        this.name = name;
        System.out.println(BULL_CREATED_WITH_NAME);
        COUNT++;
    }
    public String toString() {
        return "Bull " + name + ";Power " + strength;
    }

    public boolean fight(Bull bull){
        return  this.strength > bull.strength;
    }

    public static int getCOUNT() {
        return COUNT;
    }


}
