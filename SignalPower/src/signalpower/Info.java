//Navid Derakhshandeh
package signalpower;

import java.util.Scanner;
import java.lang.Math;

public class Info 
{
	private double Pt;
	private double Gt;
	private double Gr;
	private double Landa;
	private double Rcs;
	private double Rr;
	private double Lt;
	private double Lr;
	private double res1;
	private double res2;
	private double res3;
	private double res4;
	private double res5;
	private double res6;
	private double res7;
	private double res8;

	public Info()
	{
		this.Pt = 123456789;
		this.Gt = 123456789;
		this.Gr = 123456789;
		this.Landa = 123456789;
		this.Rcs = 123456789;
		this.Rr = 123456789;
		this.Lt = 123456789;
		this.Lr = 123456789;
	}
	public Info( double pt, double gt, double gr, double landa, double rcs, double rr, 
				double lt, double lr)
	{
		this.Pt = pt;
		this.Gt = gt;
		this.Gr = gr;
		this.Landa = landa;
		this.Rcs = rcs;
		this.Rr = rr;
		this.Lt = lt;
		this.Lr = lr;
	}
	public double getPt() {
		return Pt;
	}
	public double getGt() {
		return Gt;
	}
	public double getGr() {
		return Gr;
	}
	public double getLanda() {
		return Landa;
	}
	public double getRcs() {
		return Rcs;
	}
	public double getRr() {
		return Rr;
	}
	public double getLt() {
		return Lt;
	}
	public double getLr() {
		return Lr;
	}
	public void setPt(double pt) {
		Pt = pt;
	}
	public void setGt(double gt) {
		Gt = gt;
	}
	public void setGr(double gr) {
		Gr = gr;
	}
	public void setLanda(double landa) {
		Landa = landa;
	}
	public void setRcs(double rcs) {
		Rcs = rcs;
	}
	public void setRr(double rr) {
		Rr = rr;
	}
	public void setLt(double lt) {
		Lt = lt;
	}
	public void setLr(double lr) {
		Lr = lr;
	}
	public void FormulaInfo()
	{
		System.out.println("###################################");
		System.out.println("********Calculation process********");
		System.out.println("###################################");
		System.out.println("transmitter power : " + getPt());
		System.out.println("gain of radar transmit antenna in the direction of the target : " + getGt());
		System.out.println("gain of radar receive antenna in the direction of the target : " + getGr());
		System.out.println("wavelength : " + getLanda());
		System.out.println("target radar cross section : " + getRcs());
		System.out.println("radar range to target : " + getRr());
		System.out.println("radar losses from transmitter to antenna : " + getLt());
		System.out.println("radar losses from antenna to receiver : " + getLr());
	}
	public void enroll()
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please Enter the Transmitter power : ");
		double Pt = reader.nextDouble();
		setPt(Pt);
		
		System.out.println("Please Enter the gain of radar transmit antenna in the direction of the target : ");
		double Gt = reader.nextDouble();
		setGt(Gt);
		
		System.out.println("Please Enter the gain of radar receive antenna in the direction of the target : ");
		double Gr = reader.nextDouble();
		setGr(Gr);
		
		System.out.println("Please Enter the wavelength : ");
		double Landa = reader.nextDouble();
		setLanda(Landa);
		
		System.out.println("Please Enter the target radar cross section : ");
		double Rcs = reader.nextDouble();
		setRcs(Rcs);
		
		System.out.println("Please Enter the radar range to target : ");
		double Rr = reader.nextDouble();
		setRr(Rr);
		
		System.out.println("Please Enter the radar losses from transmitter to antenna : ");
		double Lt = reader.nextDouble();
		setLt(Lt);
		
		System.out.println("Please Enter the radar losses from antenna to receiver : ");
		double Lr = reader.nextDouble();
		setLr(Lr);
		
		reader.close();
		
	}
	public void calculation() {
		res1 = Pt * Gt * Gr * Landa * Landa * Rcs;
		res2 = 4 * 180;
		res3 = 3;
		res4 = Math.pow(res2, res3);
		res5 = 4;
		res6 = Math.pow(res5, Rr);
		res7 = res4 * res6 * Lt * Lr;
		res8 = res1 / res7;
		System.out.println("signal power at radar receiver : " + res8);
	}
}
