package instagramOop;

public class GuestProfile extends Profile {

	private String follow;
	private String text;
	private String suggestions;
	private String viewStory;
	private String viewReels;
	private String choices;
	
	public GuestProfile() {
		super();
	}

	public GuestProfile(String[] profilePicture, String nickName, String biography, String posts, String followers,
			String followings, String highlights, String follow, String text, String suggestions, String viewStory, String viewReels
			, String choices) {
		super(profilePicture, nickName, biography, posts, followers, followings, highlights);
		this.follow = follow;
		this.text = text;
		this.suggestions = suggestions;
		this.viewStory = viewStory;
		this.viewReels = viewReels;
		this.choices = choices;
	}

	public String getFollow() {
		return follow;
	}

	public void setFollow(String follow) {
		this.follow = follow;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public String getViewStory() {
		return viewStory;
	}

	public void setViewStory(String viewStory) {
		this.viewStory = viewStory;
	}

	public String getViewReels() {
		return viewReels;
	}

	public void setViewReels(String viewReels) {
		this.viewReels = viewReels;
	}

	public String getChoices() {
		return choices;
	}

	public void setChoices(String choices) {
		this.choices = choices;
	}
	
	
	
}
