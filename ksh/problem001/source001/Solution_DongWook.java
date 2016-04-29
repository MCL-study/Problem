package source001;

/**
 * Created by 동욱 on 2016-04-29.
 */
public class Solution_DongWook
{

    public static void main(String[] agrs)
    {
        int a = 50;
        int b = 100;
        int c = 0;
        {
            c = b;
            b = a;
            a = c;
        }
        System.out.println("a = " + a + " b = " + b);
    }
}
