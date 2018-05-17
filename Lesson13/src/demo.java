
public class demo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int x = 5;
		int y = 2;
		long n = 600000L;
		
		for(long i = 1; i<=n; i*=2){
			x+=y;

		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
