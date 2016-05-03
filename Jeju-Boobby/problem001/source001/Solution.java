package source001;

import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("10자리 숫자를 입력하세요 : ");
        String phoneNumber = in.next();

        String sub1 = phoneNumber.substring(0, 3);
        String sub2 = phoneNumber.substring(3, 6);
        String sub3 = phoneNumber.substring(6);

        System.out.print(sub1 +") " + sub2 + " - " + sub3);
    }
}