package mobilePhone;

public class TestMobile {
	public static void main(String[] args) {
		HandSetBrand ab = new HandSetBrandN();
		ab.setHandSetSoft(new HandSetGame());
		ab.run();
		
		ab.setHandSetSoft(new HandSetAddressList());
		ab.run();
		
		ab = new HandSetBrandM();
		ab.setHandSetSoft(new HandSetGame());
		ab.run();
		
		ab.setHandSetSoft(new HandSetAddressList());
		ab.run();
	}
}
