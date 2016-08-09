package math;

import java.util.Scanner;

/**
 * @package math
 * @file PrimeFactorzation.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 소인수 분해
 */
public class PrimeFactorzation {
/**
 * [문제]
 * 	정수를 입력받아 소인수를 구해 출력하는 순서도를 작성하시오
 * [소인수]
 * 1보다 큰 양의 정수 n을 유한계의 소수의 곱으로 쓸 수 있는데,
 * p1,2p,3p...,pk 를 n의 소인수  , n = p1p2p3...pk 를 n의 소인수 분해라고 한다.
 * [변수]
 *  primes[] : 소인수가 저장될 배열
 *  target : 소인수 분해 할 입력 값
 *  i : 배열의 인덱스
 *  jesu : 소인수 인지 판별 값
 *  e : 소인수 분해 할 값의 제곱근
 *  [결과]
 *  소인수 분해 할 숫자를 입력
 *  30
 *  2   3   5
 * 
 * 
 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] primes = new int[10];
		int target = sc.nextInt(),e = 0 , i = 0 , jesu = 2, sum = 0 , mok = 0 , nmg = 0;
		while(true)	{
			e = (int) Math.sqrt(target);
			while(true){
				if(jesu > e) {
					jesu = target;
					break;
				}else{
					//mok =?
					//nmg =?
					if(nmg !=0){
						jesu ++;
						continue;
					}else{
						break;
					}
				}
			}
		}
	}
}
