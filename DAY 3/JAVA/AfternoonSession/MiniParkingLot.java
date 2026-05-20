        import java.util.Scanner;
        
        public class MiniParkingLot{
            
            public static void main(String [] args){
            Scanner input = new Scanner(System.in);
           System.out.print("Enter option: ");
           int number = input.nextInt();
            int[] numbers = new int [number];
           
           
           for(int arr = 0; arr < numbers.length; arr++){
           System.out.print("Enter Parking Number: ");
           int car = input.nextInt();
           }
           
           
            System.out.print("""
            
            -------------WELCOME TO DAVID'S MINI-PARKING-LOT----------------
          
                                    ----ENTER PARKING OPTION-----
                                    
                             1. ENTER EMPTY SLOT TO PARK.
                             
                             2. TO LEAVE A SPOT YOU CAN SPECIFY CAR NUMBER 
                             
                            SAFE PARKING........
                            
                            """);
                  int park = getSpace(numbers,input); 
                  System.out.println("Free Space Available, Now You can park" + park);
                  int slots = specifySpace(numbers,input);
                  System.out.println(" Kindly park on No: " + slots);
                           
            
            }
                           public static int getSpace(int[] numbers, Scanner input){
                              int slot = 0;
                             for(int count = 0; count < numbers.length; count++){
                   
                              if(numbers[count] == 0){
                                numbers[count] = 1;
                              }
                              
                          //  else if (number[count]            )
                   
                   }     
                        
                       
                  return slot;      
                        
            }
                          public static int specifySpace(int[] numbers, Scanner input){
                            int space = 0;
                            for(int count = 0; count < numbers.length;count++){
                                    
                                    if(numbers[count] == 9){
                                    
                                    }
                            }
                                    return space;
                            }
            
            }
        
