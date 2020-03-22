import java.util.Scanner;

/**
 * @author fededev01
 *
 * 
 * @version 1.2
 */
public class Italia
{
    int positivi;
      int guariti ;
      int morti ;
      int totali ;
    public static void main(String[] args) {
        
      Italia g14 = new Italia();
      g14.positivi = 17750;
      g14.guariti = 1966 ;
      g14.morti = 1441 ;
      g14.totali = 21157 ;
      
      Italia g15 = new Italia();
      g15.positivi = 20603;
      g15.guariti = 2335 ;
      g15.morti = 1809 ;
      g15.totali = 24747 ;
      
      Italia g16 = new Italia();
      g16.positivi = 23073;
      g16.guariti = 2749 ;
      g16.morti = 2158 ;
      g16.totali = 27980 ;
      
      Italia g17 = new Italia();
      g17.positivi = 26062;
      g17.guariti = 2941 ;
      g17.morti = 2503 ;
      g17.totali = 31506 ;
      
      Italia g18 = new Italia();
      g18.positivi = 28710;
      g18.guariti = 4025 ;
      g18.morti = 2978 ;
      g18.totali = 35713 ;
      
      Italia g19 = new Italia();
      g19.positivi = 33190;
      g19.guariti = 4440 ;
      g19.morti = 3405 ;
      g19.totali = 41035 ;
      
      Italia g20 = new Italia();
      g20.positivi = 37860;
      g20.guariti = 5129 ;
      g20.morti = 4032 ;
      g20.totali = 47021 ;
      
      Italia g21 = new Italia();
      g21.positivi = 42681;
      g21.guariti = 6072 ;
      g21.morti = 4825 ;
      g21.totali = 53578 ;
      
      Scanner date =new Scanner (System.in);
      System.out.println("Scrivi il numero del giorno del bollettino che vuoi ti venga mostrato");
      Integer newDate = date.nextInt();
      
      int myvar = newDate;
      
      switch (newDate) {
          case 14:
      System.out.println("Bollettino del 14/03");
      System.out.println(g14.positivi + " positivi");
      System.out.println(g14.guariti + " guariti");
      System.out.println(g14.morti + " morti");
      System.out.println(g14.totali + " casi totali");
      break;
      
      case 15:
      System.out.println("Bollettino del 15/03");
      System.out.println(g15.positivi + " positivi");
      System.out.println(g15.guariti + " guariti");
      System.out.println(g15.morti + " morti");
      System.out.println(g15.totali + " casi totali");
      break;
      
      case 16:
      System.out.println("Bollettino del 16/03");
      System.out.println(g16.positivi + " positivi");
      System.out.println(g16.guariti + " guariti");
      System.out.println(g16.morti + " morti");
      System.out.println(g16.totali + " casi totali");
      break;
      
      case 17:
      System.out.println("Bollettino del 17/03");
      System.out.println(g17.positivi + " positivi");
      System.out.println(g17.guariti + " guariti");
      System.out.println(g17.morti + " morti");
      System.out.println(g17.totali + " casi totali");
      break;
      
      case 18:
      System.out.println("Bollettino del 18/03");
      System.out.println(g18.positivi + " positivi");
      System.out.println(g18.guariti + " guariti");
      System.out.println(g18.morti + " morti");
      System.out.println(g18.totali + " casi totali");
      break;
      
      case 19:
      System.out.println("Bollettino del 19/03");
      System.out.println(g19.positivi + " positivi");
      System.out.println(g19.guariti + " guariti");
      System.out.println(g19.morti + " morti");
      System.out.println(g19.totali + " casi totali");
      break;
      
      case 20:
      System.out.println("Bollettino del 20/03");
      System.out.println(g20.positivi + " positivi");
      System.out.println(g20.guariti + " guariti");
      System.out.println(g20.morti + " morti");
      System.out.println(g20.totali + " casi totali");
      break;
      
      case 21:
      System.out.println("Bollettino del 21/03");
      System.out.println(g21.positivi + " positivi");
      System.out.println(g21.guariti + " guariti");
      System.out.println(g21.morti + " morti");
      System.out.println(g21.totali + " casi totali");
      break;
        }
      
    }
    
}