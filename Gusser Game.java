import java.util.*;

class Guesser {
    int gnum;

    int guesserNum() {
        System.out.println("Guesser guess a number between 1 to 20");
        Scanner sc = new Scanner(System.in);
        gnum = sc.nextInt();
        return gnum;
    }
}

class Player {
    int pnum;

    int playerNum() {
        System.out.println("Player guess a number between 1 to 20");
        Scanner sc = new Scanner(System.in);
        pnum = sc.nextInt();
        return pnum;
    }
}

class Umpire {
    int ugnum;
    int upnum1;
    int upnum2;
    int upnum3;

    void collectgnum() {
        Guesser g = new Guesser();
        ugnum = g.guesserNum();
    }

    void collectpnum() {
        System.out.println("Player-1");
        Player p1 = new Player();
        upnum1 = p1.playerNum();
        System.out.println("Player-2");
        Player p2 = new Player();
        upnum2 = p2.playerNum();
        System.out.println("Player-3");
        Player p3 = new Player();
        upnum3 = p3.playerNum();
    }

    void compare() {
        if (ugnum == upnum1) {
            System.out.println("Player-1 wins");
        } else if (ugnum == upnum2) {
            System.out.println("Player-2 wins");
        } else if (ugnum == upnum3) {
            System.out.println("Player-3 wins");
        } else {
            System.out.println("Game over");
        }
    }
}
class Gusser {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectgnum();
        u.collectpnum();
        u.compare();
    }
}






