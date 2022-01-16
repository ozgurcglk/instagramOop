package instagramOop;

public class Market {
	private String marketIcon;
	private String search;
	private String[] productIcon;
	private String productName;
	private String sellerName;
	private double price;
	private double discountRate;
	private double discountedPrice;
	
	public Market() {
		super();
	}

	public Market(String marketIcon, String search, String[] productIcon, String productName, String sellerName,
			double price, double discountRate) {
		super();
		this.marketIcon = marketIcon;
		this.search = search;
		this.productIcon = productIcon;
		this.productName = productName;
		this.sellerName = sellerName;
		this.price = price;
		this.discountRate = discountRate;
	}

	public String getMarketIcon() {
		return marketIcon;
	}

	public void setMarketIcon(String marketIcon) {
		this.marketIcon = marketIcon;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String[] getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String[] productIcon) {
		this.productIcon = productIcon;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountedPrice() {
		discountedPrice = (price - discountRate);
		return discountedPrice;
	}
	
}
