package instagramOop;

public class Statistics {
	
	private double likeCount;
	private double commentCount;
	private double date;
	
	public Statistics() {
		super();
	}

	public Statistics(double likeCount, double commentCount, double date) {
		super();
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.date = date;
	}

	public double getLikeCount() {
		return likeCount;
	}

	public double getCommentCount() {
		return commentCount;
	}

	public double getDate() {
		return date;
	}
	
}
