package Test1;

public class SonByeongGwan {
	public static void main(String[] args) {
		int n[][] = new int[3][4];
		int sum = 0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (int)(Math.random()*9);
				sum += n[i][j];
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
	}
}
