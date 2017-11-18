package interfaces;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String str) {
		String result = "";
		for (int i = str.length()-1; i >= 0; i--) {
		result+=str.charAt(i);
		}
		return result;
	}
}
