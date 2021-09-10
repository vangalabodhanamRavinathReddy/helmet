package helmet;

public class HelmetSport extends AbstractHelmet {
	public Size mySize(String size) {
		return null;
	}
	@Override
	Sport mySport(String sport) {
		if(sport == null ) {
			return null;
		}
		if(sport.equalsIgnoreCase("Football")) {
			return new Football();
		} else if(sport.equalsIgnoreCase("FieldHockey")) {
			return new FieldHockey();
		} else if(sport.equalsIgnoreCase("IceHockey")) {
			return new IceHockey();
		}
		return null;
	}
}