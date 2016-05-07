package source001;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kimsooyeon on 2016-05-07.
 */
public class MainUnit
{
    private int comNum;
    private int userNum;
    private Random num;
    private Scanner sc;

    public MainUnit()
    {
        num = new Random();
        sc=new Scanner(System.in);
    }

    public void control()
    {
        boolean check=true;
        int count=0;
        comNum=num.nextInt(30)+1;

        while(check)
        {
            do
            {
                System.out.print("1�� 30������ ���ڸ� �Է��ϼ���:");
                userNum=sc.nextInt();
            }while(!(userNum>=1 && userNum<=30));

            count++;

            if(userNum>comNum)
            {
                System.out.println("��ǻ�Ͱ� ������ ���ں��� ū ���ڸ� �Է��ϼ̽��ϴ�.");
                System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
            }
            else if(userNum<comNum)
            {
                System.out.println("��ǻ�Ͱ� ������ ���ں��� ���� ���ڸ� �Է��ϼ̽��ϴ�.");
                System.out.println("�� ū ���ڸ� �Է��ϼ���.");
            }
            else
            {
                System.out.println("�����մϴ�! "+count+"�� ���� ���ڸ� ���߼̽��ϴ�.");
                check=false;
            }
        }
    }

    public static void main(String[] args)
    {
        MainUnit starter=new MainUnit();
        starter.control();
    }
}
