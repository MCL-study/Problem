package source002;

import java.util.*;

public class pyramid_dongwook
{
    public static void main(String[] args)
    {
        int choicenum = 0;
        int choiceflow = 0;
        boolean real = true;
        boolean loop = true;
        Scanner choice = new Scanner(System.in);
        Scanner flow = new Scanner(System.in);
        while(loop)
        {
            System.out.println("1번은 입력하시면 피라미드를, 2번을 입력하시면 역 피라미드를 만들 수 있습니다.");
            System.out.print("만들고 싶으신 피라미드 번호를 입력해 주세요 : ");
            choicenum = choice.nextInt();
            if(choicenum == 1)
            {
                System.out.println("피라미드를 선택하였습니다. 초기화면으로 돌아가시려면 0번을 입력해 주세요.");
                System.out.print("층수룰 입력해 주세요 : ");
                choiceflow = flow.nextInt();
                int count = choiceflow-1;
                if(choiceflow != 0)
                {
                    while(real)
                    {
                        for(int i = 1;i<=count;i++)
                        {
                            System.out.print(" ");
                        }
                        for(int j = choiceflow; j>count;j--)
                        {
                            System.out.print("★");
                        }
                        System.out.println();
                        count--;
                        if(count==-1)
                        {
                            real = false;
                        }
                    }
                    loop = false;
                }
            }
            else if(choicenum == 2)
            {
                System.out.println("역피라미드를 선택하였습니다. 초기화면으로 돌아가시려면 0번을 입력해 주세요.");
                System.out.print("층수를 입력해 주세요 : ");
                choiceflow = flow.nextInt();
                int count = choiceflow-1;
                int boo = count;
                if(choiceflow !=0)
                {
                    while(real)
                    {
                        for(int i = count;i<boo;i++)
                        {
                            System.out.print(" ");
                        }
                        for(int i = 0; i<=count;i++)
                        {
                            System.out.print("★");
                        }
                        System.out.println();
                        count--;
                        if(count==-1)
                        {
                            real = false;
                        }
                    }
                    loop = false;
                }
            }
            else
            {
                System.out.println("1과 2중에 하나를 선택해 주세요! 처음으로 돌아가겠습니다.");
            }
        }
    }
}
