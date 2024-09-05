enum PieceType{
    X,O;
}
class PlayingPiece {
    PieceType piece;
    PlayingPiece(PieceType piece){
        this.piece = piece;
    }
}
class PlayingPieceX extends PlayingPiece{
    PlayingPieceX(){
    super(PieceType.X);
    }
}

class PlayingPieceO extends PlayingPiece{
    PlayingPieceO(){
        super(PieceType.O);
    }
}

public class Dog{
    public static void main(String[] args) {
        PlayingPieceX playingPieceX = new PlayingPieceX();
        System.out.println(playingPieceX.piece);
    }
}