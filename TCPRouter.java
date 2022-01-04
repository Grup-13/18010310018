import java.io.*;  
import java.net.*;  
import java.util.*;    

public class TCPRouter
{  
   private static ServerSocket ServerSocket; 
   private static InetAddress host;
   private static final int Server_PORT = 10; 
   private static final int Client_PORT = 15;
   private static Socket ClientLink = null;
   
   public static void main(String[] args)  
   {  
      TCPClient alici = new TCPClient();
   TCPServer gonderici = new TCPServer();
       System.out.println("Port açılıyor. ");
      {  
          try  
          {  
        	  System.out.println("TCPRoute Başlatılıyor..Localhost'un ip Adresi Alınıyo..");
        	  host = InetAddress.getLocalHost();  
          }  
          catch(Exception uhEx)  
          {  
              System.out.println("Host'un ID'si bulunamadı !");  
              System.exit(1);  
          }  
            
      }
      try  
      {  
    	  
    	 ServerSocket = new ServerSocket(Server_PORT);  
         ClientLink = new Socket(host,Client_PORT);
         
      }  
      catch(IOException ioEx)  
      {  
         System.out.println("Alıcı bağlantı noktasına bağlanamıyor!");  
         System.exit(1);  
      }  
      
      handleClient();  
      
   }    
   private static String handleClient()  
   {  
      Socket ServerLink = null;                         
      
      try  
      {  
    	 ServerLink = ServerSocket.accept();            
        
         Scanner ServerInput =  
            new Scanner(ServerLink.getInputStream());  
         
         PrintWriter senderOutput = new PrintWriter(ServerLink.getOutputStream(), true);       
         
           String message = ServerInput.nextLine(); 
           
           
           Scanner receiverInput = new Scanner(ClientLink.getInputStream());      
   
           PrintWriter ClientOutput = new PrintWriter(ClientLink.getOutputStream(), true);   
        
           
         while (!message.equals("***KAPALI***")){ 
        	 
        	 if(!message.isEmpty())
        		 System.out.print("Sunucudan mesaj: "+message+"\t");
        	 
        	 ClientOutput.println(message);
        	 
        	 String str=receiverInput.nextLine();
        	 
        	 if(!str.isEmpty() && !message.isEmpty())
        		 System.out.println("Alıcıdan mesaj:: "+str);

        	 senderOutput.println(str);
        	 
        	 message = ServerInput.nextLine();
       
        }  
      
         
       }  

       catch(IOException ioEx)  
       {  
           ioEx.printStackTrace();  
       }    
       finally  
       {  
          try  
          {  
             System.out.println(  
                        "* Closing Cconnectionions*");  
             ServerLink.close(); 
             ClientLink.close();
          }  
          catch(IOException ioEx)  
          {  
              System.out.println(  
                            "Unable to disconnect!");  
            System.exit(1);  
          }  
       }
	return null;  
   }  
   
   }
  
