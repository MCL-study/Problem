package source001;

import java.util.Scanner;

/**
 * Created by josoyo0701 on 2016. 5. 2..
 */
public class Solution_Jiwon
{
    public static void main(String[] args)
    {
        System.out.println("구구단표를 구할 숫자를 입력하세요");

        Scanner input = new Scanner(System.in);

        int frontNum = 0;
        int backNum = 0;
        int result=0;
        frontNum = input.nextInt();


            for (backNum=0; backNum<10; backNum++)
            {
                result = frontNum * backNum;
                System.out.println(frontNum+"*"+backNum+" = "+result);
            }


    }


}
