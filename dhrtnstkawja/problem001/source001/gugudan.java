package source001;
import java.util.*;

/**
 * Created by 동욱 on 2016-04-29.
 */
public class gugudan {

    public static void main(String[] args)
    {
        int su;
        int gob;
        Scanner input = new Scanner(System.in);
        System.out.print("구구단을 표시할 숫자를 입력해 주세요 : ");
        su = input.nextInt();
        for(int i = 1;i<=9;i++)
        {
            gob = su*i;
            System.out.println(su + "*" + i + "=" + gob);
        }
    }
}
