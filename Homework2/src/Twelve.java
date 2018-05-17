
public class Twelve {
	public static void main(String[] args) {
		for(int count=100; count<=999; count++) {
			byte first, second, third;
			first= (byte) (count/100);
			second= (byte) ((count%100)/10);
			third= (byte) (count%10);
			if(first==second || first==third || second==third) {
				continue;
			}else {
				System.out.println(count);
			}
		}
	}
}
