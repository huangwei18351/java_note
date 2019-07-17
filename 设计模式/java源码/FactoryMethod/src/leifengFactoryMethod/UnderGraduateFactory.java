package leifengFactoryMethod;

import leifengSimpleFactory.LeiFeng;
import leifengSimpleFactory.UnderGraduate;

public class UnderGraduateFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new UnderGraduate();
	}

}
