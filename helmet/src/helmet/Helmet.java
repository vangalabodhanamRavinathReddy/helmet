package helmet;

public class Helmet {
	public static void main(String[] args) {
		AbstractMattress size = HelmetFactory.getHelmet("Size");
		Size size1 = size.getSize("Large");
		size1.mySize();
	}
}