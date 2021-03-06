package ui.fe4;

import ui.model.WeightedOptions;

public class SkillWeightOptions {
	public final WeightedOptions wrathWeight;
	public final WeightedOptions adeptWeight;
	public final WeightedOptions charmWeight;
	public final WeightedOptions nihilWeight;
	public final WeightedOptions miracleWeight;
	public final WeightedOptions criticalWeight;
	public final WeightedOptions vantageWeight;
	public final WeightedOptions chargeWeight;
	public final WeightedOptions astraWeight;
	public final WeightedOptions lunaWeight;
	public final WeightedOptions solWeight;
	public final WeightedOptions renewalWeight;
	public final WeightedOptions paragonWeight;
	public final WeightedOptions bargainWeight;
	
	public final int pursuitChance;
	
	public SkillWeightOptions(WeightedOptions wrath, 
			WeightedOptions adept, 
			WeightedOptions charm, 
			WeightedOptions nihil, 
			WeightedOptions miracle, 
			WeightedOptions critical, 
			WeightedOptions vantage, 
			WeightedOptions charge, 
			WeightedOptions astra, 
			WeightedOptions luna, 
			WeightedOptions sol, 
			WeightedOptions renewal, 
			WeightedOptions paragon, 
			WeightedOptions bargain,
			int pursuitChance) {
		super();
		this.wrathWeight = wrath;
		this.adeptWeight = adept;
		this.charmWeight = charm;
		this.nihilWeight = nihil;
		this.miracleWeight = miracle;
		this.criticalWeight = critical;
		this.vantageWeight = vantage;
		this.chargeWeight = charge;
		this.astraWeight = astra;
		this.lunaWeight = luna;
		this.solWeight = sol;
		this.renewalWeight = renewal;
		this.paragonWeight = paragon;
		this.bargainWeight = bargain;
		this.pursuitChance = pursuitChance;
	}
}
