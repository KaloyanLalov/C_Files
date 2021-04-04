package database;

public class data {
//Declare properties.
	String model;
	String company;
	String processor;
	String storage;
	String year;
	int price;
	String pound;
	String quantitysold;
	int stock;
	
	// The alignment of the properties for the Iphones
	public data(String model,String company,String processor,String storage,String year, int price,String pound, String quantitysold,int stock) {
	set(model,company,processor, storage,year,price,pound,quantitysold,stock);
	}
//Set methods.
	public String getModel() {
		return model;
	}
	public String getCompany() {
		return company;
	}
	public String getProcessor() {
		return processor;
	}
	public String getStorage()	{
		return storage;
	}
	public String getYear() {
		return year;
		
	}public int getPrice(){
		return price;
		
	}public String getDollar() {
		return pound;
			
	}public String getQuantitysold() {
		return quantitysold;
	}
		public int getStock() {
			return stock;
	}
		
	
	//Get methods
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setProcessor(String processor) {
		this.processor= processor;
	}
	public void setStorage(String storage)	{
		this.storage = storage;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDollar(String pound) {
		this.pound = pound;
	
	}public void setQuantitySold(String quantitysold) {
		this.quantitysold = quantitysold;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
		public void set(String model, String company, String processor , 
				String storage, String year, int price,String pound, String quantitysold,int stock) {
			setModel(model);
			setCompany(company);
			setProcessor(processor);
			setStorage(storage);
			setYear(year);
			setPrice(price);
			setDollar(pound);
			setQuantitySold(quantitysold);
			setStock(stock);
			}	
		
			public void print() {
			System.out.println(model);
			}
		
		public void print2() {
			System.out.println("Model: "+model);
			System.out.println("Company: "+company);
			System.out.println("Processor: "+processor);
			System.out.println("Storage space: "+storage);
			System.out.println("Year of production: "+year);
			System.out.println("Price of product: "+price+ pound);
			System.out.println("Quantity sold since release: "+quantitysold);
			System.out.println("Items left in stock: "+stock);
		}
	
		}

