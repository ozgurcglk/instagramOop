package instagramOop;

public class Profile {
	
	private String[] profilePicture;
	private String nickName;
	private String biography;
	private String posts;
	private String followers;
	private String followings;
	private String highlights;
	
	public Profile() {
		super();
	}


	public Profile(String[] profilePicture, String nickName, String biography, String posts, String followers,
			String followings, String highlights) {
		super();
		this.profilePicture = profilePicture;
		this.nickName = nickName;
		this.biography = biography;
		this.posts = posts;
		this.followers = followers;
		this.followings = followings;
		this.highlights = highlights;
	}


	public String[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getPosts() {
		return posts;
	}

	public void setPosts(String posts) {
		this.posts = posts;
	}

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	public String getFollowings() {
		return followings;
	}

	public void setFollowings(String followings) {
		this.followings = followings;
	}

	public String getHighlights() {
		return highlights;
	}

	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}




}
