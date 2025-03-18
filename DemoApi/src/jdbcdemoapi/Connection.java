package jdbcdemoapi;

public interface Connection {

	public void commit();
	public void rollback();
	public void close();
}
