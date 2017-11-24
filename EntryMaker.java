import java.util.Vector;

public final class EntryMaker {
	private static Toughpick token;
	private static String name;
	private static String description;
	private static Vector<Toughpick> seeAlso;
	private static final String newline = System.getProperty("line.separator");

	public static void run(Vector<Entry> entries) {
		token = Toughpick.Adept;
		name = "Adept";
		description = "One who has taken what amounts to the Postgraduate Course in Magic. If a Magic" + newline
				+ "user is given this title, you can be sure she/he is fairly hot stuff. However," + newline
				+ "the title is neutral and does not imply that the Adept is either good or evil." + newline
				+ "Examine carefully each Adept you encounter and be cautious, even if she/he" + newline
				+ "becomes friendly. See Colour Coding for the best way of telling friends from" + newline + "enemies."
				+ newline;
		seeAlso = new Vector<Toughpick>();
		seeAlso.addElement(Toughpick.Magic);
		seeAlso.addElement(Toughpick.MagicUsers);
		seeAlso.addElement(Toughpick.Good);
		seeAlso.addElement(Toughpick.Evil);
		seeAlso.addElement(Toughpick.ColorCoding);
		entries.addElement(new Entry(token, name, description, seeAlso));

		token = Toughpick.Alleys;
		name = "Alley";
		description = "Alleys are the most frequent type of Road in a city or town. They are always" + newline
				+ "narrow and dark and squishy, and they frequently dead-end. You will escape along" + newline
				+ "them when pursued, and also be ambushed there." + newline;
		seeAlso = new Vector<Toughpick>();
		seeAlso.addElement(Toughpick.Roads);
		seeAlso.addElement(Toughpick.Cities);
		seeAlso.addElement(Toughpick.Towns);
		seeAlso.addElement(Toughpick.Ambushes);
		seeAlso.addElement(Toughpick.Refuse);
		seeAlso.addElement(Toughpick.Squalor);
		entries.addElement(new Entry(token, name, description, seeAlso));

		token = Toughpick.Alligators;
		name = "Alligators";
		description = "Probably extinct in Fantasyland and now to be found only in a mummified state" + newline
				+ "hanging from the rafters of a wizard's workroom. If the alligator is present, it" + newline
				+ "is a sure sign that the wizard is friendly." + newline;
		seeAlso = new Vector<Toughpick>();
		seeAlso.addElement(Toughpick.Wizards);
		entries.addElement(new Entry(token, name, description, seeAlso));

		token = Toughpick.Altars;
		name = "Altars";
		description = "Altars are of three types:" + newline
				+ "1. In temples, these are for sacrifices, so they will be waist-high and long" + newline
				+ "   enough to contain the supine body of a virgin. The stone top will have" + newline
				+ "   grooves for blood, and the whole will be covered with dry brown stains of a" + newline
				+ "   troubling kind from former sacrifices." + newline
				+ "2. In the open, usually on a hilltop. These are of marble and quite simple but" + newline
				+ "   handsome, because they are always devoted to a good deity. The size and shape" + newline
				+ "   varies, but the general effect is of unassuming potency." + newline
				+ "3. In ruins. These altars are underground or inside a pyramidal structure. They" + newline
				+ "   will sit on a dais at the further, darker end, and be about the size of a" + newline
				+ "   laundry hamper, in stone. Approach these with care. Though they undoubtedly" + newline
				+ "   hide or contain secrets or quest objects you need, they will be set about" + newline
				+ "   about with magical booby traps that are still operative even after thousands" + newline
				+ "   of years. You need to disarm these first, and then possibly the thin shade of" + newline
				+ "   the enraged deity after that." + newline;
		seeAlso = new Vector<Toughpick>();
		seeAlso.addElement(Toughpick.Temples);
		seeAlso.addElement(Toughpick.Sacrifice);
		seeAlso.addElement(Toughpick.Virgins);
		seeAlso.addElement(Toughpick.Good);
		seeAlso.addElement(Toughpick.Ruins);
		seeAlso.addElement(Toughpick.Secret);
		seeAlso.addElement(Toughpick.QuestObjects);
		entries.addElement(new Entry(token, name, description, seeAlso));
	}
}
