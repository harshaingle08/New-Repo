package jdbcdemoapi;

public class Test {

	public static void main(String[] args) {
		
		Connection con = DriveManager.getConnection("Oracle","System","System");

		con.commit();
		con.rollback();
		con.close();
	}

}
