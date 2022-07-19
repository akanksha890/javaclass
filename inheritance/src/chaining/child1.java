package chaining;

public class child1 extends parent1 {

	child1(){
		System.out.println("child constructor: no args");
	}
	child1(int x){
		super(x);
		System.out.println("child cont: one arg");
	}
}
