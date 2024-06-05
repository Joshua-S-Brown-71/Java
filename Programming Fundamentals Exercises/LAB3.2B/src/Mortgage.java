//Creates and keeps track of mortgage info

public class Mortgage 
{
	private double loan, years, rate, payment;

	public Mortgage(double inloan, double inyears, double inrate, double inpayment)
	{
		loan=inloan;
		years=inyears;
		rate=inrate;
		payment=inpayment;
	}
	public Mortgage(double inloan, double inyears, double inrate)
	{
		loan=inloan;
		years=inyears;
		rate=inrate;
		computePayment();
	}
	public Mortgage()
	{
		loan=0;
		years=0;
		rate=0;
		payment=0;
	}

	public String toString()
	{
		return("Loan: "+String.format("$%,.2f",loan)+"\nYears: "+years+"\nRate: "+rate+"\nPayment: "+String.format("$%,.2f",payment)+"\n");
	}

	public void setValues(double inloan, double inyears, double inrate)
	{
		loan=inloan;
		years=inyears;
		rate=inrate;
		computePayment();
	}

	private void computePayment()
	{
		double x, term;

		x=12*years;
		term=Math.pow((1+rate/12),x);
		payment=(loan*(rate/12)*term)/(term-1);
	}




}
