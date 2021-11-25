import java.util.*;
import java.util.HashMap;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> dish = new HashMap<String, ArrayList<String>>();
        
        boolean flag = true;
        
        while(flag){
            Recipe obj = new Recipe();
            System.out.println ("Welcome to the Recipe Manager.");
            System.out.println ("Please type the number of the operation you would like to perform:");
            System.out.println ("1. Add a New Recipe");
            System.out.println ("2. List All Recipe present");
            System.out.println ("3. Display Recipe");
            System.out.println ("4. Search for Recipes by Ingredient");
            System.out.println ("5. Close the Recipe Application");
            int k = sc.nextInt();
            switch(k){
                case 1:
                    dish = obj.addRecipe();
                    break;
                case 2:
                   obj.printRecipe(dish);
                    break;
                case 3:
                    obj.print(dish);
                    break;
                case 4:
                    obj.displayRecipe(dish);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                System.out.println("Pls enter the correct option"); 
                break;            
                                
            }
        }
    }
}
