package instagramOop;

public class Reels extends Statistics {

		private String reelsIcon;
		private String[] mainMotionPictures;
		private String userOfReels;
		private String followUser;
		private String nameOfSong;
		
		public Reels() {
			super();
		}

		public Reels(double likeCount, double commentCount, double date, String reelsIcon, String[] mainMotionPictures, String userOfReels, String followUser,
				String nameOfSong) {
			super(likeCount, commentCount, date);
			this.reelsIcon = reelsIcon;
			this.mainMotionPictures = mainMotionPictures;
			this.userOfReels = userOfReels;
			this.followUser = followUser;
			this.nameOfSong = nameOfSong;
		}

		public String getReelsIcon() {
			return reelsIcon;
		}

		public void setReelsIcon(String reelsIcon) {
			this.reelsIcon = reelsIcon;
		}

		public String[] getMainMotionPictures() {
			return mainMotionPictures;
		}

		public void setMainMotionPictures(String[] mainMotionPictures) {
			this.mainMotionPictures = mainMotionPictures;
		}

		public String getUserOfReels() {
			return userOfReels;
		}

		public void setUserOfReels(String userOfReels) {
			this.userOfReels = userOfReels;
		}

		public String getFollowUser() {
			return followUser;
		}

		public void setFollowUser(String followUser) {
			this.followUser = followUser;
		}

		public String getNameOfSong() {
			return nameOfSong;
		}

		public void setNameOfSong(String nameOfSong) {
			this.nameOfSong = nameOfSong;
		}
		
		
}
