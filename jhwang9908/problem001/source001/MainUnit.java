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
        System.out.print("�������� ���� �Է��ϼ���:");
        dog=sc.nextInt();
        System.out.print("������ ���� �Է��ϼ���:");
        duck=sc.nextInt();

        sumOfLegs=dog*4+duck*2;

        System.out.println("�� ������ �ٸ� ���� "+sumOfLegs+"�Դϴ�.");
    }

    public static void main(String[] args)
    {
        MainUnit starter=new MainUnit();
        starter.findSumOfLegs();
    }
}
