
public class RecipeTestDemo {

	public static void main(String[] args) {
		RecipeContext rc=new RecipeContext();
		RecipeTypeState type=new RecipeTypeState();
		type.prepareRecipe(rc);
		System.out.println(rc.getCurryRecipeState().toString());
		
		ContinentalDishesState cds=new ContinentalDishesState();
		cds.prepareRecipe(rc);
		System.out.println(rc.getCurryRecipeState().toString());
		
		RecipeCostType cost = new RecipeCostType();
		cost.prepareRecipe(rc);
		System.out.println(rc.getCurryRecipeState().toString());

	}

}
