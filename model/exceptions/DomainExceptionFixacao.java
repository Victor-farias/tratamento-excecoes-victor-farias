package model.exceptions;

public class DomainExceptionFixacao extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DomainExceptionFixacao(String msg) {
		super(msg);
	}
}
