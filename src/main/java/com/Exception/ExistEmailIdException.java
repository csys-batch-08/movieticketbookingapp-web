package com.Exception;

public class ExistEmailIdException  extends Exception
	{
		@Override
		public String getMessage()
		{
			return "Entered MailID is  already registered...";
			
		}
	}




