package org.cytoscape.cyrestsample.internal;

public class NumberedMessage {
	Long id;
	String message;
	
	public NumberedMessage(){	
	}
	
	public NumberedMessage(Long id, String message){
		this.id = id;
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
