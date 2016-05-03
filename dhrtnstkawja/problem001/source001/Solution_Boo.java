package source001;

import java.util.Scanner;

/**
 * Created by Boobby on 2016-05-03.
 */
public class Solution_Boo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1부터 9사이의 정수를 입력하세요");
        int num = in.nextInt();

        in.close();

        for(int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
