import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.print("약수 : ");
		int sum = 0;
		for (int a = 1; num >= a; a++) {
			if (num == a) {
				System.out.println(a);
				sum++;
			} else if (num % a == 0) {
				System.out.print(a + ", ");
				sum++;
			}
		}
		System.out.println("약수의 개수 : " + sum);
//		
//		System.out.print("결과 : ");
//		for (int b = 1; num >= b; b++) {
//			if (num % b == 0 && num == b) {
//				System.out.print(b);
//				break;
//			} else if (num % b == 0) {
//				System.out.print(b);
//				System.out.print(", ");
//			}
//		}
		sc.close();
	}
}