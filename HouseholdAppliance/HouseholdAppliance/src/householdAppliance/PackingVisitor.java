package householdAppliance;

class PackingVisitor implements Visitor {

	public PackingVisitor() {
		
	}
	
	public static void visit (Glass g) {
		System.out.println(g.name+ " should be packed in a box and filled with bubble wraps "
				+ "with a dimension of: "+g.height+"x"+g.length+"x"+g.width);
	}

	public static void visit (Furniture f) {
		System.out.println(f.name+ " should be covered with waterproof covers with an area: "
				+ f.calcArea(f.height, f.length, f.width)+" cm2");	
	}

	public static void visit (Electronic e) {
		System.out.println(e.name+ " should be covered with Polyethylene foam film and packed in "
				+ "a box with a dimension of: "+e.height+"x"+e.length+"x"+e.width);
	}
}