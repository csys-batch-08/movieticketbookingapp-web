package com.Exception;

public class InvalidUserException extends Exception{
	 @Override
	public String getMessage()
	{
		return "Entered Correct Password...";
	}
}

