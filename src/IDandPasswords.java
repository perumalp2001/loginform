import java.util.HashMap;

public class IDandPasswords {

	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		
		logininfo.put("Perumal", "abcde12345");
		logininfo.put("PerumalP", "12345");
		logininfo.put("Bro", "pizza");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
