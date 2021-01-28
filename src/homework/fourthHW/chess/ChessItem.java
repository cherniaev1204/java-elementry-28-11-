package homework.fourthHW.chess;

public abstract class ChessItem{
    private String x;
    private String y;
    private String value;


    public ChessItem(String x, String y, String value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChessItem{" +
                "x=" + x +
                ", y=" + y +
                ", value='" + value + '\'' +
                '}';
    }
}
