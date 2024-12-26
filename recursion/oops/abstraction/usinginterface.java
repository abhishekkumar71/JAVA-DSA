/**
 * usinginterface
 */
public class usinginterface {

    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
        king k = new king();
        k.moves();
        pawn p = new pawn();
        p.moves();
    }
}

interface chessplayer {

    void moves();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("up,down,left,right by 1 move");
    }
}

class pawn implements chessplayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}