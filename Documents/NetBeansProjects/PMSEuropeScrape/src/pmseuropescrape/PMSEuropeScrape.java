package pmseuropescrape;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class PMSEuropeScrape 
{
    public static void main(String[] args) throws IOException 
    {
       String URL = "";
       String holder = ""; 
       String holder2 = "";
       int counter = 0;
       int counter2 = 0;
       int extracounter = 0;
       int extracap = 0;
       int cap = 0;   
       int countofpages = 0;
       String NameTheFile = "";
       String OddTest = "";
       String Test2 ="";
        String[] refinedholder = new String[1000];
        String[] refinedholder2 = new String[1000];
        String[] URLS = {"https://www.pmseurope.com/collections/plastic-cutting-pliers/products/flatfaced-gatecutters", "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/roundback-gatecutters", "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/angled-gatecutters" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/copy-of-ergonomic-plastic-cutting-pliers" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/gate-cutter-economy" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/ergonomic-plastic-cutting-pliers" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/replacement_springs" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/heated-gate-cutter" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/mn008-mini-cutter" , "https://www.pmseurope.com/collections/plastic-cutting-pliers/products/lightweight-mini-cutter-model-nm007"};        
     int urlcounter = 0;
        NameTheFile = "C:\\Users\\tremanleo\\Documents\\OutputForScrapers\\WeirdEuroScrapes\\" + "PMSEurope.csv";
       File f = new File(NameTheFile);
	FileWriter fw = new FileWriter(f);
	PrintWriter out = new PrintWriter(fw);
        out.print("Model Num, Price EUR \n");
        
        while (urlcounter != 9)
        {
        URL = URLS[urlcounter];
        Document doc = Jsoup.connect(URL).timeout(1000 * 10).get();	   
     Elements spangrabbers = doc.getElementsByClass("text-center");
     		    for (Element spangrab : spangrabbers)
		    {
		    holder = spangrab.text();
                    
                   holder2 = holder.replaceAll("-", "");
                   holder = holder.replaceAll("Covid 19: We are working normal hours with reduced staff but we are servicing customers as normal. Sign in or Create an Account Search Cart 0", "");
                   holder2 = holder.replaceAll("", "");
                   holder = holder.replaceAll("- +", "");
                   if (holder.contains("+")) 
                   {
                   holder = "";
                   }
                   if(holder == null || holder.isEmpty())
                   {
                    }
                   else
                   {
                    refinedholder[extracounter] = holder;
                    extracounter++;
                    extracap++;
                   }
                      
		      counter++; 
                      cap++;     
		    }
                    extracounter = 0;      
    while(extracounter != extracap)
    {    

        if(counter2 == 0)
        {

          OddTest = refinedholder[extracounter] + ",";
          out.print(OddTest);
          System.out.println(OddTest);
        }    
        if(counter2 == 1)
        {
        OddTest = refinedholder[extracounter] +"\n";    
        out.print(OddTest);
       System.out.println(OddTest);
        }

        extracounter++;
        counter2++;
                if(counter2 == 2)
        {
                  counter2 = 0;  
        }
out.flush(); 
    }           
           urlcounter++;
           countofpages++;
        }
           //Close the Print Writer
           out.close();       
	   //Close the File Writer
	   fw.close();    
    }    
}