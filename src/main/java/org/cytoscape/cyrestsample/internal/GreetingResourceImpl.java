package org.cytoscape.cyrestsample.internal;


public class GreetingResourceImpl implements GreetingResource
{
    public SimpleMessage greeting()
    {
    	  return new SimpleMessage("Hello!");
    }
}