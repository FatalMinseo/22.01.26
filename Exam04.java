
public class Exam04 {

	public static void main(String[] args) {

		// 자료구조
			// Push - 저장
			// Pop - 불러옴
				// Queue 저장 
					// FIFO - 먼저 들어간 것이 먼저 처리
				// Stack
					// FILO - 먼저 들어간 것이 나중에 처리
				// Tree
					// 해당 가지에 저장
				// List
					// name 존재
				// Array
					// index 0 부터 시작하는 번호 순서를 매김
					// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		
			// 길이 5인 정수형 배열 array 생성
		
		int[] array  = new int[5]; // int array [];
		// int 배열타입 [] 배열 선언 array 배열에 대한 레퍼런스 변수 
		// new 배열 새롭게 생성 int 타입 [5] 원소 개수
		array[0] = 27;
		array[1] = 30;
		array[2] = 15;
		array[3] = 44;
		array[4] = 31;
		// array[5] = 77; 배열의 index 에 존재하지 않으면 컴파일 이후 에러
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// Index 5 out of bounds for length 5 at Exam04.main(Exam04.java:31)
		
		System.out.println(array[0]);
		
	}

}
