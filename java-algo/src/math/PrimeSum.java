package math;

import java.util.Scanner;

/**
 * @package math
 * @file PrimeSum.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 
 * [문제]
 * 임의의 정수를 입력받아 그안에 포함된 소수의 합을
 * 구하는 순서도를 작성하시오
 * 예를 들어 10을 입력받았다면 2 ~ 10 사이에 속한
 * 소수의 합을 계산한다.
 * [변수]
 * limit : 소수를 구할 숫자 범위의 한계
 * sum : 소수가 누적된 합계
 * i : limit 까지 1씩 증가
 * j : 소수인지 판별할 제수
 * [결과]
 * 입력된 정수까지 소수의 합을 구할 정수 입력(만약 7이라면)
 * 7
 * 소수 : 2
 * 소수 : 3
 * 소수 : 5
 * 소수 : 7
 * 7 까지의 소수들의 합: 17
 */
public class PrimeSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("입력된 정수까지 소수의 합을 구할 정수 입력");
	int limit = sc.nextInt(), target = 2, j = 2, sum = 0;
	
	while(true)	{
		j = 2;
	      while(true) {
	            if(target % j == 0) {
	                break;
	            }
	            j++;
	        }
	        if(target < limit) {
	            target++;
	            continue;
	        }else {
	        	break;
	        }
	    } 
	}
}

