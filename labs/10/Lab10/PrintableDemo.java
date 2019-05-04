package Lab10;

import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class PrintableDemo{
public static void main (String[] args) throws PrinterException
{
  Printable vec[] = {
   new Rectangle(200, 100),
   new SportsCar("Fiat", 7892321),
   new Rectangle(34, 32),
   new Manager2("Claire",32),
   new Rectangle(54,10),
   new SportsCar("Audi",4322344),
   new SportsCar("Mazda",4322343),
   new Manager2("John",2344322)
  };
   
   for(int index = 0;index < vec.length;index++)
   vec[index].print(null, null, index);
   
}
}