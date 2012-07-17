package crawler;

public class LinkStats {

	public String url;
	public int code;
	public boolean working;
	
	LinkStats(String URL,int HTTPCode){
		url = URL;
		code = HTTPCode;
	}
	
	LinkStats(String URL,int HTTPCode,boolean Working){
		url = URL;
		code = HTTPCode;
		working = Working;
	}
}
