package random;

import java.util.*;

public class randomgame {

	public static void main(String[] args)
	{
		int usernum;
		int random;
		int aaa;
		int result = 1;
		boolean loop = true;
		Random userrandom = new Random();
		Scanner innum = new Scanner(System.in);
		Scanner game = new Scanner(System.in);
		System.out.println("사용규칙 : 0부터 사용자가 입력한 숫자중 렌덤하게 하나를 만들어 냅니다. 사용자는 이 숫자를 맞추시면 됩니다.");
		System.out.print("숫자를 입력해 주세요 : ");
		usernum = innum.nextInt();
		random = userrandom.nextInt(usernum);
		System.out.println("게임이 시작되었습니다.");
		while(loop)
		{
			System.out.println("숫자를 입력해 주세요 : ");
			aaa = game.nextInt();
			if(random == aaa)
			{
				System.out.println("축하드립니다! " + result + "번 만에 숫자를 맞추셨습니다.");
				loop = false;
			}
			else if(aaa < 0)
			{
				System.out.println("입력한 숫자가 0보다 작습니다!");
			}
			else if(aaa > usernum)
			{
				System.out.println("사용자가 입력한 숫자보다 큽니다!");
			}
			else
			{
				System.out.println("틀렸습니다.");
				if(random < aaa)
				{
					System.out.println("입력한 숫자보다 랜덤숫자가 작습니다! 다시 도전해 주세요");
				}
				if(random > aaa)
				{
					System.out.println("입력한 숫자보다 랜덤숫자가 큽니다! 다시 도전해 주세요");
				}
				result++;
			}
		}
	}
}
