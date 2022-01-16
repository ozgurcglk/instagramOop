package instagramOop;

public class Main {

	public static void main(String[] args) {
		
		Profile ozgursProfile = new UserProfile(new String[] {}, "ozgurcglk", "Ozgur Caglak - GTU", "7", "400", "400", "basketball Stories", "New Post", "Edit Your Profile", "New Highlight", "New Story", "Other Account");
		System.out.println("Followings : " + ozgursProfile.getFollowings());
		
		Profile guestsProfile = new GuestProfile(new String[] {}, "guest", "Guest Nr1", "12", "1212", "121212", "highlight Stories", "follow", "new guest", "Guest 2", "Story of Guest", "Last Reel of Guest", "block - spam - report" );
		System.out.println("Guest's biography : " + guestsProfile.getBiography());
		
		Profile[] profiles = {ozgursProfile, guestsProfile};
		
		Statistics reels1 = new Reels();
		Statistics posts1 = new Posts();
		
		Statistics[] instaElements = {reels1, posts1}; 

		Market newStore = new Market("market basket", "searchbar", new String[] {}, "Key Chain", "Key Store", 100.0, 60.0 );
		System.out.println("Final Price is " + newStore.getDiscountedPrice() + " TL");

		
	}

}
