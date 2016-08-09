package collection;

import java.util.Scanner;

/**
 * @package collection
 * @file SelectionSort.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story :
 */
public class SelectionSort {
/**
 * 선택 정렬(選擇整列, selection sort)은 제자리 정렬 알고리즘의 하나로, 다음과 같은 순서로 이루어진다.
 *
 * 주어진 리스트 중에 최솟값을 찾는다.
 * 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
 * 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
 * */
	public static void main(String[] args) {
		int arr[] = new int[10];
		int i = 0 , j =0 , k = 0 , temp = 0;
		Scanner s = new Scanner(System.in);
		for (i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하시오");
			arr[i] = s.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
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
