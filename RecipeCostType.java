
public class RecipeCostType implements CurryRecipeState{

	@Override
	public void prepareRecipe(RecipeContext c) {
		System.out.println("Cost: $5 to $100");
		c.setCurryRecipeState(this);
	}

	public String toString()
	{
		return "Recipe Cost State";
	}
}

