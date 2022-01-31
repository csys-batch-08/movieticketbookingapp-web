package com.Exception;

public class ExistMobileNoException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

		@Override
		public String getMessage()
		{
			return "Entered Mobilenumber is  already registered...";
		}
	}





