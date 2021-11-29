package householdAppliance;

public interface Visitor {

	public void visit (Glass g);
	public void visit (Furniture f);
	public void visit (Electronic e);

}