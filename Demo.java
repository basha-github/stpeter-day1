
public class Demo {

	public static void main(String[] args) {
		int amount = 15 ,n10=0,c5=0,c2=0,c1=0;
		
		System.out.println("Given Currency--->"+amount);
		
		
		if(amount > 10) {
			n10= amount / 10; // 1
			amount = amount -(n10 * 10);// 
		}
		// 5
		if(amount >= 5) {
			c5= amount / 5;
			amount = amount -(c5 * 5);// 13-10
		}
		if(amount >= 2) {// 2
			c2 = amount / 2;// 3 / 2-- 1
			amount = amount - (c2 * 2);// 4-4
		}
		
		if(amount > 0 ) {
			c1 = 1;
			//amount = amount - 2;
		}
		
		
		System.out.println("10 Note--->"+n10);
		
		System.out.println("5 Coins--->"+c5);
		System.out.println("2 Coins--->"+c2);
		System.out.println("1 Coins--->"+c1);
		
	}

}


