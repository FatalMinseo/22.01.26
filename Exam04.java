
public class Exam04 {

	public static void main(String[] args) {

		// �ڷᱸ��
			// Push - ����
			// Pop - �ҷ���
				// Queue ���� 
					// FIFO - ���� �� ���� ���� ó��
				// Stack
					// FILO - ���� �� ���� ���߿� ó��
				// Tree
					// �ش� ������ ����
				// List
					// name ����
				// Array
					// index 0 ���� �����ϴ� ��ȣ ������ �ű�
					// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		
			// ���� 5�� ������ �迭 array ����
		
		int[] array  = new int[5]; // int array [];
		// int �迭Ÿ�� [] �迭 ���� array �迭�� ���� ���۷��� ���� 
		// new �迭 ���Ӱ� ���� int Ÿ�� [5] ���� ����
		array[0] = 27;
		array[1] = 30;
		array[2] = 15;
		array[3] = 44;
		array[4] = 31;
		// array[5] = 77; �迭�� index �� �������� ������ ������ ���� ����
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// Index 5 out of bounds for length 5 at Exam04.main(Exam04.java:31)
		
		System.out.println(array[0]);
		
	}

}
