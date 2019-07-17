package basic;

public class ConcreteIteratorDesc extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;
	public ConcreteIteratorDesc(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
		current = aggregate.getCount() - 1;
	}
	
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.getObject(aggregate.getCount() - 1);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object recent = null;
		current--;
		if(current >= 0){
			recent = aggregate.getObject(current);
		}
		return recent;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current < 0 ? true : false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
