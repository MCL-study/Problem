package source001;
import java.util.*;

/**
 * Created by 동욱 on 2016-05-03.
 */
public class dongwook_telephone
{

    public static void main(String[] args)
    {
        String phonenum;
        Scanner num = new Scanner(System.in);
        System.out.print("10자리 숫자를 입력해 주세요 : ");
        phonenum = num.nextLine();
        System.out.println(phonenum.substring(0,3) + ") " + phonenum.substring(3,7) + " - " + phonenum.substring(7));
    }
}
