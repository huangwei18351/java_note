package basic;

import java.util.Hashtable;

public class FlyWeightFactory {
	private Hashtable<String, FlyWeight> flyWeights = new Hashtable<String, FlyWeight>();
	public FlyWeightFactory(){
		flyWeights.put("x", new ConcreteFlyWeight());
		flyWeights.put("y", new ConcreteFlyWeight());
		flyWeights.put("z", new ConcreteFlyWeight());
	}
	public FlyWeight getFlyWeight(String key){
		return (FlyWeight)flyWeights.get(key);
	}
}
