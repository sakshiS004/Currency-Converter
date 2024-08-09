
import java.util.*;
import java.text.*;


class CurrencyConverter{

   public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount for the conversion: ");
        double amt = sc.nextDouble();

// Creating a new Number format instance for the locale
       NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));    
       NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
       NumberFormat koreaFormat = NumberFormat.getCurrencyInstance(Locale.KOREA);
       NumberFormat japanFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);

// Formatting amount for each locale
      String india = indiaFormat.format(amt);
      String us = usFormat.format(amt);
      String korea = koreaFormat.format(amt);
      String japan = japanFormat.format(amt);

//Print Formatted amount

     System.out.println("India: "+india);
     System.out.println("US: "+us);
     System.out.println("Korean: "+korea);
     System.out.println("Japan: "+japan);

// close the scanner
      sc.close();
    
  }
}
