package householdAppliance;

class PackingVisitor implements Visitor {

	public PackingVisitor() {	
	}
	
	public void visit (Glass g) {
		System.out.println(g.name+ " should be packed in a box and filled with bubble wraps "
				+ "with a dimension of: "+g.height+"x"+g.length+"x"+g.width);
	}

	public void visit (Furniture f) {
		double area;
		area = 2*f.height*f.length+2*f.height*f.width+2*f.length*f.width;
		System.out.println(f.name+ " should be covered with waterproof covers with an area: "
				+ area+" cm2");	
	}
	
	public void visit (Electronic e) {
		System.out.println(e.name+ " should be covered with Polyethylene foam film and packed in "
				+ "a box with a dimension of: "+e.height+"x"+e.length+"x"+e.width);
	}
	
	
	public void getPacking(HouseholdItem h) {
		h.accept(this);
	}
}