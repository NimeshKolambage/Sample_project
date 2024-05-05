class Product 
{
	protected String proName;
	protected String proID;
	protected float price;
	protected Preference P1;
	
	public Product(String proName, String proID, float price, String color, String size, String category, String material)
	{
		this.proName=proName;
		this.proID=proID;
		this.price=price;
		this.P1=new Preference(color, size, category, material);
	}
	
	public void displayDetails()
	{
		System.out.println("Product type - "+proName);
		System.out.println("Product ID - "+proID);
		System.out.println("Price - Rs."+price);
		P1.displayDetails();
	}
}