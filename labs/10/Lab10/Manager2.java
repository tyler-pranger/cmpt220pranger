package Lab10;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Manager2 implements Printable{
	private String name;
	private long deptNumber;

	public Manager2(String name,long deptNumber){
		this.name = name;
		this.deptNumber = deptNumber;
		}
	public void print(){
		System.out.println("Manager : Name :"+name +" Department Number : "+deptNumber);
		}
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}
}