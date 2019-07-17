package basic;

public class TestBasicFlyWeight {
	public static void main(String[] args) {
		int extrinsicState = 22;
		FlyWeightFactory ff = new FlyWeightFactory();
		
		FlyWeight fx = ff.getFlyWeight("x");
		fx.operation(extrinsicState);
		
		FlyWeight fy = ff.getFlyWeight("y");
		fy.operation(extrinsicState);
		
		FlyWeight fz = ff.getFlyWeight("z");
		fz.operation(extrinsicState);
		
		FlyWeight uf = new UnsharedConcreteFlyWeight();
		
		uf.operation(extrinsicState);
		
		
	}
}
