package basic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	public int getCount(){
		return items.size();
	}
	
	public Object getObject(int index){
		return items.get(index);
	}
	
	public void setObject(int index, String value){
		items.add(index, value);
	}
}
