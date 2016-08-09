package series;

/**
 * @package series
 * @file Fibonacci.java
 * @author sdwoo90@gmail.com
 * @Date : 2016. 4. 4.
 * @Story : 피보나치
 * 
 *        [문제] 1+1+2+3+5+8+13+..... 순서로 나열되는 피보나치 수열의 20번째 항까지의 합계를 구하는 순서도를
 *        작성하시오 [피보나치] 피보나치 수열은 첫뻔쩨 + 두번째 항으로 세번째 항을 만들고, 두번째항 + 세번째 항 = 네번째 항
 *        [변수] a : 첫번째 b : 두번째 c : 세번째(a+b) cnt : 항의 갯수 sum : 합계 [결과] 피보나치 20까지의
 *        항까지의 합 : 17710
 */
public class Fibonacci {
	public static void main(String[] args) {
		int a = 1 , b= 1 , c = 2,cnt=2,sum=2;
		while(true)
		{
		if(cnt<20){
		c = a + b;
		sum += c;
		cnt++;
			continue;
		}else
		{
			break;
		}
		}
		System.out.printf("%d",sum);
		
	}

}
