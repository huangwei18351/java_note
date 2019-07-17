package basic;

public class ConcreteFlyWeight extends FlyWeight {

	@Override
	public void operation(int extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("具体flyWeight：" + extrinsicState);
	}

}
