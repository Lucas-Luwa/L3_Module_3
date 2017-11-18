package interfaces;

public class MixedCapsString extends SpecialString {
	
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(i % 2 == 0) {
				result+=Character.toLowerCase(str.charAt(i));
			}
			else if(i % 2 == 1) {
				result+=Character.toUpperCase(str.charAt(i));
			}
			else {
				
			}
		}
		return result;
		
	}

	

}
