package CodingTest.Day1;
//Distinct n Coupoons Numvbe
public class Coupons {
	public static void main(String[] args) {
		generateCoupons(7);
	}
	
	private static void generateCoupons(int nRandoms) {
		int ar[] = new int[nRandoms];
		ar[0] = (int)(Math.random()*nRandoms*10);
		int index=1;
		while(index <nRandoms) {
			int rno = (int)(Math.random()*nRandoms*10);
			boolean flag = true;
			for(int i=0 ; i<index ; i++) {
				if(ar[i]==rno) {
					flag = false;
				}
			}
			
			if(flag)
				ar[index++] = rno;
			}
			System.out.println("Coupons :");
			for(int i=0 ; i<index ; i++) {
				System.out.println(ar[i]);
			}
		}
		


	/*STATIC VOID RANDOMCOUPON() {
		CHAR CH[] ="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ".TOCHARARRAY();
		INT MAX =26;
		INT RANDOM = (INT) (MATH.RANDOM()*MAX);
		
	}*/

}
