package value_objects;

public class elaProfile {

	private String picUrl;
	private String name;
	private String track;
	private String areaOfInterest;
	private String learningInterest;
	private String preferredLocation;
	private String cvUrl;
	
	public elaProfile(String picUrl, String name, String track,
			String areaOfInterest, String learningInterest,
			String preferredLocation, String cvUrl) {
		super();
		this.picUrl = picUrl;
		this.name = name;
		this.track = track;
		this.areaOfInterest = areaOfInterest;
		this.learningInterest = learningInterest;
		this.preferredLocation = preferredLocation;
		this.cvUrl = cvUrl;
	}
	
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getAreaOfInterest() {
		return areaOfInterest;
	}
	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}
	public String getLearningInterest() {
		return learningInterest;
	}
	public void setLearningInterest(String learningInterest) {
		this.learningInterest = learningInterest;
	}
	public String getPreferredLocation() {
		return preferredLocation;
	}
	public void setPreferredLocation(String preferredLocation) {
		this.preferredLocation = preferredLocation;
	}
	public String getCvUrl() {
		return cvUrl;
	}
	public void setCvUrl(String cvUrl) {
		this.cvUrl = cvUrl;
	}
	
}
