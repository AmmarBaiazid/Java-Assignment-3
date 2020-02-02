
public class CPU {
	private int cpuGeneration;
	private String cpuSeries;
	private String suggestedPrice;
	private String cpuSpeed;
	private String launchDate;
	private boolean SGX;
	
	//makes constructor with initialized values
	public CPU() {
		cpuGeneration = 1;
		cpuSeries = "i3";
		suggestedPrice = "117.00 USD";
		cpuSpeed = "2.93GHz";
		launchDate = "Q1'10";
		SGX = false;
	}
	
	public CPU(int gen, String series, String price, String speed, String date, boolean sgx) {
		cpuGeneration = gen;
		cpuSeries = series;
		suggestedPrice = price;
		cpuSpeed = speed;
		launchDate = date;
		SGX = sgx;
	}

	public String getSuggestedPrice() {
		return suggestedPrice;
	}

	public void setSuggestedPrice(String suggestedPrice) {
		this.suggestedPrice = suggestedPrice;
	}

	public int getCpuGeneration() {
		return cpuGeneration;
	}

	public String getCpuSeries() {
		return cpuSeries;
	}

	public String getCpuSpeed() {
		return cpuSpeed;
	}

	public String getLaunchDate() {
		return launchDate;
	}

	public boolean isSGX() {
		return SGX;
	}
	
	public boolean equals(CPU secondCPU) {
		if(getCpuSeries().equalsIgnoreCase(secondCPU.getCpuSeries()) && isSGX() == secondCPU.isSGX()) {
			return true;
		}
		
		return false;
	}
	
	public boolean isHigherGeneration(CPU secondCPU) {
		if(getCpuGeneration()>secondCPU.getCpuGeneration()) {
			return true;
		}
		return false;
	}
	
	public String priceNow(String sQuarterYear) {
		//parse quarter from string passed to function
		int givenQuarter = Integer.parseInt(sQuarterYear.substring(1,2));
		int givenYear = Integer.parseInt(sQuarterYear.substring(3,5));
		
		//parse quarter of object requesting change
		int myQuarter = Integer.parseInt(getLaunchDate().substring(1,2));
		int myYear = Integer.parseInt(getLaunchDate().substring(3,5));
		
		//use of math.abs to in case values are negative
		double multiple = (Math.abs(givenYear - myYear)*0.08) + (Math.abs(givenQuarter - myQuarter)*0.02); 
		
		double newPrice = Double.parseDouble(getSuggestedPrice().substring(0,getSuggestedPrice().length()-4));
		newPrice = newPrice - (multiple*newPrice);
		
		String formattedPrice = String.format("%.2f", newPrice); //2 decimals
		
		return formattedPrice + " USD";
		
	}
	
	public String toString() {
		String supported = "";
		if(!isSGX()) {
			supported = " not";
		}
		return getCpuGeneration() + "th generation " + getCpuSeries() + " (" +getCpuSpeed()+ ")" + " launched " + getLaunchDate() + " with price " +
				getSuggestedPrice() + ", SGX is"  + supported + " supported"; 
	}
	
}
