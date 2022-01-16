package instagramOop;

public class UserSignIn {
	
	private String instagramSymbol ;
	private String phoneNumber;
	private String username;
	private String eMail ;
	private String password ;
	private String signIn;
	private String forgetYourPassword;
	private String signUp;
	
	public UserSignIn() {
		super();
	}

	public UserSignIn(String instagramSymbol, String phoneNumber, String username, String eMail, String password,
			String signIn, String forgetYourPassword, String signUp) {
		super();
		this.instagramSymbol = instagramSymbol;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.eMail = eMail;
		this.password = password;
		this.signIn = signIn;
		this.forgetYourPassword = forgetYourPassword;
		this.signUp = signUp;
	}

	public String getInstagramSymbol() {
		return instagramSymbol;
	}

	public void setInstagramSymbol(String instagramSymbol) {
		this.instagramSymbol = instagramSymbol;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public String geteMail() {
		return eMail;
	}

	public String getSignIn() {
		return signIn;
	}

	public void setSignIn(String signIn) {
		this.signIn = signIn;
	}

	public String getForgetYourPassword() {
		return forgetYourPassword;
	}

	public void setForgetYourPassword(String forgetYourPassword) {
		this.forgetYourPassword = forgetYourPassword;
	}

	public String getSignUp() {
		return signUp;
	}

	public void setSignUp(String signUp) {
		this.signUp = signUp;
	}

	public String getPassword() {
		return password;
	}


}
