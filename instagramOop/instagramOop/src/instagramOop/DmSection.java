package instagramOop;

public class DmSection {
	
	private String yourName;
	private String newDM;
	private String searchDM;
	private String[] profileIcon;
	private String dmName;
	private String chat;
	
	public DmSection() {
		super();
	}

	public DmSection(String yourName, String newDM, String searchDM, String[] profileIcon, String dmName, String chat) {
		super();
		this.yourName = yourName;
		this.newDM = newDM;
		this.searchDM = searchDM;
		this.profileIcon = profileIcon;
		this.dmName = dmName;
		this.chat = chat;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getNewDM() {
		return newDM;
	}

	public void setNewDM(String newDM) {
		this.newDM = newDM;
	}

	public String getSearchDM() {
		return searchDM;
	}

	public void setSearchDM(String searchDM) {
		this.searchDM = searchDM;
	}

	public String[] getProfileIcon() {
		return profileIcon;
	}

	public void setProfileIcon(String[] profileIcon) {
		this.profileIcon = profileIcon;
	}

	public String getDmName() {
		return dmName;
	}

	public void setDmName(String dmName) {
		this.dmName = dmName;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}
	
	
	
}
