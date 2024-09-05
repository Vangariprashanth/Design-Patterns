package OOPs;

enum PieceType{
    X,
    O;
}

class A{
    PieceType piece;
    A(PieceType p){
        this.piece=p;
    }
}

public class PlayingPiece {
    PieceType pieceType;
    PlayingPiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
    public static void main(String[] args) {
        
    }
}
