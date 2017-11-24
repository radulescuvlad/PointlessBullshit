import java.util.Vector;

public class Entry {
	private Toughpick token;
	private String name;
	private String description;
	private Vector<Toughpick> seeAlso;
	
	public Entry(Toughpick token, String name, String description, Vector<Toughpick> seeAlso) {
		this.token = token;
		this.name = name;
		this.description = description;
		this.seeAlso = seeAlso;
	}
	
	public String name() {
		return name;
	}
	
	public String description() {
		return description;
	}
	
	public Vector<Toughpick> seeAlso() {
		return seeAlso;
	}
	
	@Override
	public boolean equals(Object arg) {
		if ((arg != null) && (arg instanceof Entry)) {
			return ((Entry)arg).token == this.token;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int n = seeAlso.size();
		for (int i = 0; i < n; ++i) {
			if (seeAlso.elementAt(i).equals(token)) {
				return i;
			}
		}
		return -1; // Should never do this, obviously.
	}
}
