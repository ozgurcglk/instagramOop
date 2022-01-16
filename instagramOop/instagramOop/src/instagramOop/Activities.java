package instagramOop;

public class Activities {

	private String activitiesIcon;
	private String receivedLike;
	private String receivedComment;
	private String requestedFollower;
	private String receivedFollower;
	private String inTouchProfileIcon;
	
	public Activities() {
		super();
	}

	public Activities(String activitiesIcon, String receivedLike, String receivedComment, String requestedFollower,
			String receivedFollower, String inTouchProfileIcon) {
		super();
		this.activitiesIcon = activitiesIcon;
		this.receivedLike = receivedLike;
		this.receivedComment = receivedComment;
		this.requestedFollower = requestedFollower;
		this.receivedFollower = receivedFollower;
		this.inTouchProfileIcon = inTouchProfileIcon;
	}

	public String getActivitiesIcon() {
		return activitiesIcon;
	}

	public void setActivitiesIcon(String activitiesIcon) {
		this.activitiesIcon = activitiesIcon;
	}

	public String getReceivedLike() {
		return receivedLike;
	}

	public void setReceivedLike(String receivedLike) {
		this.receivedLike = receivedLike;
	}

	public String getReceivedComment() {
		return receivedComment;
	}

	public void setReceivedComment(String receivedComment) {
		this.receivedComment = receivedComment;
	}

	public String getRequestedFollower() {
		return requestedFollower;
	}

	public void setRequestedFollower(String requestedFollower) {
		this.requestedFollower = requestedFollower;
	}

	public String getReceivedFollower() {
		return receivedFollower;
	}

	public void setReceivedFollower(String receivedFollower) {
		this.receivedFollower = receivedFollower;
	}

	public String getInTouchProfileIcon() {
		return inTouchProfileIcon;
	}

	public void setInTouchProfileIcon(String inTouchProfileIcon) {
		this.inTouchProfileIcon = inTouchProfileIcon;
	}
	
	
}
