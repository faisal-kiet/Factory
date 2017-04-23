
public class Factory {
	private Shape sh;
	
	public Shape getShape(String shape){
		if (shape.equals("Square")){
			sh=new Square();
		}
		else if (shape.equals("Square")){
			sh=new Circle();
		}
		else if (shape.equals("Square")){
			sh=new Triangle();
		}
		else{
			System.out.println("No shape found...");
		}
		return sh;
	}
}
