package DemoApi;

public class SessionFactoryImpl implements SessionFactory {

	@Override
	public Session openSession() {
		
		return new SessionImpl();
	}

}
