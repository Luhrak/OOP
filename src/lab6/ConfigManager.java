package lab6;

class ConfigManager {
	static private ConfigManager instance = null;
	
	
	private ConfigManager() {
	}

	static public ConfigManager getInstance() {
		if (instance == null) {
			instance = new ConfigManager();
		}
		return instance;
	}
	
	int value;
	
	public void setValue(int i) {
		this.value = i; 
	}
	
	public int getValue() {
		return this.value;
	}
	
}