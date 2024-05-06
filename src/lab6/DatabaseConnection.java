package lab6;

class DatabaseConnection {
	static private DatabaseConnection instance = null;
	
	
	private DatabaseConnection() {
	}

	static public DatabaseConnection getInstance() {
		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
}