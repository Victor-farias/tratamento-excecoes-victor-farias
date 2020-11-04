package model.exceptions;

public class DomainException extends Exception{
	//RuntimeException --> O compilador n�o lhe obriga a trat�-la
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
		
	}
}
