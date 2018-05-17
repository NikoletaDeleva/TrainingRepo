package GSM;

public class Starter {
	public static void main(String[] args) {
		GSM nokia = new GSM();
		
		nokia.model = "nokia";
		
		nokia.insertSimCard("0877648251");
		
		GSM samsung = new GSM();
		samsung.model = "samsung";
		
		samsung.insertSimCard("0876374964");
		
		nokia.call(5, samsung);
		
		System.out.println(nokia.outgoingCallsDuration);
		
		nokia.printSumForCall();

		nokia.printInfoForTheLastOutgoingCall();
		
	}
}
