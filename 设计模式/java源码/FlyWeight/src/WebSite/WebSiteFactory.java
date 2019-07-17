package WebSite;

import java.util.Hashtable;


public class WebSiteFactory {
	private Hashtable<String, WebSite> webSites = new Hashtable<String, WebSite>();
	
	public WebSite getWebSiteCategory(String key){
		if(!webSites.containsKey(key)){
			webSites.put(key, new ConcreteWebSite(key));
		}
		return webSites.get(key);
	}
	
	public int getWebSiteCount(){
		return webSites.size();
	}
}
