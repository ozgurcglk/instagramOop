package instagramOop;

public class Posts extends Statistics{
	
	private String[] mainImage;
	private String[] likeIcon;
	private String[] commentIcon;
	private String[] shareIcon;
	private String[] saveIcon;
	private String caption;
	private String[] profilePictureIcon;
	
	public Posts() {
		super();
	}

	public Posts(double likeCount, double commentCount, double date, String[] mainImage, String[] likeIcon, String[] commentIcon, String[] shareIcon, String[] saveIcon,
			String caption, String[] profilePictureIcon) {
		super(likeCount, commentCount, date);
		this.mainImage = mainImage;
		this.likeIcon = likeIcon;
		this.commentIcon = commentIcon;
		this.shareIcon = shareIcon;
		this.saveIcon = saveIcon;
		this.caption = caption;
		this.profilePictureIcon = profilePictureIcon;
	}

	public String[] getMainImage() {
		return mainImage;
	}

	public void setMainImage(String[] mainImage) {
		this.mainImage = mainImage;
	}

	public String[] getLikeIcon() {
		return likeIcon;
	}

	public void setLikeIcon(String[] likeIcon) {
		this.likeIcon = likeIcon;
	}

	public String[] getCommentIcon() {
		return commentIcon;
	}

	public void setCommentIcon(String[] commentIcon) {
		this.commentIcon = commentIcon;
	}

	public String[] getShareIcon() {
		return shareIcon;
	}

	public void setShareIcon(String[] shareIcon) {
		this.shareIcon = shareIcon;
	}

	public String[] getSaveIcon() {
		return saveIcon;
	}

	public void setSaveIcon(String[] saveIcon) {
		this.saveIcon = saveIcon;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String[] getProfilePictureIcon() {
		return profilePictureIcon;
	}

	public void setProfilePictureIcon(String[] profilePictureIcon) {
		this.profilePictureIcon = profilePictureIcon;
	}
	
	
	
}
