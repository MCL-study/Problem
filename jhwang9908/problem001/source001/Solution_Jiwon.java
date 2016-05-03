package source001;

import java.util.Scanner;

/**
 * Created by josoyo0701 on 2016. 5. 2..
 */
public class Solution_Jiwon
{
    public static void main(String[] args)
    {
        System.out.println("강아지는 모두 몇 마리 입니까?");
        Scanner inputDog = new Scanner(System.in);
        int dogLeg = 0;
        dogLeg = inputDog.nextInt();

        System.out.println("오리는 모두 몇 마리 입니까?");
        Scanner inputDuck = new Scanner(System.in);
        int duckLeg = 0;
        duckLeg = inputDuck.nextInt();

        int legSum = (dogLeg*4)+(duckLeg*2);

        System.out.println("강아지와 오리의 다리 합은 " +legSum+ "입니다");


    }
}
