package com.pillowlux.exceptions;


	public class ProductNotFoundException extends RuntimeException {

		public ProductNotFoundException() {
		}

		public ProductNotFoundException(String message) {
			super(message);
		}

		public ProductNotFoundException(Throwable cause) {
			super(cause);
		}

		public ProductNotFoundException(String message, Throwable cause) {
			super(message, cause);
		}

		public ProductNotFoundException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}
	}
	
	


