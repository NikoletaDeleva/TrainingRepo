package velikden;

import java.time.LocalDateTime;

import javax.xml.crypto.Data;

public class Qice {
	private VidQive vidQice;
	private Data date;
	private LocalDateTime time;
	private Cvqt cvqt;
	
	public Qice() {
		this.setVidQice(this.vidQice = VidQive.values()[(int) (Math.random()*(VidQive.values().length))]);
	}


	public Data getDate() {
		return date;
	}

	public void setDate(Data date) {
		this.date = date;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}


	public Cvqt getCvqt() {
		return cvqt;
	}


	public void setCvqt(Cvqt cvqt) {
		this.cvqt = cvqt;
	}


	public VidQive getVidQice() {
		return vidQice;
	}


	public VidQive setVidQice(VidQive vidQice) {
		this.vidQice = vidQice;
		return vidQice;
	}


	public void naprviShareno() {
		
		
	}
	
}
