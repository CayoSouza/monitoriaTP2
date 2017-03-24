package algorithm100;

import java.util.Scanner;

public class Main {
	
	public static int maxCycle(int n1, int n2){
		if(n1>n2){
			//swap sem variavel temporaria
			n1 += n2;
			n2 = n1 - n2;
			n1 -= n2;
		}
		
		int count, result;
		int maxCount = 0;
		
		while(n1 <= n2){
			count = 1;
			result = calcThreeNOne(n1);
			count++;
			while(result != 1){
				result = calcThreeNOne(result);
				count++;
			}
			maxCount = (maxCount > count) ? maxCount : count;
			n1++;
		}
		
		return maxCount;
	}

	private static int calcThreeNOne(int n) {
		if(n==1)
			return 1;
		else if(n % 2 != 0)
			return 3*n+1;
		else
			return n/2;
	}

	public static void main(String[] args) {
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextInt()){
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();
			System.out.println(n1 + " " + n2 + " " + maxCycle(n1, n2));
		}
		
		scanner.close();
	}

}
