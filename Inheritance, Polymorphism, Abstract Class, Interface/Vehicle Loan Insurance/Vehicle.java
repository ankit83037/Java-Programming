
public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	
	public double issueLoan(){
	    double eligibeLoanAmount = 0.0;
	    if(this.vehicleType.equals("4 wheeler")){
	        eligibeLoanAmount = 0.80*this.price;
	    }
	    else if(this.vehicleType.equals("3 wheeler")){
	        eligibeLoanAmount = 0.75*this.price;
	    }
	    else{
	        eligibeLoanAmount = 0.50*this.price;
	    }
	    return eligibeLoanAmount;
	}
	
	public double takeInsurance (){
	    int insuranceAmount = 0;
	    
	       if(this.price > 300000){
	            insuranceAmount = 5000;
	        }
	            
	       else if(this.price > 150000 && this.price <=300000){
	           insuranceAmount = 4000;
	       }
	       else
	            insuranceAmount = 3500;
	    
	    return insuranceAmount;
	}

}
