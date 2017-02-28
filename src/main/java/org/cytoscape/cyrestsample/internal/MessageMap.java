package org.cytoscape.cyrestsample.internal;

import java.util.Collection;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message")
public interface MessageMap 
{
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<NumberedMessage> getMessages();
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public NumberedMessage getMessage(@PathParam("messageId") Long messageId);
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public NumberedMessage postMessage(NumberedMessage numberedMessage);
	
	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public NumberedMessage deleteMessage(@PathParam("messageId") Long messageId);
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public NumberedMessage putMessage(@PathParam("messageId") Long messageId, NumberedMessage message);
}
