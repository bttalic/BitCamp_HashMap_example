import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;


public class MulitpleValueMap {
	
	public static int hash(int number){
		return (number / 10);
	}
	public static void main(String[] args) {
		
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		Set<Integer> keys = map.keySet();
		Random rand = new Random();
		
		for(int i = 0; i < 100; i ++){
			int value = rand.nextInt(100);
			while( value >= 80 && value < 90){
				value = rand.nextInt(100);
			}
			int key = hash(value);
			
			System.out.println("I: " + i + " Key: " + key + " Value: " + value);
			if( keys.contains(key) ){
				map.get(key).add(value);
			} else {
				map.put(key, new LinkedList<Integer>());
				map.get(key).push(value);
			}
		}
		map.get(7).add(71);
		Iterator<Integer> keyIterator = keys.iterator();
		while( keyIterator.hasNext() ){
			int key = keyIterator.next();
			Iterator<Integer> valueIterator = map.get(key).iterator();
			System.out.println("Key: " + key);
			while(valueIterator.hasNext()){
				System.out.print( valueIterator.next() + " " );
			}
			System.out.println();
		}

	}
	

}
