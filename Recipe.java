import java.util.HashMap;
import java.util.*;
public class Recipe {

    static Scanner sc = new Scanner(System.in);

    public HashMap<String,ArrayList<String>> addRecipe(){
        System.out.println("How many recipes do you want to add? ");
        int num = sc.nextInt();
        sc.nextLine();
        HashMap<String,ArrayList<String>> recipes = new HashMap<String,ArrayList<String>>(num);
        for(int i=0;i<num;i++){
            System.out.println("Enter the "+(i+1)+" recipe name");
            String recipeName = sc.nextLine();
            //String ingredients = sc.nextLine();
            /*how many ingredients you want to add*/
            recipes.put(recipeName,new ArrayList<String>());
            System.out.println("Enter how many ingredient you want: ");
            int ingredients = sc.nextInt();
            sc.nextLine(); 
            for(int j=0;j<ingredients;j++){
                System.out.println("Enter the "+(j+1)+" ingredient");
                String ing = sc.nextLine();
                recipes.get(recipeName).add(ing);
            }
        }
        return recipes;
    }

    public void print(HashMap<String,ArrayList<String>> recipes){
        System.out.print(recipes);
    }

    public void printRecipe(HashMap<String,ArrayList<String>> recipes){
        for(String name: recipes.keySet()){
            String key = name.toString();
            System.out.println(key);
        }
    }

    public void displayRecipe(HashMap<String,ArrayList<String>> recipes){ 
        System.out.println("Enter the recipe name: ");  
        String displayName = sc.nextLine();
        if(recipes.get(displayName)!=null){
            System.out.println(recipes.get(displayName));
        }
        else{
            System.out.println("Sorry the recipe not found");
        }
    }
}
