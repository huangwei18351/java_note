package basic;

public class ConcreteIterator extends Iterator{
	private ConcreteAggregate aggregate;
	private int current = 0;
	public ConcreteIterator(ConcreteAggregate aggregate, int current) {
		this.aggregate = aggregate;
	}
	public ConcreteIterator(ConcreteAggregate aggregate) {
		// TODO Auto-generated constructor stub
		this.aggregate = aggregate;
	}
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.getObject(0);
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object recent = null;
		current++;
		if(current < aggregate.getCount()){
			recent = aggregate.getObject(current);
		}
		return recent;
	}
	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current >= aggregate.getCount() ? true : false;
	}
	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.getObject(current);
	}
	
	
	
}
