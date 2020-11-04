package model.exceptions;

public class DomainException extends Exception{
	//RuntimeException --> O compilador não lhe obriga a tratá-la
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
		
	}
}
