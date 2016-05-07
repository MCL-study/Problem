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
                System.out.print("1과 30사이의 숫자를 입력하세요:");
                userNum=sc.nextInt();
            }while(!(userNum>=1 && userNum<=30));

            count++;

            if(userNum>comNum)
            {
                System.out.println("컴퓨터가 선택한 숫자보다 큰 숫자를 입력하셨습니다.");
                System.out.println("더 작은 숫자를 입력하세요.");
            }
            else if(userNum<comNum)
            {
                System.out.println("컴퓨터가 선택한 숫자보다 작은 숫자를 입력하셨습니다.");
                System.out.println("더 큰 숫자를 입력하세요.");
            }
            else
            {
                System.out.println("축하합니다! "+count+"번 만에 숫자를 맞추셨습니다.");
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
