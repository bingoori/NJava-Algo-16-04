package collection;

import java.util.Scanner;

/**
 * @package collection
 * @file BubbleSort.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 버블정렬
 */
public class BubbleSort {
/**
 * [문제]
 * 배열에 기억된 10건의 자료를 오름차순으로 정렬하는 순서도를 작성하시오
 * [버블정렬]
 * 첫번째 데이터와 두번째 데이터를 비교하여 교환하면서 자료를 정렬한다
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
		for (i = 0; i < arr.length-1; i++) {
			
			for (j = 0; j < arr.length-1; j++) {
				if (arr[i] < arr[j+1]) {
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
