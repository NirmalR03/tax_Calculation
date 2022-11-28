import java.util.Scanner;

public class taxCalculation {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter DA");
		double DA=input.nextInt();
		System.out.println("Enter EA");
		double EA=input.nextInt();
		System.out.println("Enter Basic");
		double Basic=input.nextInt();
		double gross;
		DA=(DA/100)*Basic;
		EA=(EA/100)*Basic;
		gross=(DA+EA+Basic)*12;
		System.out.println("DA :"+DA+" "+"EA :"+EA+" "+"GROSS :"+gross);
		System.out.println("Enter Deduction PER MONTH :");
		double Deduction=input.nextInt();
		double net;
		net=gross-(Deduction*12);
		System.out.println("Net Salary is :"+net);
		double taxRate;
		if(net>100000.0 && net<=500000.0){
			taxRate=0.1;}
		else if(net>500000 && net<=100000) {
			taxRate=0.2;}
		else {
			taxRate=0.3;}
		System.out.println("RATE OF TAX :"+taxRate);
		double taxTopay;
		taxTopay=taxRate*net;
		System.out.println("taxTopay : "+taxTopay);
	}

}
