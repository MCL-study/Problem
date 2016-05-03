package source001;

import java.util.Scanner;

/**
 * Created by Boobby on 2016-05-03.
 */
public class Solution_Boo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("강아지는 몇마리에요?? ");
        int numOfDogs = in.nextInt();
        System.out.println("오리는 몇마리에요?? ");
        int numOfDucks = in.nextInt();

        int totalLegs = 4 * numOfDogs + 2 * numOfDucks;
        System.out.println("그러면 다리는 " + totalLegs + "개에요~");
        in.close();
    }
}
