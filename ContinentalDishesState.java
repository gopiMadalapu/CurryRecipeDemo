
public class ContinentalDishesState implements CurryRecipeState{

	@Override
	public void prepareRecipe(RecipeContext c) {
		System.out.println("Continental Dishes: Sweet Potato pie, Crispy Calamari Rings,Yorkshire Lamb Patties etc..");
		c.setCurryRecipeState(this);
	}

	public String toString()
	{
		return "Continental Dishes State\n";
	}
}
