package com.Exception;

public class ExistEmailIdException  extends Exception
	{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Override
		public String getMessage()
		{
			return "Entered MailID is  already registered...";
			
		}
	}




