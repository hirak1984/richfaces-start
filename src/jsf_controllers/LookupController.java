package jsf_controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@ManagedBean
public class LookupController {

	private Map<String, String> trackMap;
	private Map<String, String> interestMap;
	private Map<String, String> locationMap;
	
	private Set<String> tracks;
	
	public LookupController() {
		super();
		trackMap = new HashMap<String, String>();
		trackMap.put("key1", "value1");
		trackMap.put("key2", "value2");
		trackMap.put("key3", "value3");
		trackMap.put("key4", "value4");
		
		interestMap = new HashMap<String, String>();
		interestMap.put("key1", "value1");
		interestMap.put("key2", "value2");
		interestMap.put("key3", "value3");
		interestMap.put("key4", "value4");
		
		locationMap = new HashMap<String, String>();
		locationMap.put("key1", "value1");
		locationMap.put("key2", "value2");
		locationMap.put("key3", "value3");
		locationMap.put("key4", "value4");
		setTracks(trackMap.keySet());
	}
	
	
	public Set<String> getTracks() {
		return tracks;
	}

	public void setTracks(Set<String> tracks) {
		this.tracks = tracks;
	}
	
	
}
