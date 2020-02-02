// -------------------------------------------------------
// Assignment (3) Question 2
// Written by: (Ammar Baiazid id(26746632))
// For COMP 248 Section (EC) – Fall 2019
// --------------------------------------------------------
// This program creates objects of type CPU, uses its functions, and compares them.
public class CPUDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to the simple class example!");
        CPU cpu1 = new CPU(1, "i3", "117.00 USD","2.93GHz", "Q1'10",false);
        CPU cpu2 = new CPU(10, "i5", "449.00 USD","3.1GHz", "Q2'19",true);

        System.out.println("CPU 1: This CPU is " + cpu1.toString());
        System.out.println("CPU 2: This CPU is " + cpu2.toString());
        System.out.println("CPU 1 series: " + cpu1.getCpuSeries());
        
        System.out.println("CPU 1 suggested price: " + cpu1.getSuggestedPrice());
        cpu1.setSuggestedPrice("110.00 USD");
        System.out.println("CPU 1 suggested price (after mutator call): " + cpu1.getSuggestedPrice());
        
        String ans = "NO";
        if(cpu1.equals(cpu2)) {
        	ans = "YES";
        }
        System.out.println("Are CPU 1 and CPU 2 equal? " + ans);
        
        if(cpu1.isHigherGeneration(cpu2)) {
        	ans = "YES";
        }
        else {
        	ans = "NO";
        }

        System.out.println("Are CPU 1 of higher generation than CPU 2 equal? " + ans);
        System.out.println("CPU 1 Price at Q3'19 :" + cpu1.priceNow("Q3'19"));
        System.out.println("CPU 2 Price at Q3'19 :" + cpu2.priceNow("Q3'19"));

        System.out.println("Thank you for testing the simple class example!");
	}
}
