package helloworld;

import java.util.*;

public class sortingstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<le> arr = new ArrayList<le>();

		arr.add(new le(12321, "python", "us"));
		arr.add(new le(12323, "java", "uk"));
		arr.add(new le(12324, "ds", "italy"));
		arr.add(new le(12323, "r", "us"));

		System.out.println("befor sorting");
		for (int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i));

		Collections.sort(arr.new List());
		System.out.println("after sorting");
		for (int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i));

	}

}

class le {
	int rollno;
	String coursen;
	String loc;

	public le(int rollno, String coursen, String loc) {
		this.rollno = rollno;
		this.coursen = coursen;
		this.loc = loc;
	}

	public String toString() {
		return this.rollno + " " + this.coursen + " " + this.loc;
	}

}

class Sortbyrollno implements Comparator<le> {
	public int compare(le a, le b) {
		return a.rollno - b.rollno;
	}
}
