package householdAppliance;

public class Glass implements HouseholdItem{
	
	String name;
	int length;
	int width;
	int height;

	int thickness;

	public Glass(String name, int length, int width, int height, int thickness) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.height = height;
		this.thickness = thickness;	
	}

	
//Getters and Setters =
	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLength() {
		return length;}

	public void setLength(int length) {
		this.length = length;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getThickness() {
		return thickness;}

	public void setThickness(int thickness) {
		this.thickness = thickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double calcMovingCost(int thickness, int length) {
		// TODO Auto-generated method stub
		double price = 0;
		if (this.thickness == 1) {
			price = 2*this.length;
		}else if (this.thickness == 2) {
			price = 1.2*this.length;
		}else {
			price = 0.7*this.length;
		}
		return price;
	}
	
	public void accept(PackingVisitor pv) {
		pv.visit(this);
	}
	
	public void accept(MovingCostVisitor mvc) {
		mvc.visit(this);
	}
}
