package source001;

public class Solution{

    public static void main(String[] args){
        int a=100;
        int b=50;
        System.out.println("A : "+a+" B : "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A : "+a+" B : "+b);
    }
}