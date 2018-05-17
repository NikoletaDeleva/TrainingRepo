package musicalInstruments;
 class InstrumentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4634667288548325317L;

	public InstrumentException() {
		super();
	}

	public InstrumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InstrumentException(String message, Throwable cause) {
		super(message, cause);
	}

	public InstrumentException(String message) {
		super(message);
	}

	public InstrumentException(Throwable cause) {
		super(cause);
	}

}
