package source001;

/**
 * Created by josoyo0701 on 2016. 4. 29..
 */

import java. util.*;

public class solution_Jiwon
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int firstNum = 0;
        int secondNum=0;
        int emptyCup=0;

        firstNum = input.nextInt();
        System.out.println("첫번째 수는" + firstNum);

        secondNum = input.nextInt();
        System.out.println("두번째 수는" + secondNum);


        emptyCup = firstNum;
        firstNum = secondNum;
        secondNum = emptyCup;

        System.out.println("첫번째 수는 "+ firstNum +" 이고 두번째 수는 "+secondNum +" 입니다.");




    }
}
