package homework.fourthHW.chess;

public abstract class ChessItem implements Drawable{
    private int x;
    private int y;
    private int value;
    private String name;

    @Override
    public void draw() {
        System.out.println("Place " + x + ";" + y + "; Value of the figure " + value + "; Name " + name);
    }
}
