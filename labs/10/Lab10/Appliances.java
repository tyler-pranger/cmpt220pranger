package Lab10;
public class Appliances implements Comparable{
	   private double voltage;
	   private String colour;
	   private String madeIn;
	   private double price;
	   public Appliances(double voltage, String colour, String madeIn, double price) {
	       super();
	       this.voltage = voltage;
	       this.colour = colour;
	       this.madeIn = madeIn;
	       this.price = price;
	   }
	   // Getter and setters
	   public double getVoltage() {
	       return voltage;
	   }
	   public void setVoltage(double voltage) {
	       this.voltage = voltage;
	   }
	   public String getColour() {
	       return colour;
	   }
	   public void setColour(String colour) {
	       this.colour = colour;
	   }
	   public String getMadeIn() {
	       return madeIn;
	   }
	   public void setMadeIn(String madeIn) {
	       this.madeIn = madeIn;
	   }
	   public double getPrice() {
	       return price;
	   }
	   public void setPrice(double price) {
	       this.price = price;
	   }
	   @Override
	   public int compareTo(Object arg0) {
	       if(arg0 !=null) {
	           if(arg0 instanceof Appliances) {
	               Appliances app = (Appliances)arg0;
	               if(this.price > app.price) {
	                   return 1;
	               }else if (this.price < app.price){
	                   return -1;
	               }else {
	                   return 0;
	               }              
	           }else {
	               return 0;
	           }

	       }
	       return 0;
	   }
	   @Override
	   public String toString() {
	       return "Appliance [voltage=" + voltage + ", colour=" + colour + ", madeIn=" + madeIn + ", price=" + price + "]";
	   }
	  
	  
	}