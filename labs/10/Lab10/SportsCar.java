package Lab10;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class SportsCar implements Printable{
	private String name;
	private long number;

	public SportsCar(String name,long number) {
		this.name = name;
		this.number = number;
		}

	public void print() {
		System.out.println("Sports Car : Name : "+name +" Number : "+number);
	}

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}
}

