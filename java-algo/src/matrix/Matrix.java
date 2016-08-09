package matrix;

public class Matrix {
public static void main(String[] args) {
	int len = 5, col = 0, row = 0, val = 0;
	int[][] arr = new int[len][len];
	
	for (col = 0;  col < len; col++) {
		for (row = 0;  row < len; row++) {
			val++;
			arr[col][row] = val;
			System.out.print(arr[col][row]+"\t");
		}
		System.out.println();
	}
	
}
}
