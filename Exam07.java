
public class Exam07 {

	public static void main(String[] args) {

		// ���̰� 5�� �迭�� �����
		// 1,2,3,4,5 ���� �� �ε��� 0��° ���� ������ ����
		// �迭�ȿ� ��� ���� ����Ͻÿ�

		int[] array = new int[10];
		for (int i= 0; i< array.length ; i++) {
			array[i] =i+1;
			System.out.println(array[i]);
		}
		System.out.println();
		for (int a = 0; a < array.length ; a++) {
			System.out.println(array[a]);
		}
	}
}
