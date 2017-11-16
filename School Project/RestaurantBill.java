import java.io.*;
class RestaurantBill
{
   
   String MainCourseMenu[]={"Veg Fried Rice", "Egg Fried Rice","Chicken Fried Rice", "Mixed Fried Rice", "Jeera Rice", "Matar Pulao", "Rajdhani Pulao", "Veg Pulao", "Chicken Biriyani", "Mutton Biriyani", "Veg Noodles", "Egg Noodles", "Chicken Noodles", "Mixed Noodles", "Veg Alfredo Pasta", "Chicken Alfredo Pasta", "Prawn Alfredo Pasta", "Tandoori Roti", "Butter Naan", "Garlic Naan", "Plain Naan", "Masala Kulcha", "Chicken Kulcha", "Mutton Kulcha"};
    double MainCourseRate[]={155,165, 185, 195, 125, 135, 175, 125, 195, 255, 175, 180, 195, 210, 225, 200, 220, 150, 165, 170, 110, 125, 135, 200};
   String StarterMenu[]={"Chicken Kabab", "Mutton Kabab", "Fish Kabab", "Fish Finger", "Chicken Pakora", "Dry Chilli Chicken", "Chicken Finger", "Chicken Delight", "Sweet Baby Corn", "Chilli Baby Corn", "Chicken Tandoori Pizza", "Grilled Chicken Pizza", "Chilli Prawn Pizza", "Spinach Tossed Pizza", "Chicken Sandwich", "Veg Sandwich", "Chicken Sweetcorn Soup", "Chicken Manchow Soup", "Seafood Soup", "Veg Sweetcorn Soup", "Veg Clear Soup", "Veg Manchow Soup", "Green Salad", "Mixed Veg Raita", "Pineapple Raita", "Bundi Raita"};
   double StarterRate[]={100, 120, 135, 130, 200, 220, 180, 195, 160, 100, 120, 230, 220, 145, 165, 180, 85, 90, 110, 65, 50, 85, 100, 35, 40, 50};
   double total=0;
   int numitem=0;
   int numservings=0;
   double temp1=0;
   String order="";
   String ans="";
   String totalitems="";
   
   public void input()throws IOException
   {
       BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
      while(true)
      {
       System.out.println("Choose from Starters, Main Course. 1=Starters_______2=Main Course");
       int a=Integer.parseInt(r.readLine());
        if(a==1)
       {
           System.out.println("Press 'display' to view menu and rate. Press 'cancel' if you want to proceed without viewing the menu.");
           String l=r.readLine();
           if(l.equalsIgnoreCase("display"))
           {
               for(int i=0;i<StarterRate.length;i++)
               {
                   System.out.println(StarterMenu[i]+ " : "+ StarterRate[i]+ " " + "INR");
                }
            }
            else
            System.out.println("Proceed to enter valid items from the menu to be counted in the bill");
            
          while(true)
          {
              System.out.println("Enter the name of the dish you want to order.");
              order=r.readLine();
              order=order.toUpperCase();
               for(int i=0;i<StarterRate.length;i++)
               {
                   if(order.equalsIgnoreCase(StarterMenu[i].toUpperCase()))
                   {
                       temp1=StarterRate[i];
                    }
                }
           
                  System.out.println("Enter the number of servings");
                  numservings=Integer.parseInt(r.readLine());
                  total+=numservings*temp1;
                  temp1=0;
                  totalitems+=numservings+"x "+order+" ";
                  numservings=0;
                  order="";
                  System.out.println("Enter Y to continue adding more items or N to stop.");
                  ans=r.readLine();
                  if(ans.equals("Y"))
                  ans="";
                 else
                 {ans="";
                  break;
                }
                  

        
          }
          System.out.println("Do you want to continue ordering? Press 'EXIT' if no.");
          String exit=r.readLine();
         if(exit.equalsIgnoreCase("EXIT"))
         break;
        }
    
       if(a==2)
       {
           System.out.println("Press 'display' to view menu and rate. Press 'cancel' if you want to proceed without viewing the menu.");
           String l=r.readLine();
           if(l.equalsIgnoreCase("display"))
           {
               for(int i=0;i<MainCourseRate.length;i++)
               {
                   System.out.println(MainCourseMenu[i]+ " : "+ MainCourseRate[i]+ " " + "INR");
                }
            }
            else
            System.out.println("Proceed to enter valid items from the menu to be counted in the bill");
            
          while(true)
          {
              System.out.println("Enter the name of the dish you want to order.");
              String order=r.readLine();
              order=order.toUpperCase();
               for(int i=0;i<MainCourseRate.length;i++)
               {
                   if(order.equalsIgnoreCase(MainCourseMenu[i].toUpperCase()))
                   {
                       temp1=MainCourseRate[i];
                    }
                }
           
                  System.out.println("Enter the number of servings");
                  numservings=Integer.parseInt(r.readLine());
                  total+=numservings*temp1;
                  totalitems+=numservings+"x "+order+" ";
                  order="";
                  numservings=0;
                  temp1=0;
                  System.out.println("Enter Y to continue adding more items or N to stop.");
                  ans=r.readLine();
                   if(ans.equals("Y"))
                  ans="";
                 else
                 {ans="";
                  break;
                }
                 System.out.println("Do you want to continue ordering? Press 'EXIT' if no.");
          String exit=r.readLine();
         if(exit.equalsIgnoreCase("EXIT"))
         break;

        
          }
        }
        
          System.out.println("Is that your final order? Press 'EXIT' if yes. Press 'CONTINUE' if you want to add items.");
          String exit=r.readLine();
         if(exit.equalsIgnoreCase("EXIT"))
         
         break;
        } 
    
}
public void print()
{
    
    System.out.println("Bill For Today's Meal");
    System.out.println("*****************************************************************");
    System.out.println("You have ordered the following:");
    System.out.println(totalitems);
    System.out.println("The total bill amount  is Rs " +total);
    System.out.println("*****************************************************************");
    System.out.println("Thank You. Visit Again.");
    
}
}