
package bankacc;
import java.util.Scanner;
public class Bankacc {
    public  String firstname;
    public String lastname;
    public int accno;
    public double currentbal,bal;
      
     Scanner s = new Scanner(System.in);     
           
   
     
    void read_data(){
        
        System.out.println("Enter your record/account no.: ");
        accno=s.nextInt();
        System.out.println("Enter your first name: ");
        firstname=s.next();
        System.out.println("Enter your last name: ");
        lastname=s.next();
        System.out.println("Enter the balance: ");
        bal=s.nextDouble();
    
    }
    
  
 
  
 void show_data(){
   
        System.out.println(" Record no.: "+ accno +" First name: "+ firstname + " Last name: "+lastname+ " Current balance: "+bal);
       
    } 
 
  boolean search(int a){
      if (accno==a){          
          show_data(); 
         return true;
      }
      else
          return false;
   }
  
  
  
  void edit(){
      System.out.println("*******************");
      System.out.println("########What do you want to edit?#######");
      System.out.println("1. First name");
      System.out.println("2. Last name");
      System.out.println("3. Record no");
      System.out.println("4.Balance");
      System.out.println("******************");
      int ch = s.nextInt();
      System.out.println("Enter your choice: "+ch);
      
       switch(ch){
           case 1:
               System.out.println(" Original firstname: "+firstname);
               String f = s.next(); 
               System.out.println("Type the new first name: "+f);
               //String f = s.next(); 
               firstname=f;
               System.out.println(" New First name: "+firstname);
              
               break;
               
           case 2:
                System.out.println("Original last name: "+lastname);
                 String l = s.next();
                System.out.println("Type the new last name: "+l);
              
               lastname=l;
               System.out.println("New last name: "+lastname);
                
               break;
               
           case 3:
                System.out.println("Original recordno: \t"+accno);
                int a = s.nextInt();
                System.out.println("Type the new recordno: "+a);
                
                accno=a;
                System.out.println("New recordno: \t"+accno);
              
               break;
               
           case 4:
                System.out.println("Original balance: "+bal);
                double b = s.nextDouble();
                System.out.println("Type the balance: "+b);
                
                bal=b;
               System.out.println("New balance: "+bal);
                
               break;
               
          
            
           default:
               System.out.println("Invalid input!!!");
               
          }
      
      
  }
  
  
  
 

 public static void main(String[] args) {
    
      int count=0;
      // Bankacc b = new Bankacc();
        Scanner s = new Scanner(System.in);
        System.out.println("##################Welcome to the bank#############");
        System.out.println("How Many Customer U Want to Input :");    
            int c = s.nextInt();
            Bankacc[] C = new Bankacc[c];
            
            for(int i=0;i<C.length;i++){
                System.out.println("Customer"+(i+1));
                C[i]= new Bankacc();
                C[i].read_data();
                count++;
            }
      
            
         int ch;
            
        do{
           
             System.out.println("1.Show data:"); 
             System.out.println("2.Search record: ");
             System.out.println("3.Edit record: ");
             System.out.println("4. Delete record: ");
             System.out.println("Enter your choice:");
             ch = s.nextInt();
            System.out.println("***********************");                            
            
                     
            
             switch(ch){
                 
                 
              
                 case 1:
                    
                     System.out.println();
                     for(int i=0;i<C.length;i++){
                            System.out.println(" For Customer:"+(i+1));
                                C[i].show_data();
                         }
              
                     System.out.println();
                     break;
            
                 case 2:                   
                  
                     System.out.println();
                     System.out.println("Total records present: ");
                     System.out.println(count);
                     System.out.println("Enter the record no  u want to search");
                     int acc = s.nextInt();
                     boolean find=false;
			 for(int i=0;i<C.length;i++){ 
                             find=C[i].search(acc);
                             if (find){
                                  break;						   
                               }
                           }
                           if (!find)   {
                                System.out.println("Error in opening!\n" + "File Not Found!!");        
                         }
                       
                    break;
                  
                               
                 case 3:
                
                     System.out.println();
                     System.out.println("Enter the record no where u want edit: ");
                     acc = s.nextInt();
                     //find=false;                     
                     for(int i=0;i<C.length;i++){ 
                          // find=C[i].search(acc);
                           if(C[i].search(acc)==true){
                                C[i].edit();                                                            
                                break;
                          }  
                         
                       else        
                            System.out.println("Error in opening!\n" + "File Not Found!!");                         
                     }
                             
                     
                  break;
                     
                     
                     
                   case 4:
                   
                     System.out.println();
                     System.out.println("Total records present: \n ");
                     System.out.println(count);
                     System.out.println("Enter the record no u want to delete: ");                                       
                     acc = s.nextInt();
                                         
                   // find=false;                     
                     for(int i=0;i<C.length;i++){ 
                          // find=C[i].search(acc);
                           if(C[i].search(acc)==true){
                              System.out.println("Record no.: "+ " " +" First name: "+ " " + "Last name: "+" "+ " Current balance: "+" ");
                                       						   
                           break;
                       } 
                     
                       else
                               System.out.println("Error in opening!\n" + "File Not Found!!");
                     
                     } 
                    break;  
                     
                      
                 default:
                     System.out.println("invalid");
                
            
             }
          
          }while(ch!=4);
        
       
       
       }
    
  }

