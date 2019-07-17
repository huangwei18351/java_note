package leifengFactoryMethod;

import leifengSimpleFactory.LeiFeng;
import leifengSimpleFactory.Volunteer;

public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
