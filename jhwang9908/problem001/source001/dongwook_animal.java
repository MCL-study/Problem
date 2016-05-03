package network;

import java.io.*;
import java.util.Scanner;

public class net
{
	public static void main(String[] agrs) throws IOException
	{
		int first;
		int second;
		int sum;
		Scanner dog = new Scanner(System.in);
		Scanner duck = new Scanner(System.in);
		System.out.print("강아지의 마릿수를 입력해 주세요 : ");
		first = dog.nextInt();
		System.out.print("오리의 마릿수를 입력해 주세요 : ");
		second = duck.nextInt();
		sum = (first*4) + (second*2);
		System.out.println("두 동물의 다리의 합은 " + sum + "입니다.");
	}
}
