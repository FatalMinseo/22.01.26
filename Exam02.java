
public class Exam02 {

	public static void main(String[] args) {

		for (int a = 2; a <= 30; a++) {
			System.out.print(a + "ÀÇ ¾à¼ö : ");
			for (int b = 1; b <= a; b++) {
				if (a == b) {
					System.out.println(b);
				} else if (a % b == 0) {
					System.out.print(b + " ");
				}

			}
		}
	}
}
