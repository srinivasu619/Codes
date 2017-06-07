package collection.Example;

import java.util.*;

public class CollectionExample1 {

	List<String> list=Arrays.asList("Ubuntu","Windows","Pearl","Mac OS X");
	public static void main(String[] args) {
		CollectionExample1 col=new CollectionExample1();
		col.list.forEach(System.out::println);
		col.list.sort((s1,s2)->s1.compareTo(s2));
		col.list.forEach(System.out::println);
		//col.list.removeIf(s->s.toLowerCase().contains("x"));
		// l1.removeIf(s-> s.toLowerCase().contains("x"));
		//col.list.forEach(System.out::println);
	}

}
