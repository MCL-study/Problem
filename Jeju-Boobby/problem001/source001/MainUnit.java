package source001;

import java.util.Scanner;

/**
 * Created by kimsooyeon on 2016-05-07.
 */
public class MainUnit
{
    private String num;
    private Scanner sc;

    public MainUnit()
    {
        sc=new Scanner(System.in);
    }

    public void control()
    {
        do
        {
            System.out.println("10자리의 숫자를 입력하세요.");
            num=sc.next();
        }while(num.length()!=10);

        System.out.println(num.substring(0,3)+")"+num.substring(3,6)+"-"+num.substring(6,10));
    }

    public static void main(String[] args)
    {
        MainUnit starter=new MainUnit();
        starter.control();
    }
}
