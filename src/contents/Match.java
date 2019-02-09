package contents;

public class Match {
	private String atributeName;
	private String value;
	
	public Match(String atributeName, String value) {
		this.atributeName = atributeName;
		this.value = value;
	}

	public String getAtributeName() {
		return atributeName;
	}

	public String getValue() {
		return value;
	}
}
