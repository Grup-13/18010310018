import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class TCPClient {
    TCPRouter yonlendirici = new TCPRouter();
	
	private static ServerSocket serverSocket1; 
	private static ServerSocket serverSocket2;
	private static ServerSocket serverSocket3;
        private static ServerSocket serverSocket4;
        private static ServerSocket serverSocket5;
        private static ServerSocket serverSocket6;
        private static ServerSocket serverSocket7;
        private static ServerSocket serverSocket8;
        
	   private static final int PORT1 = 15;
	   private static final int PORT2 = 25;
	   private static final int PORT3 = 35;
           private static final int PORT4 = 45;
           private static final int PORT5 = 55;
           private static final int PORT6 = 65;
           private static final int PORT7 = 75;
           private static final int PORT8 = 85;
           
	   public static void main(String[] args)  
	   {  
	      System.out.println("Portlar açılıyor.");  
	      try  
	      {  
	         serverSocket1 = new ServerSocket(PORT1);   
	         serverSocket2 = new ServerSocket(PORT2);
	         serverSocket3 = new ServerSocket(PORT3);
	         serverSocket4 = new ServerSocket(PORT4);
                 serverSocket5 = new ServerSocket(PORT5);
                 serverSocket6 = new ServerSocket(PORT6);
                 serverSocket7 = new ServerSocket(PORT7);
                 serverSocket8 = new ServerSocket(PORT8);
                 
              }  
            
	      catch(IOException ioEx)  
	      {  
	         System.out.println(  
	                         "Alıcı bağlantı noktasına bağlanamıyor!");  
	         System.exit(1);  
	      }  
	      
	         handleRouter();    
	   }    
	   private static void handleRouter()  
	   {  
	      Socket link1 = null;    
	      Socket link2 = null;    
	      Socket link3 = null;    
              Socket link4 = null; 
              Socket link5 = null; 
              Socket link6 = null; 
              Socket link7 = null; 
              Socket link8 = null; 
              
	      try  
	      {  
	         link1 = serverSocket1.accept();
	         link2 = serverSocket2.accept();
	         link3 = serverSocket3.accept();
                 link4 = serverSocket4.accept();
                 link5 = serverSocket5.accept();
                 link6 = serverSocket6.accept();
                 link7 = serverSocket7.accept();
                 link8 = serverSocket8.accept();
                 

	         Scanner input1 =  
	            new Scanner(link1.getInputStream());   
	         PrintWriter output1 =  
	              new PrintWriter(  
	                 link1.getOutputStream(),true); 
	         
	         Scanner input2 =  
	 	          new Scanner(link2.getInputStream());   
	 	     PrintWriter output2 =  
	 	          new PrintWriter(  
	 	              link2.getOutputStream(),true);     
	 	         
	         Scanner input3 =  
		 	          new Scanner(link3.getInputStream());   
		 	 PrintWriter output3 =  
		 	          new PrintWriter(  
		 	          link3.getOutputStream(),true);     
                 Scanner input4 =  
		 	          new Scanner(link4.getInputStream());   
		 	 PrintWriter output4 =  
		 	          new PrintWriter(  
		 	          link4.getOutputStream(),true);  
                         Scanner input5 =  
		 	          new Scanner(link5.getInputStream());   
		 	 PrintWriter output5 =  
		 	          new PrintWriter(  
		 	          link5.getOutputStream(),true);  
                         Scanner input6 =  
		 	          new Scanner(link6.getInputStream());   
		 	 PrintWriter output6 =  
		 	          new PrintWriter(  
		 	          link6.getOutputStream(),true);  
                         Scanner input7 =  
		 	          new Scanner(link7.getInputStream());   
		 	 PrintWriter output7 =  
		 	          new PrintWriter(  
		 	          link7.getOutputStream(),true);  
                         Scanner input8 =  
		 	          new Scanner(link8.getInputStream());   
		 	 PrintWriter output8 =  
		 	          new PrintWriter(  
		 	          link8.getOutputStream(),true);  
                         
		 	         
	 	         
	 	     
	         int numMessages = 0;  
	           String message1 = input1.nextLine(); 
	           String message2 = input2.nextLine(); 
	           String message3 = input3.nextLine(); 
                   String message4 = input4.nextLine(); 
                   String message5 = input5.nextLine(); 
                   String message6 = input6.nextLine(); 
                   String message7 = input7.nextLine(); 
                   String message8 = input8.nextLine(); 
                   

	           while (!message1.equals("***KAPAT***")) 
	        
	         {
	        	 output1.println("ACK(1)"+numMessages);
	        	 output2.println("ACK(2)"+numMessages);
	        	 output3.println("ACK(3)"+numMessages);
                         output4.println("ACK(4)"+numMessages);
                         output5.println("ACK(5)"+numMessages);
                         output6.println("ACK(6)"+numMessages);
                         output7.println("ACK(7)"+numMessages);
                         output8.println("ACK(8)"+numMessages);
                         

	        	 numMessages++;
	        	 if(!message1.isEmpty())
	        		 System.out.print(numMessages + "(router 1):" + message1+"\t");
	        	 if(!message2.isEmpty())
	        		 System.out.print(numMessages + "(router 2):" + message2+"\t");
	        	 if(!message3.isEmpty())
	        		 System.out.print(numMessages + "(router 3):" + message3+"\t");
                         if(!message4.isEmpty())
	        		 System.out.print(numMessages + "(router 4):" + message4+"\t");
                         if(!message5.isEmpty())
	        		 System.out.print(numMessages + "(router 5):" + message5+"\t");
                         if(!message6.isEmpty())
	        		 System.out.print(numMessages + "(router 6):" + message6+"\t");
                         if(!message7.isEmpty())
	        		 System.out.print(numMessages + "(router 7):" + message7+"\t");
                         if(!message8.isEmpty())
	        		 System.out.print(numMessages + "(router 8):" + message8+"\t");
                         
	            	message1 = input1.nextLine();
	            	message2 = input2.nextLine();
	            	message3 = input3.nextLine();
                        message4 = input4.nextLine();
                        message5 = input5.nextLine();
                        message6 = input6.nextLine();
                        message7 = input7.nextLine();
                        message8 = input8.nextLine();
                        
		
	            	System.out.println();
	             
	         }  
	        
	       }  

	       catch(Exception ioEx)  
	       {  
	          
	       }    
	       finally  
	       {  
	          try  
	          {  
	             System.out.println(  
	                        "* Closing Cconnectionions*");  
	             link1.close();
	             link2.close();
	             link3.close();
                     link4.close();
                     link5.close();
                     link6.close();
                     link7.close();
                     link8.close();
                     
	          }  
	          catch(IOException ioEx)  
	          {  
	              System.out.println(  
	                            "Unable to disconnect!");  
	            System.exit(1);  
	          }  
	       }  
	   }  

}
