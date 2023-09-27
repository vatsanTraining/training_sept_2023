package com.examples.services;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class NameService {


	public boolean checkEligibility(int age) {

//		Predicate<Integer> check = new Predicate<Integer>() {
		//
//				@Override
//				public boolean test(Integer t) {
//					return t>18;
//				}
//				
//			};

		// Line Number 18 and Lines 8 to 15 are identical
				
		Predicate<Integer>  check =(arg)->  arg>18;
		
		return check.test(age);
		
		
		
	}
	
	public static void main(String[] args) {
		
		NameService service =new NameService();
		
		System.out.println("Is Eligibile :=>"+service.checkEligibility(15));
		
		List<String> nameList = Arrays.asList("Ramesh","Suresh","Magesh","Ganesh");
		
		List<Integer> markList = Arrays.asList(55,67,78,90);
		
		List<Integer> phoneList = Arrays.asList(108,100,101,103);

   
		Consumer<Integer> consumer = (e) ->  System.out.println(e);
		
		
		phoneList.forEach(consumer);
		
		nameList.forEach(e -> System.out.println(e.toUpperCase()));
		
		markList.forEach(System.out::println);
		
		
		Function<String, Integer> findLength=(arg)-> arg.length();
		
		System.out.println("Length:=>"+findLength.apply("Hello World"));
		
		
		Comparator<Integer> comp =(o1,o2) -> {
			 if(o1>o2) return -1;
		     if(o1<o2) return 1;
		     return 0;
		};
		
		
		System.out.println(comp.compare(45, 45));
	}
}
