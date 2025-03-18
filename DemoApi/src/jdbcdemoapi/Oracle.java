package jdbcdemoapi;

public class Oracle implements Connection {

	@Override
	public void commit() {
		System.out.println("commit-Oracle");
		
	}

	@Override
	public void rollback() {
		System.out.println("rollback-oracle");
		
	}

	@Override
	public void close() {
		System.out.println("close-oracle");
		
	}

}
