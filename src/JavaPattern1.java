
public class JavaPattern1 {
		public static void main(String[] args) {
			int i, j,k;
			for (i=1;i <=6 ; i++) {
				for (j=6; j>i; j--) {
					System.out.print(" ");
				}
				for (k=1;k<(2*i) ; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

