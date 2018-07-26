package ui.model;

public class WeaponOptions {

	public final MinMaxVarOption mightOptions;
	public final MinMaxVarOption hitOptions;
//	public final MinMaxVarOption critOptions;
	public final MinMaxVarOption weightOptions;
	public final MinMaxVarOption durabilityOptions;
	
	public final Boolean shouldAddEffects;
	public final WeaponEffectOptions effectsList;
	
	public WeaponOptions(MinMaxVarOption mightOptions, 
			MinMaxVarOption hitOptions, 
//			MinMaxVarOption critOptions,
			MinMaxVarOption weightOptions, 
			MinMaxVarOption durabilityOptions, 
			Boolean shouldAddEffects,
			WeaponEffectOptions effects) {
		super();
		
		this.mightOptions = mightOptions;
		this.hitOptions = hitOptions;
//		this.critOptions = critOptions;
		this.weightOptions = weightOptions;
		this.durabilityOptions = durabilityOptions;
		this.shouldAddEffects = shouldAddEffects;
		effectsList = effects;
	}
	
}