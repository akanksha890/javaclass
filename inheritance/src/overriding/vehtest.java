package overriding;

public class vehtest {
	public static void main(String[] args) {

	bike bi=new bike();
	System.out.println(bi.fuel());
	
	bus b=new bus();
	System.out.println(b.fuel());


}
}