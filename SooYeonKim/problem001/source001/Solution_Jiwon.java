package source001;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by josoyo0701 on 2016. 5. 3..
 */
public class Solution_Jiwon
{
    public static void main(String[] args)
    {
        System.out.println("지금 부터 숫자게임을 시작합니다!");
        System.out.println("1과 30사이의 숫자를 하나 선택하겠습니다.");

        int ranValue = (int) (Math.random() * 30 + 1);

        System.out.println("추리를 시작하세요!");

        Scanner input1 = new Scanner(System.in);
        int firstGuess = 0;

        int count=0;


        do
        {firstGuess = input1.nextInt();
            count++;
            if (firstGuess < ranValue)
            {
                System.out.println("오답 입니다. 입력한 수 보다 UP!");
            }
            else if (firstGuess > ranValue)
            {
                System.out.println("오답 입니다. 입력한 수 보다 DOWN!");
            }
            else
                System.out.println("정답 입니다~ 축하드립니다!");
                System.out.println("시도 횟수는" + count + "번 입니다.");

        }while(firstGuess!=ranValue);
    }

}