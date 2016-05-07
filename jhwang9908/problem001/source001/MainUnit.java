package source001;

import java.util.Scanner;

/**
 * Created by kimsooyeon on 2016-05-07.
 */
public class MainUnit
{
    private int dog;
    private int duck;
    private int sumOfLegs;
    private Scanner sc;

    public MainUnit()
    {
        sc=new Scanner(System.in);
    }

    public void findSumOfLegs()
    {
        System.out.print("강아지의 수를 입력하세요:");
        dog=sc.nextInt();
        System.out.print("오리의 수를 입력하세요:");
        duck=sc.nextInt();

        sumOfLegs=dog*4+duck*2;

        System.out.println("두 동물의 다리 합은 "+sumOfLegs+"입니다.");
    }

    public static void main(String[] args)
    {
        MainUnit starter=new MainUnit();
        starter.findSumOfLegs();
    }
}
