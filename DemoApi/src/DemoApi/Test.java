package DemoApi;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf= new SessionFactoryImpl();
		
		Session session = sf.openSession();
		
		session.save();
		session.display();
	}

}
