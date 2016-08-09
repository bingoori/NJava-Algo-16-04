package collection;

import java.util.Scanner;

/**
 * @package collection
 * @file InsertionSort.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 삽입정렬
 */
public class InsertionSort {
/**
 * 삽입 정렬(揷入整列, insertion sort)은 자료 배열의 모든 요소를 
 * 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 
 * 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
 * */
	public static void main(String[] args) {
//		int arr[] = new int[10];
		int arr[] = {56,87,34,65,98,12,72,86,55,23};
		int i = 0 , j =0 , k = 0 , temp = 0;
		Scanner s = new Scanner(System.in);
/*		for (i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하시오");
			//arr[i] = s.nextInt();
		}*/
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length-1; j++) {
				if (arr[j]> arr[j+1]) {
					// 스왑정렬
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 수 "+arr[i]+" ");
		}		
	}
}
