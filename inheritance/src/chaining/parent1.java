package chaining;

public class parent1 {

	int x;
	parent1(){
		this(25);
		System.out.println("parent constructor: no args");
		
	}
	parent1(int x){
		this.x=x;
		System.out.println("parent constructor: one args");
	}
}
