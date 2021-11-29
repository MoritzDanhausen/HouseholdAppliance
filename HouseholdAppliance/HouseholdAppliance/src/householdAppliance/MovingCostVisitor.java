package householdAppliance;

class MovingCostVisitor implements Visitor {

	public MovingCostVisitor() {
	}
	
	public void visit (Glass g) {
		double price;
		if (g.thickness == 1) {
			price = 2*g.length;
		}else if (g.thickness == 2) {
			price = 1.2*g.length;
		}else {
			price = 0.7*g.length;
		}
		System.out.println("Total Cost for "+g.name+ " is: "+price+ " Euros");
	}

	public void visit (Furniture f) {
		double price = (f.weight/20)*5;
		System.out.println("Total Cost for "+f.name+ " is: "+price+ " Euros");	
	}
	
	public void visit (Electronic e) {
		double price;
		if (e.fragile == true) {
			price = (e.weight/10)*5;
		}else{
			price =(e.weight/15)*5;
		}
		System.out.println("Total Cost for "+e.name+ " is: "+price+ " Euros");
	}
	
	public void getCost(HouseholdItem h) {
		h.accept(this);
	}
}