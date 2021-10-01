
public class RecipeTypeState implements CurryRecipeState{

	@Override
	public void prepareRecipe(RecipeContext c) {
		System.out.println("Recipe Types: Pasta & risotto, Bread & doughs, Soup, Roast etc..");
		c.setCurryRecipeState(this);
	}

	public String toString()
	{
		return "Recipe Types State\n";
	}
}
