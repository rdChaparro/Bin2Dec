package errors;

	@SuppressWarnings("serial")
	public class NoBinaryException extends Exception {

		public NoBinaryException() {
			super();
		}

		public NoBinaryException(String message, Throwable err) {

			super(message, err);

		}
	}

