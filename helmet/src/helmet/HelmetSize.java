package helmet;

public class HelmetSize extends AbstractHelmet {
	public Size getSize(String size) {
		if(size == null ) {
			return null;
		}
		if(size.equalsIgnoreCase("Small")) {
			return new SmallHel();
		} else if(size.equalsIgnoreCase("Medium")) {
			return new MediumHel();
		} else if(size.equalsIgnoreCase("Large")) {
			return new LargeHel();
		}
		return null;
	}
	@Override
	Sport mySport(String sport) {
		return null;
	}
}