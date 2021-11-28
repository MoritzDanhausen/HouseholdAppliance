package householdAppliance;

class MovingCostVisitor implements Visitor {

	public MovingCostVisitor() {
		
	}
	
	public static void visit (Glass g) {
		System.out.println("Total Cost for "+g.name+ " is: "+g.calcMovingCost(g.thickness, g.length)+ " Euros");
	}

	public static void visit (Furniture f) {
		System.out.println("Total Cost for "+f.name+ " is: "+f.calcMovingCost(f.weight)+ " Euros");	
	}
	
	public static void visit (Electronic e) {
		System.out.println("Total Cost for "+e.name+ " is: "+e.calcMovingCost(e.weight, e.fragile)+ " Euros");
	}
}
