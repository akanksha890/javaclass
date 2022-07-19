package superkeyword;

public class child extends parent{

	int c,d;
	child(){
		
	}
	
	child(int c,int d){
		this.c=c;
		this.d=d;
	}
	
	child(int a,int b,int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void display() {
		System.out.println("parent a= "+a);
		System.out.println("parent b= "+b);
		System.out.println("child c= "+c);
		System.out.println("child d= "+d);

		
		
	}
}
