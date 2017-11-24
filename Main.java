import java.util.Vector;

public class Main {
	private static final Vector<Entry> entries = new Vector<Entry>();
	private static final String newline = System.getProperty("line.separator");

	public static void main(String[] args) {
		makeEntries();
	}

	private static void makeEntries() {
		Toughpick token = Toughpick.Adept;
		String name = "Adept";
		String description = "One who has taken what amounts to the Postgraduate Course in Magic. If a Magic" + newline
				+ "user is given this title, you can be sure she/he is fairly hot stuff. However," + newline
				+ "the title is neutral and does not imply that the Adept is either good or evil." + newline
				+ "Examine carefully each Adept you encounter and be cautious, even if she/he" + newline
				+ "becomes friendly. See Colour Coding for the best way of telling friends from" + newline + "enemies."
				+ newline;
		Vector<Toughpick> seeAlso = new Vector<Toughpick>();
		seeAlso.add(Toughpick.Magic);
		seeAlso.add(Toughpick.MagicUsers);
		seeAlso.add(Toughpick.Good);
		seeAlso.add(Toughpick.Evil);
		seeAlso.add(Toughpick.ColorCoding);
		entries.add(new Entry(token, name, description, seeAlso));

		token = Toughpick.Alleys;
		name = "Alley";
		description = "Alleys are the most frequent type of Road in a city or town. They are always" + newline
				+ "narrow and dark and squishy, and they frequently dead-end. You will escape along" + newline
				+ "them when pursued, and also be ambushed there." + newline;
		seeAlso = new Vector<Toughpick>();
		seeAlso.add(Toughpick.Roads);
		seeAlso.add(Toughpick.Cities);
		seeAlso.add(Toughpick.Towns);
		seeAlso.add(Toughpick.Ambushes);
		seeAlso.add(Toughpick.Refuse);
		seeAlso.add(Toughpick.Squalor);
		entries.add(new Entry(token, name, description, seeAlso));
	}
}
