package composite1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();
	
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		String str = "";
		for(int i = 0; i < depth; i++){
			str += "-";
		}
		System.out.println(str + name);
		
		for (Company company : children) {
			company.display(depth + 2);
		}
	}

	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for (Company company : children) {
			company.lineOfDuty();
		}
	}

}
