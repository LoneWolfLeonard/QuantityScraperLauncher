package quantityscraper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Date;
import java.text.*;
import java.util.Random; 
import java.util.concurrent.TimeUnit;

public class QuantityScraper {

    public static void main(String[] args) throws IOException, InterruptedException 
    { 
         String holder2 = "";
         String URL = "";
         File file = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\FileArea\\Counter.txt"); 
	     File file2 = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\FileArea\\UrlLoader.txt"); 
	     int filenamecounter = 0;
	     String GimmeAName = "";
	     String[] SpanHolderArray = new String[99999];
	     int SpanHolderCounter = 0;
	     int TheNumberOfLines = 0;
	     int CounterOfJustice = 0;    
	     String S = ""; 
             String Modifier = "";
	     int newlinecounter = 0;
             String StuffToWrite = "";
             String NameOfTheItem = "";
             String NameTheFile = "";   
             int counter = 0;
             int ProxyCounter = 0;
             int ProxyCap = 0;
             String[] ProxyIpHolder = new String[1000];
             String[] ProxyPortHolder = new String[1000];
             String ProxyIP = "";
             int proxyNumber = 0;
             String ProxySiteListFile = "C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\FileArea\\proxysitelist.txt";
             String ProxySitePortFile = "C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\FileArea\\proxysiteports.txt";
             int timeoutscrapeattemps = 5;
             int trylooper = 0;
             int trycounter = 0;
             Random rand2 = new Random(); 
             int trycap = rand2.nextInt(4);
             Random rand3 = new Random(); 
             int waitarandomamountoftime = rand3.nextInt(5);
             Document doc = null;
             String[] UserAgentSimulator = { "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.61 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.106 Safari/537.36" , "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.1.1 Safari/605.1.15" , "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36" , "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:77.0) Gecko/20100101 Firefox/77.0"};

                        //Phase -1 Getting A Good Proxy To Use
             	      BufferedReader brProxyIP = new BufferedReader(new FileReader(ProxySiteListFile));
				String lineIP;
				while ((lineIP = brProxyIP.readLine()) != null) 
	                        {
	                                ProxyIpHolder[ProxyCounter] = lineIP;  
                                       System.out.println(ProxyIpHolder[ProxyCounter]);
                                        ProxyCounter++; 
                                        ProxyCap++;
	                        }
                                ProxyCounter = 0;
                                BufferedReader brProxyPort = new BufferedReader(new FileReader(ProxySitePortFile));
				while ((lineIP = brProxyPort.readLine()) != null) 
	                        {
	                                ProxyPortHolder[ProxyCounter] = lineIP;  
                                        System.out.println(ProxyPortHolder[ProxyCounter]);
                                        ProxyCounter++;         
	                        } 
                                ProxyCounter = 0;
             //Phase 0 Deciding The Name of the CSV File
	// Read The Counter      
	      BufferedReader br = new BufferedReader(new FileReader(file));
				String line;
				while ((line = br.readLine()) != null) 
	                        {
	                                counter = Integer.parseInt(line);  
	                        }
								br.close();	
                                                      counter++;
           FileWriter fw2 = new FileWriter("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\FileArea\\Counter.txt");
	   PrintWriter out2 = new PrintWriter(fw2);  
	   out2.print(counter);
	   out2.flush(); 
	   //Close the Print Writer
	   out2.close();       
	   //Close the File Writer
	   fw2.close();                                                            
             
             BufferedReader br2 = new BufferedReader(new FileReader(file2));                      
             String line2 = "";
			while ((line2 = br2.readLine()) != null) 
	                    {
	                        URL = line2;
	                        System.out.println(line2);
                            }	            
	                    br2.close();             
                  
            while(trylooper != 1)
            {    
             Random rand = new Random(); 
             int UserAgentRandomizer = rand.nextInt(5);
             ProxyCounter = rand2.nextInt(602);
             
            try
            {            
            //set HTTP proxy host to 127.0.0.1 (localhost)
            System.setProperty("https.proxyHost", ProxyIpHolder[ProxyCounter]);
            
            //set HTTP proxy port to 3128
            System.setProperty("https.proxyPort", ProxyPortHolder[ProxyCounter]);
            
            String strText = 
                    Jsoup
                    .connect(URL)
                    .userAgent(UserAgentSimulator[UserAgentRandomizer])
                    .timeout(10 * 1000)
                    .get()
                    .text();
             doc = Jsoup.connect(URL).userAgent(UserAgentSimulator[UserAgentRandomizer]).timeout(10 * 1000).get(); 
            trylooper = 1;
            System.out.println(strText);
            TimeUnit.SECONDS.sleep(waitarandomamountoftime);
        }
            catch(IOException ioe)
            {
            System.out.println("Exception: " + ioe);
            trylooper = 0;
            trycounter++;
            if(trycounter == trycap)
            {
                trylooper = 1;
                System.exit(0); 
            }
            }
            }

        Elements spangrabbers = doc.getElementsByClass("table-wrapper");
        Elements h1s = doc.select("h1");  
    //Grabs the title of the page
   for (Element h1 : h1s) 
   {     
   NameOfTheItem = h1.text();
   System.out.println(NameOfTheItem);
   }     
     Modifier = NameOfTheItem.replaceAll(" ", "");
     NameOfTheItem = Modifier.replaceAll(",", "");
     //Set The Name of The File
     NameTheFile = "C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperSingleLauncher\\CustomFiles\\CSVArea\\" + NameOfTheItem + ".csv";
       File f = new File(NameTheFile);
	FileWriter fw = new FileWriter(f);
	PrintWriter out = new PrintWriter(fw);  

        for (Element spangrab : spangrabbers)
		    {
		    //System.out.println("New Span: ");
		    //System.out.println(spangrab);
		    holder2 = spangrab.text();
		    //System.out.println(holder2);
		    SpanHolderArray[SpanHolderCounter] = holder2;
		    System.out.println(SpanHolderCounter);
		    System.out.println(SpanHolderArray[SpanHolderCounter]);
		    SpanHolderCounter++;
		    }
		    //Phase 4, Write The Stuff We Need To A File                    
                    //ItemName

                        out.print(NameOfTheItem); 
                        out.print(","); 
                        
                     //Date                     
                    Date dNow = new Date( );
                    SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");           
                    String Date = ft.format(dNow).toString();
                    System.out.println(Date);                     
                    out.print(Date); 
                    out.print(",");           
                        
                    //Quantity
		    StuffToWrite = SpanHolderArray[CounterOfJustice];
            Modifier = StuffToWrite.replaceAll("Quantity Available: ", "");
            StuffToWrite = Modifier.replaceAll(",", "");            
		     out.print(StuffToWrite);  
		      out.print("\n");  
		  
		        newlinecounter++;
		        if (newlinecounter == 1)
		        {
		            newlinecounter = 0;
		        }
		        CounterOfJustice++;

            	    out.flush(); 
	    //Close the Print Writer
	   out.close();       
	   //Close the File Writer
	   fw.close();               
    }   
}