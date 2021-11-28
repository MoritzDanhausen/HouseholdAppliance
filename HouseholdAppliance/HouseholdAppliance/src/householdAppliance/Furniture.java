package householdAppliance;

public class Furniture implements HouseholdItem{
	
	String name;
	String type;

	int length;
	int width;
	int height;
	
	int weight;
	
	public Furniture(String name, String type, int length, int width, int height, int weight) {
		this.name = name;
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	
//Getters and Setters
	public int getHeight() {
		return height;}

	public void setHeight(Integer height) {
		this.height = height;}

	public int getLength() {
		return length;}

	public void setLenght(Integer length) {
		this.length = length;}

	public int getWidth() {
		return width;	}

	public void setWidth(Integer width) {
		this.width = width;}

	public int getWeight() {
		return weight;}

	public void setWeight(Integer weight) {
		this.weight = weight;}

	public String getType() {
		return type;}

	public void setType(String type) {
		this.type = type;}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}
	
	
	public int calcMovingCost(int weight) {
		// TODO Auto-generated method stub
		int price = (this.weight/5)*20;
		return price;
	}
	
	public double calcArea(int height, int lenght, int width){
		// TODO Auto-generated method stub
		double area = 0;
		area = 2*height*lenght+2*height*width+2*lenght*width;
		return area;
	}
	
	public void accept(PackingVisitor pv) {
		pv.visit(this);
	}
	
	public void accept(MovingCostVisitor mvc) {
		mvc.visit(this);
	}
}