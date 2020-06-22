package quantityscraperlauncher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class QuantityScraperLauncher 
{
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException 
    {
    int counteroftheloop  = 0;
       int loopcap = 0;
       int subloopcount = 0;
       int filenamecounter = 0;
       
       File file4 = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\CounterForMassiveScrapes.txt");
       File file3 = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls1.txt");  
       File UrlLoaderFile = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\UrlLoader.txt");
       BufferedReader br3 = new BufferedReader(new FileReader(file3));
       String Manipulator = "";
       
       //Check What List We Are Scraping During This Run
         BufferedReader br = new BufferedReader(new FileReader(file4));
				String line;
				while ((line = br.readLine()) != null) 
	                        {
	                                filenamecounter = Integer.parseInt(line);  
	                        }
				br.close();
        //0 in here is text file 1.                                                        
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls1.txt"));  
        
        if(filenamecounter == 62)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls63.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls63.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 61)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls62.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls62.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 60)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls61.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls61.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 59)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls60.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls60.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 58)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls59.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls59.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 57)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls58.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls58.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 56)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls57.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls57.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 55)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls56.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls56.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 54)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls55.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls55.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 53)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls54.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls54.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 52)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls53.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls53.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 51)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls52.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls52.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 50)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls51.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls51.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 49)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls50.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls50.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 48)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls49.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls49.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 47)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls48.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls48.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 46)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls47.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls47.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 45)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls46.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls46.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 44)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls45.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls45.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 43)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls44.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls44.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 42)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls43.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls43.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 41)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls42.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls42.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 40)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls41.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls41.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 39)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls40.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls40.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 38)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls39.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls39.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 37)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls38.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls38.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 36)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls37.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls37.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 35)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls36.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls36.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 34)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls35.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls35.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 33)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls34.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls34.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 32)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls33.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls33.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 31)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls32.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls32.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 30)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls31.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls31.txt"));
        filenamecounter++;
        }        
        if(filenamecounter == 29)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls30.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls30.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 28)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls29.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls29.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 27)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls28.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls28.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 26)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls27.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls27.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 25)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls26.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls26.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 24)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls25.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls25.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 23)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls24.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls24.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 22)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls23.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls23.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 21)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls22.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls22.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 20)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls21.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls21.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 19)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls20.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls20.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 18)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls19.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls19.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 17)
        {
        reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls18.txt"));   
        br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls18.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 16)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls17.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls17.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 15)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls16.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls16.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 14)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls15.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls15.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 13)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls14.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls14.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 12)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls13.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls13.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 11)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls12.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls12.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 10)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls11.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls11.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 9)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls10.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls10.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 8)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls9.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls9.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 7)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls8.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls8.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 6)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls7.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls7.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 5)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls6.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls6.txt"));
        filenamecounter++;
        }        
        if(filenamecounter == 4)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls5.txt"));   
         br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls5.txt"));
        filenamecounter++;
        }
        if(filenamecounter == 3)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls4.txt"));   
        br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls4.txt"));
         filenamecounter++;
        } 
        if(filenamecounter == 2)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls3.txt"));   
        br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls3.txt"));
         filenamecounter++;
        } 
         if(filenamecounter == 1)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls2.txt"));   
        br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls2.txt"));
         filenamecounter++;
        }     
        if(filenamecounter == 0)
        {
         reader = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls1.txt"));   
        br3 = new BufferedReader(new FileReader("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\MassScraperURLHolder\\200urls1.txt"));
         filenamecounter++;
               }
        if(filenamecounter == 62)
        {
        filenamecounter = 0;
        }
        System.out.println(filenamecounter);
        File f7 = new File("C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\CounterForMassiveScrapes.txt");
	FileWriter fw7 = new FileWriter(f7);
	PrintWriter out7 = new PrintWriter(fw7);
        	   out7.print(filenamecounter);
	   out7.flush(); 
	   //Close the Print Writer
	   out7.close();       
	   //Close the File Writer
	   fw7.close();   
        
        //Check the number of lines in the url holder txt file, then set the scraping for that many lines / set the sring array to hold that many lines.
        
        int NumberOfLines = 0;
        while (reader.readLine() != null) NumberOfLines++;
        reader.close();
        
        loopcap = NumberOfLines;
        System.out.println(loopcap);
        String[] URLHolderArrayL = new String[NumberOfLines]; 
       
        //Read the url list and populate current url with scraping url.
	String line3;
	while ((line3 = br3.readLine()) != null) 
            {                      
            URLHolderArrayL[subloopcount] = line3;
             subloopcount++;
            }
             subloopcount = 0;
             br3.close();

                   while (counteroftheloop != loopcap)
                {  
                System.out.println("Launching Quantity Scraper.");            
                // Run LeonardScraper2
                Process proc = Runtime.getRuntime().exec("java -jar C:\\Users\\tremanleo\\Documents\\NetBeansProjects\\QuantityScraperLauncher\\CustomFiles\\FileArea\\UrlScraper.jar");
                InputStream in = proc.getInputStream();
                InputStream err = proc.getErrorStream();     
                
                //Give it time to run
                TimeUnit.SECONDS.sleep(1);   
                    
                //Move Number Matching URL name from URLHolder Array To Manipulator                       
               Manipulator = URLHolderArrayL[counteroftheloop];
               System.out.println(Manipulator);
               
               //Write URL TO UrlLoader.txt for LeonardScraper2 To Use On Next Iteration
                   FileWriter fw3 = new FileWriter(UrlLoaderFile);
                   PrintWriter out3 = new PrintWriter(fw3);   
                   System.out.println("Manipulator: " + Manipulator);
                   out3.print(Manipulator);
                    out3.flush(); 
                     out3.close();
                     fw3.close();                
                
                counteroftheloop++;
                }
                   //Reset UrlLoader.txt for next use
                   FileWriter fw3 = new FileWriter(UrlLoaderFile);
                   PrintWriter out3 = new PrintWriter(fw3);     
                   out3.print("https://www.pcs-company.com/vrsf-245-26450");
                    out3.flush(); 
                     out3.close(); 
                     fw3.close();    
    }   
}