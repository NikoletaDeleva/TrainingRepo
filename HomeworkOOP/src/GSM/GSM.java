package GSM;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	String lastIncomingCall;
	String lastOutgoingCall;
	double outgoingCallsDuration;
	Call call;

	GSM() {
		call = new Call();
	}

	void insertSimCard(String simMobileNumber) {
		if (this.hasSimCard == false) {
			if (simMobileNumber != null) {
				if (simMobileNumber.trim().length() == 10) {
					for (int index = 0; index < simMobileNumber.length(); index++) {
						if (simMobileNumber.charAt(index) < '0' || simMobileNumber.charAt(index) > '9') {
							System.out.println("Invalid");
						} else {
							this.simMobileNumber = simMobileNumber;
							this.hasSimCard = true;
						}
					}
				} else {
					System.out.println("Invalid");
				}

			} else {
				System.out.println("Invalid");
			}
		} else {
			System.out.println("Already has card!");
		}
	}

	void removeSimCard() {
		this.simMobileNumber = null;
		this.hasSimCard = false;
	}

	void call(double duration, GSM receiver) {
		if (this != null && receiver != null && this != receiver && duration > 0 && this.hasSimCard == true
				&& receiver.hasSimCard == true) {

			this.outgoingCallsDuration += duration;
			this.lastOutgoingCall = receiver.model;
			receiver.lastIncomingCall = this.model;
			call.duration = duration;
			call.caller = this;
			call.receiver = receiver;

		} else {

			System.out.println("Invalid operation");
		}

	}

	void printSumForCall() {
		System.out.println(this.call.getSumForCall());
	}

	void printInfoForTheLastOutgoingCall() {
		System.out.println("Telefon " + this.model + " s nomer " + this.simMobileNumber
				+ " se obadi na " + call.receiver.model + " s nomer "+ call.receiver.simMobileNumber + ". Produljitelnosta na razgovora e bila " + call.duration + " min. I cenata na razgovora e " + call.priceForCall + " leva.");
	}

}
