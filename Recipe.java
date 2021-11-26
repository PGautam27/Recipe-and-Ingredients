import java.util.*;
public class Recipes {
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

    public HashMap<String,ArrayList<String>> addInstruction(HashMap<String,ArrayList<String>> inst){
        System.out.print("For which recipe do you wanna add the instructions: ");
        String k = sc.nextLine();
        for(HashMap.Entry<String,ArrayList<String>> entry : inst.entrySet()){
            boolean areEqual = k.equals(entry.getKey());
            if(areEqual){
                System.out.print("Enter how many instructions you wanna add: ");
                int r = sc.nextInt();
                sc.nextLine();
                for(int i=0;i<r;i++){
                    System.out.println("Enter the "+(i+1)+" instruction");
                    String y = sc.nextLine();
                    inst.get(k).add(y);
                }
            }
        }
        return inst;
    }

    public void print(HashMap<String,ArrayList<String>> recipes){
        for(HashMap.Entry<String,ArrayList<String>> entry : recipes.entrySet()){
            int i =1;
            System.out.println("The name of the recipe is: "+entry.getKey());
            System.out.println("The ingredients and the instructions are as follows: ");
            for(String inst: entry.getValue()){
                System.out.println(i+". "+inst);
                i++;
            }
            System.out.println();
        }
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
            for(HashMap.Entry<String, ArrayList<String>> entry : recipes.entrySet()){
                String key = entry.getKey();
                boolean areEqual = displayName.equals(key);
                if(areEqual){
                    int i = 1;
                    System.out.println("The ingredients and the instructions for the "+displayName+" recipe is: ");
                    for(String name : entry.getValue()){
                        System.out.println(i+". "+name);
                        i++;
                    }
                }
            }
        }
        else{
            System.out.println("Sorry the recipe not found");
        }
    }
}
