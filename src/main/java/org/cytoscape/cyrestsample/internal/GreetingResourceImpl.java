package org.cytoscape.cyrestsample.internal;

public class GreetingResourceImpl implements GreetingResource
{
	private SimpleMessage message = new SimpleMessage("Hello!");
	
	@Override
    public SimpleMessage greeting() {
		return message;
    }
}