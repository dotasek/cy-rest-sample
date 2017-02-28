package org.cytoscape.cyrestsample.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.NotFoundException;

public class MessageMapImpl implements MessageMap{

	Long counter = 0l;
	Map<Long, NumberedMessage> messages = new HashMap<Long, NumberedMessage>();
	
	@Override
	public NumberedMessage getMessage(Long messageId) {
		if (!messages.containsKey(messageId))
		{
			throw new NotFoundException();
		}
		return messages.get(messageId);
	}

	@Override
	public  NumberedMessage postMessage(NumberedMessage message) {
		long id = counter;
		counter++;
		NumberedMessage newMessage = new NumberedMessage(id, message.message);
		messages.put(id, newMessage);
		return messages.put(id, newMessage);
	}

	@Override
	public NumberedMessage deleteMessage(Long messageId) {
		if (!messages.containsKey(messageId))
		{
			throw new NotFoundException();
		}
		return messages.remove(messageId);
	}

	@Override
	public NumberedMessage putMessage(Long messageId, NumberedMessage message) 
	{
		if (!messages.containsKey(messageId))
		{
			throw new NotFoundException();
		}
		messages.put(messageId, message);
		return messages.put(messageId, message);
	}

	@Override
	public Collection<NumberedMessage> getMessages() {
		
		return messages.values();
	}

}
