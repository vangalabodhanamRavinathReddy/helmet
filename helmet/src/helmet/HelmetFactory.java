package helmet;

public class HelmetFactory {
	public static AbstractHelmet getHelmet(String hel) {
		if(hel.equalsIgnoreCase("Size")) {
			return new HelmetSize();
		} else if(hel.equalsIgnoreCase("Sport")) {
			return new HelmetSport();
		}
		return null;
	}
}