package threads;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Kon> kone = new ArrayList<Kon>();
		for(int konNomer = 0; konNomer< 10; konNomer++) {
			Kon kon = new Kon("kon");
			kone.add(kon);
		}
		
		for(int index = 0; index< kone.size(); index++ ) {
			new Thread(kone.get(index)).start();
		}
	}
}
