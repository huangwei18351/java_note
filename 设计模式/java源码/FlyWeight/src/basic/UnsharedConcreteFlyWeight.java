package basic;

public class UnsharedConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体flyweight:" + extrinsicState);
	}

}
