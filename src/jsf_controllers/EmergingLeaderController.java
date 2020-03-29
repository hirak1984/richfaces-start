package jsf_controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import value_objects.elaProfile;

@ManagedBean
public class EmergingLeaderController {

	private List<elaProfile> profiles;

	public EmergingLeaderController() {
		super();
		profiles = new ArrayList<elaProfile>();
		
		for(int i=0;i<20;i++){ 
		profiles.add(new elaProfile("https://myishare.nielsen.com/personal/chathi01/Shared%20Pictures/Profile%20Pictures/pic.JPG",
				"Hirak"+i, "track"+i, "areaOfInterest"+i, 
				"learningInterest"+i, "preferredLocation"+i,
				"https://ishare.nielsen.com/teams/Port_Man2/Online%20GRPs/Operations/Operations%20SOPs/Campaign%20Score%20Card.xlsx"));
		}
		
	}

	public List<elaProfile> getProfiles() {
		return profiles;
	}

	public void setProfiles(List<elaProfile> profiles) {
		this.profiles = profiles;
	}
	
	
}
