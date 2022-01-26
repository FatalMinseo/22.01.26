
public class Exam03 {

	public static void main(String[] args) {

		for (int a = 1; a <= 1000; a++) {
			int sum = 0;
			for (int b = 1; b <= a / 2; b++) {
				if (a % b == 0) {
					sum += b;
				}
			}
			if (a == sum) {
				System.out.println(a);
			}
		}
	}
}
