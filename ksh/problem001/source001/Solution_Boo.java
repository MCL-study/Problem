package source001;

/**
 * Created by Boobby on 2016-04-29.
 */
public class Solution_Boo {
    public static void main(String[] args) {
        int A = 100;
        int B = 50;

        System.out.println("A : " + A + " B : " + B);

        int tmp = A;
        A = B;
        B = tmp;

        System.out.println("A : " + A + " B : " + B);
    }
}
