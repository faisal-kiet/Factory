import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inp = sc.next();
		
		Factory f=new Factory();
		Shape shape = f.getShape(inp);
		shape.draw();
	}

}
