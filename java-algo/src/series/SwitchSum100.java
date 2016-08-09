package series;

/**
 * @package series
 * @file SwitchSum100.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 스위치 변수 이용하기
 */

public class SwitchSum100 {
	/**
	 * [문제]
	 * 1 - 2 + 3 - 4 + 5 ... + 99 - 100 까지의 합계를 구하는 순서도를 작성하시오
	 * */
	public static void main(String[] args) {
	    int i = 0, sum = 0, sw =0;

	      while (true) {
	         i++;
	         if (sw == 0) {
	            sum += i;
	            sw = 1;
	         } else {
	            sum -= i;
	            sw = 0;
	         }
	         
	         
	         
	         if (i < 100)
	            continue;
	         else
	            break;
	      }
	      System.out.printf("결과 : %d",sum);
	   
	}
}
