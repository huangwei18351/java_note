
public interface Subject {
	public void attach(Observer observer);
	public void detach(Observer observer);
	public void Notify();
	public String getAction();
	public void setAction(String action);
}
