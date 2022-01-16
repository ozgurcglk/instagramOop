package instagramOop;

public class UserProfile extends Profile{
	
	private String editProfile;
	private String addPost;
	private String addHighlights;
	private String addStory;
	private String changeAccounts;
	
	public UserProfile() {
		super();
	}

	public UserProfile(String[] profilePicture, String nickName, String biography, String posts, String followers,
			String followings, String highlights, String addPost, String editProfile, String addHighlights, String addStory, String changeAccounts) {
		
		super(profilePicture, nickName, biography, posts, followers, followings, highlights);
		
		
		this.editProfile = editProfile;
		this.editProfile = addPost;
		this.addHighlights = addHighlights;
		this.addStory = addStory;
		this.changeAccounts = changeAccounts;
	}

	public String getEditProfile() {
		return editProfile;
	}

	public void setEditProfile(String editProfile) {
		this.editProfile = editProfile;
	}

	public String getAddPost() {
		return addPost;
	}

	public void setAddPost(String addPost) {
		this.addPost = addPost;
	}

	public String getAddHighlights() {
		return addHighlights;
	}

	public void setAddHighlights(String addHighlights) {
		this.addHighlights = addHighlights;
	}

	public String getAddStory() {
		return addStory;
	}

	public void setAddStory(String addStory) {
		this.addStory = addStory;
	}

	public String getChangeAccounts() {
		return changeAccounts;
	}

	public void setChangeAccounts(String changeAccounts) {
		this.changeAccounts = changeAccounts;
	}

	
	
}
