package homework.fourthHW.chess;

import java.util.List;

public class ChessMain {
    public static void main(String[] args) {
        ChessItem pawn = new Pawn("1 to 8", "2 and 7", "pawn");
        ChessItem bishop = new Bishop("3 and 6", "1 and 8", "bishop");
        ChessItem king = new King("4", "1 and 8", "king");
        ChessItem queen = new Queen("5", "1 and 8", "queen");
        ChessItem castle = new Castle("1 and 8", "1 and 8", "castle");
        ChessItem knight = new Knight("2 and 7", "1 and 8", "");
        Drawable board = new ChessBoard();
        System.out.println(board.draw());
        List<ChessItem> items = List.of(pawn, bishop, king, queen, castle, knight);
        System.out.println(items.toString());

    }
}
