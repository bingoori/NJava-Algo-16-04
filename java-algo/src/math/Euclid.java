package math;

import java.util.Scanner;

/**
 * @package math
 * @file Euclid.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 유클리드 호제법으로 최대공약수와 최소공배수 구하기
 * 
 * [문제]
 *  두 수를 입력받아 두 수의 최대공약수와 최소 공배수를 계산해서
 *  출력하는 순서도를 작성하시오
 * [유클리드 호제법]
 *  2개의 정수의 최대공약수를 구하는 알고리즘의 하나.
 *  호제법이란 두 수가 서로 상대방 수를 나누어서 
 *  결국 원하는 수를 얻는 알고리즘을 나타낸다
 *  예를들어 15와 12의 최대공약수를 구한다면
 *  두수 중 큰 수를 결정하여(15) 큰 수를 작은 수로 나눈다
 *  15/12 = 1...3
 *  nmg가 0 이 아니므로 작은 수를 큰 수로 하고
 *  nmg를 작은 수로 하여 다시 계산한다.
 *  12/3 은 nmg가 0 이므로
 *  이떄 3은 12와 15의 최대공약수가 된다.
 *  최소공배수는 두수를 곱한 후 이값을 최대 공약수로 나누면 된다.
 *  (12*15)/3 = 60
 *  [변수]
 *  a,b : 입력받은 두수
 *  big , samll : 두수 중 크고 작은 수를 결정하여 담은 변수
 *  mok , nmg 
 *  gcd : 최대 공약수 greatest common demominatior
 *  lcm : 최소 공배수 least common multiple
 * 
 */
public class Euclid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("최대 공약수와 최소 공배수 구하는 두 수 입력");
	int a = sc.nextInt(), b= sc.nextInt(), big = 0, small =0, gcd = 0, lcm = 0, nmg =0,mok = 0;
	while(true)
	{
		//mok = ?
		//nmg = ?
		nmg = a / b; 
		if(nmg ==0){
			//gcd = ? 최대 공약수
			//lcm = ? 최소 공배수
			System.out.printf("최대 공약수  %d,최소 공배수 %d",gcd,lcm);
			break;
		}else{
			big = small;
			small = nmg;
			continue;
		}
	}
}
}
