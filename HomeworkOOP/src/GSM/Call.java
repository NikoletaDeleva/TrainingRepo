package GSM;

public class Call {
	static double pricePerMinute = 0.24;

	GSM caller;
	GSM receiver;
	double duration;
	double priceForCall;
	
	double getSumForCall() {

		if (this != null && duration > 0) {
			priceForCall = this.duration * pricePerMinute;
			return priceForCall;
		} else {
			return 0;
		}

	}
}
