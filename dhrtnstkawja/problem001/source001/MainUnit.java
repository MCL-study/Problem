package source001;

import java.util.Scanner;

/**
 * Created by kimsooyeon on 2016-05-07.
 */
public class MainUnit
{
    private int dan;
    private Scanner sc;

    public MainUnit()
    {
        sc=new Scanner(System.in);
    }

    public void gugudan()
    {
        System.out.print("원하는 단을 입력하세요:");
        dan=sc.nextInt();

        for(int i=1; i<=9; i++)
        {
            System.out.println(dan+"*"+i+"="+(dan*i));
        }
    }

    public static void main(String[] args)
    {
        MainUnit starter=new MainUnit();
        starter.gugudan();
    }
}