package pkg1;

public class main {

	public static void main(String[] args) {
		int[][] a = new int[][]{ null, { 34, 35 }, { 234, -34, 34 }, {}, null, { 1, 17, 3, 145 }};
		int x = 5;
		System.out.println("Anzahl " + getAnzGroesserAls(a, x));
	}
	
	private static int getAnzGroesserAls(int[][] a, int b){
		int sum = 0;
		if(a != null && a.length > 0){
		for(int i = 0; i < a.length; i++){
				if( a[i] != null && a[i].length > 0){
				for(int j = 0; j < a[i].length; j++){
					if(a != null && a[i][j] > b)
						System.out.println(a[i][j]);
						sum++;
					}
				}
			}			
		}
		return sum;
	}
}
