package source001;

import java.util.Scanner;

/**
 * Created by josoyo0701 on 2016. 5. 3..
 */
public class Solution_Jiwon
{
    public static void main(String[] args)
    {
        System.out.println("전화번호 10자리를 입력해 주세요!");

        Scanner input = new Scanner(System.in);
        String phoneNum;
        phoneNum = input.next();

        String str = phoneNum.toString();

        System.out.print(str.substring(0,3)+")");
        System.out.print(str.substring(3,6)+"-");
        System.out.print(str.substring(6,10));

    }
}
