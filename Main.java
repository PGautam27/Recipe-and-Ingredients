import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashMap<String, ArrayList<String>> dish = new HashMap<String, ArrayList<String>>();
        
        boolean flag = true;
        
        while(flag){
            Recipes obj = new Recipes();
            System.out.println();
            System.out.println ("Welcome to the Recipe Manager.");
            System.out.println ("Please type the number of the operation you would like to perform:");
            System.out.println ("1. Add a New Recipe and it's ingredients");
            System.out.println ("2. Add instruction for the Recipe");
            System.out.println ("3. List All Recipe present");
            System.out.println ("4. Display Recipe");
            System.out.println ("5. Search for Recipes by it's name");
            System.out.println ("6. Close the Recipe Application");
            int k = sc.nextInt();
            switch(k){
                case 1:
                    dish = obj.addRecipe();
                    break;
                case 2:
                    obj.addInstruction(dish);
                    break;    
                case 3:
                   obj.printRecipe(dish);
                    break;
                case 4:
                    obj.print(dish);
                    break;
                case 5:
                    obj.displayRecipe(dish);
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                System.out.println("Pls enter the correct option"); 
                break;            
                                
            }
        }
    }
}
