package musicalInstruments;
 class ShopException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8585907578844112608L;

	public ShopException() {
		super();
	}

	public ShopException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ShopException(String message, Throwable cause) {
		super(message, cause);
	}

	public ShopException(String message) {
		super(message);
	}

	public ShopException(Throwable cause) {
		super(cause);
	}

}
