package org.pravakar;
import java.util.*;

class Names implements Comparable<Names>{
	private String name;
	
	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names obj) {
		// TODO Auto-generated method stub
		if(name.length() == obj.name.length()) {
			return 0;
		}else if(name.length() < obj.name.length()) {
			return -1;
		}else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}

public class foo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List names = new LinkedList<>();
		names.add(new Names("Pravakar"));
		names.add(new Names("Tony"));
		
		App app = new App();
		app.printList(names);
		
		Collections.sort(names);
		System.out.println("*************");
		app.printList(names);
	}
	
	void printList(List<Names> list) {
		for(Names str : list) {
			System.out.println(str);
		}
	}

}
