import java.util.Scanner;

/**
 * @author fededev01
 *
 * 
 * @version 1.0.5
 */
public class Italia
{
    int positivi;
      int guariti ;
      int morti ;
      int totali ;
    public static void main(String[] args) {
        
      Italia g1 = new Italia();
      g1.positivi = 1577;
      g1.guariti = 83;
      g1.morti = 34;
      g1.totali = 1694;
      
      Italia g2 = new Italia();
      g2.positivi = 1835;
      g2.guariti = 149;
      g2.morti = 52;
      g2.totali = 2036;
      
      Italia g3 = new Italia();
      g3.positivi = 2263;
      g3.guariti = 160;
      g3.morti =  79;
      g3.totali =  2502;
      
      Italia g4 = new Italia();
      g4.positvi = 2706;
      g4.guariti =  276;
      g4.morti =  107;
      g4.totali =  3089;  
        
      Italia g5 = new Italia();
      g5.positivi = 3296;
      g5.guariti = 414;
      g5.morti = 148;
      g5.totali = 3858;
      
      Italia g6 = new Italia();
      g6.positivi = 3916;
      g6.guariti = 523;
      g6.morti = 197;
      g6.totali = 4636;
      
      Italia g7 = new Italia();
      g7.positivi = 5061;
      g7.guariti = 589;
      g7.morti = 233;
      g7.totali =  5883;
      
      Italia g8 = new Italia();
      g8.positvi = 6387;
      g8.guariti =  622;
      g8.morti =  366;
      g8.totali =  7375;
      
      Italia g10 = new Italia();
      g10.positivi = 8514;
      g10.guariti = 1004;
      g10.morti = 631;
      g10.totali = 10149;
      
      Italia g11 = new Italia();
      g11.positivi = 10590;
      g11.guariti = 1045;
      g11.morti = 827;
      g11.totali =  12462;
      
      Italia g12 = new Italia();
      g12.positivi = 12839;
      g12.guariti =  1258;
      g12.morti = 1016;
      g12.totali = 15113;
      
      Italia g13 = new Italia();
      g13.positivi = 14955;
      g13.guariti =  1439;
      g13.morti =  1266;
      g13.totali =  17660; 
        
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
      
      Italia g22 = new Italia();
      g22.positivi = 46638;
      g22.guariti = 7024 ;
      g22.morti = 5476 ;
      g22.totali = 59138 ;
      
      Scanner date =new Scanner (System.in);
      System.out.println("Scrivi il numero del giorno del bollettino che vuoi ti venga mostrato");
      Integer newDate = date.nextInt();
      
      int myvar = newDate;
      
      switch (newDate) {
       
      case 1:
      System.out.println("Bollettino dell'1/03");
      System.out.println(g1.positivi + " positivi");
      System.out.println(g1.guariti + " guariti");
      System.out.println(g1.morti + " morti");
      System.out.println(g1.totali + " casi totali");
      break;
      
      case 2:
      System.out.println("Bollettino del 2/03");
      System.out.println(g2.positivi + " positivi");
      System.out.println(g2.guariti + " guariti");
      System.out.println(g2.morti + " morti");
      System.out.println(g2.totali + " casi totali");
      break;
      
      case 3:
      System.out.println("Bollettino del 3/03");
      System.out.println(g3.positivi + " positivi");
      System.out.println(g3.guariti + " guariti");
      System.out.println(g3.morti + " morti");
      System.out.println(g3.totali + " casi totali");
      break;
      
      case 4:
      System.out.println("Bollettino del 4/03");
      System.out.println(g4.positivi + " positivi");
      System.out.println(g4.guariti + " guariti");
      System.out.println(g4.morti + " morti");
      System.out.println(g4.totali + " casi totali");
      break;
          
      case 5:
      System.out.println("Bollettino del 5/03");
      System.out.println(g5.positivi + " positivi");
      System.out.println(g5.guariti + " guariti");
      System.out.println(g5.morti + " morti");
      System.out.println(g5.totali + " casi totali");
      break;
      
      case 6:
      System.out.println("Bollettino del 6/03");
      System.out.println(g6.positivi + " positivi");
      System.out.println(g6.guariti + " guariti");
      System.out.println(g6.morti + " morti");
      System.out.println(g6.totali + " casi totali");
      break;
      
      case 7:
      System.out.println("Bollettino del 7/03");
      System.out.println(g7.positivi + " positivi");
      System.out.println(g7.guariti + " guariti");
      System.out.println(g7.morti + " morti");
      System.out.println(g7.totali + " casi totali");
      break;
      
      case 8:
      System.out.println("Bollettino del 8/03");
      System.out.println(g8.positivi + " positivi");
      System.out.println(g8.guariti + " guariti");
      System.out.println(g8.morti + " morti");
      System.out.println(g8.totali + " casi totali");
      break;
      
      case 9:
      System.out.println("Non è stato trovato alcun bollettino corrispondente al 9 marzo");
      break;
      
      case 10:
      System.out.println("Bollettino del 10/03");
      System.out.println(g10.positivi + " positivi");
      System.out.println(g10.guariti + " guariti");
      System.out.println(g10.morti + " morti");
      System.out.println(g10.totali + " casi totali");
      break;
      
      case 11:
      System.out.println("Bollettino del 11/03");
      System.out.println(g11.positivi + " positivi");
      System.out.println(g11.guariti + " guariti");
      System.out.println(g11.morti + " morti");
      System.out.println(g11.totali + " casi totali");
      break;
      
      case 12:
      System.out.println("Bollettino del 12/03");
      System.out.println(g12.positivi + " positivi");
      System.out.println(g12.guariti + " guariti");
      System.out.println(g12.morti + " morti");
      System.out.println(g12.totali + " casi totali");
      break;
      
      case 13:
      System.out.println("Bollettino del 13/03");
      System.out.println(g13.positivi + " positivi");
      System.out.println(g13.guariti + " guariti");
      System.out.println(g13.morti + " morti");
      System.out.println(g13.totali + " casi totali");
      break;    
           
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
      
      case 22:
      System.out.println("Bollettino del 22/03");
      System.out.println(g22.positivi + " positivi");
      System.out.println(g22.guariti + " guariti");
      System.out.println(g22.morti + " morti");
      System.out.println(g22.totali + " casi totali");
      break;
        }
      
    }
    
}
