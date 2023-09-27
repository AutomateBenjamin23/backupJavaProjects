package dailyByte;
//        This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes,
//        return whether or not it will return to its original position. The string will only contain L, R, U, and D
//        characters, representing left, right, up, and down respectively.
public class vaccuumCleanerRoute {

    public static void main(String[] args) {
        String path1 = "LR";
        String path2 = "URURD";
        String path3 = "RUULLDRD";


    }

    public boolean isRobotBackToOrigin(String moves) {
        int x = 0;
        int y = 0;

        for (char move : moves.toCharArray()) {
            if (move == 'L') {
                x--;
            } else if (move == 'R') {
                x++;
            } else if (move == 'U') {
                y++;
            } else if (move == 'D') {
                y--;
            }
        }
        return x == 0 && y == 0;
    }


}
