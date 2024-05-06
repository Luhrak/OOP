package lab5;

class DatabaseConnection {
	static private DatabaseConnection instance;
	
	
	private DatabaseConnection() {
	}

	static public DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
}