package matrix;

public class MatrixChange {
/**
 * [변환전]
	1	2	3
	4	5	6
	7	8	9
	10	11	12
	13	14	15
	[변환후]
	
 *  1	2	3	4	5	
	6	7	8	9	10	
	11	12	13	14	15	
 * */
	public static void main(String[] args) {
		int len3 = 3, len5 = 5, col = 0, row = 0, val = 0;
		int[][] arr = new int[len5][len5];
		
		for (col = 0;  col < len5; col++) {
			for (row = 0;  row < len3; row++) {
				val++;
				arr[col][row] = val;
				System.out.print(arr[col][row]+"\t");
			}
			System.out.println();
		}
		val = 0;
		System.out.println();
		for (col = 0;  col < len3; col++) {
			for (row = 0;  row < len5; row++) {
				val++;
				arr[col][row] = val;
				System.out.print(arr[col][row]+"\t");
			}
			System.out.println();
		}
	}
}
