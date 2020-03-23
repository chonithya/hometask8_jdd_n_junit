package hometask8.hometask8;

public class Remove_A {

	public String del(String string) {
		String remainChar;
		int len=string.length();
		
	
		if((string.charAt(0)=='A') && (string.charAt(1)=='A')) {
			remainChar=string.substring(2,len);
		}
		else if(string.charAt(0)=='A'){
			remainChar=string.substring(1,len);
		}
		else if(string.charAt(1)=='A') {
			remainChar=string.charAt(0)+string.substring(2,len);
		}
		else {
			remainChar=string;
		}
		return remainChar;
	
	}

}
