public class day11 {
public static void main(String[] args) {
		LinkedList<Integer>a=new LinkedList<Integer>();
		a.add(10);
		a.add(8);
		a.add(3);
		a.add(7);
		a.add(1);
		a.add(8);
		a.add(13);
		a.add(9);
		
		System.out.println(a);  
	
		Collections.sort(a);  // this is use the arrange in the accending order
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());   // this is used to arrange in the desecending order
		System.out.println(a);
		System.out.println(a.reversed());         // this is used to print the orginal value in the reseverse order
		
	
}}
