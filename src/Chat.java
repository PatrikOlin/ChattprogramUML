import java.util.List;

public interface Chat {

	public void addMessage(Message msg);
	public List<Message> getMessages();
	
}
