package jdbcdemoapi;

public class Mysql implements Connection {

	@Override
	public void commit() {
		System.out.println("commit-mysql");
	}

	@Override
	public void rollback() {
		System.out.println("rollback -mysql");
		
	}

	@Override
	public void close() {
		System.out.println("close-mysql");
		
	}

}
