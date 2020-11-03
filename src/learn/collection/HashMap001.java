package learn.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap001 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		
		HashMap<Character, Integer> data1=new HashMap<Character, Integer>();
		
		// Object put(Object key, Object value): It is used to insert a particular mapping of key-value pair into a map.
		
		data1.put('a', 1);
		data1.put('b', 2);
		data1.put('c', 3);
		data1.put('d', 4);
		data1.put('e', 5);
		data1.put('f', 6);
		data1.put('g', 7);
		data1.put('h', 8);
		
		//1. Print data in set form in one line
		System.out.println("Full data set of Hashmap object is : "+data1);
		
		//2. Print desired Key, Value based on key
		System.out.println("Value where key is 'c' is : "+data1.get('c'));
		
		// int size(): It is used to return the size of a map.
		System.out.println("Size of Hashmap Object is : "+data1.size());
		
		//4. Check if a key is present and if present, print value
		
		if(data1.containsKey('e')) 
		{
			Integer i=data1.get('e');
			System.out.println("Yes it contains key, value is : "+i);
		}
		
		// Traversal of HashMap
		
		System.out.println("Here is the traversal data of Hashmap Object:");
		for(Map.Entry<Character,Integer> data: data1.entrySet())
		{
			System.out.println(data.getKey()+"    "+data.getValue());
		}
		
		
		// To check clear(): it will clear all Key,Value from object
		/*
		* data1.clear();
		* System.out.println("Full data set of Hashmap object is : "+data1);
		*/
		
		
		// containsKey() : Used to return True if for a specified key, mapping is present in the map.
		
		System.out.println(data1.containsKey('d'));
		
		// containsValue() : Used to return True if for a specified value, mapping is present in the map.
		
		System.out.println(data1.containsValue(7));
		
		// clone() : It is used to return a shallow copy of the mentioned hash map.
		
		@SuppressWarnings("unchecked")
		Map<Character,Integer> data2=(Map<Character, Integer>) data1.clone();
		System.out.println("Data2 key, value after cloning data1 to data2 :  "+data2);
		
		Object data3=data1.clone();
		System.out.println("Data2 key, value after cloning data1 to data2 :  "+data3);
		
		// isEmpty() : Used to check whether the map is empty or not. Returns true if the map is empty.
		data2.clear();
		if(data1.isEmpty())
		{
			System.out.println("Object of Hashmap data1 is empty...!");
		}
		else
		{
			System.out.println("Object of Hashmap data1 is not empty...!");
		}
		
		if(data2.isEmpty())
		{
			System.out.println("Object of Hashmap data2 is empty...!");
		}
		else
		{
			System.out.println("Object of Hashmap data2 is not empty...!");
		}
		
		
		// entrySet(): It is used to return a set view of the hash map.
		Set<Entry<Character, Integer>> setdata =data1.entrySet();
		System.out.println("Value of Entry Set is :"+ setdata);
		
		// Object get(Object key): It is used to retrieve or fetch the value mapped by a particular key.
		
		System.out.println(data1.get('a'));
		
		// Set keySet(): It is used to return a set view of the keys.
		
		Set<Character> charSet=data1.keySet();
		System.out.println("Set of key id data1 object of HashMap is : "+charSet);
		
		// putAll(Map M): It is used to copy all of the elements from one map into another.
		
		HashMap<Character, Integer> anotherData=new HashMap<Character,Integer>();
		anotherData.put('x', 24);
		anotherData.put('y', 25);
		anotherData.put('z', 26);
		
		data1.putAll(anotherData);
		System.out.println("After merging anotherData to data1 is : "+ data1);
		
		// Object remove(Object key): It is used to remove the values for any particular key in the Map
		
		data1.remove('h');
		System.out.println("After removing 'h' values from data1 is : "+ data1);
		
		// Collection values(): It is used to return a Collection view of the values in the HashMap.
		
		Collection<Integer> colValues=data1.values();
		System.out.println("values collection of data1 object is : "+ colValues);
		
		
		// compute(K key, BiFunction<K, V> remappingFunction): This method Attempts to compute a mapping for 
		// the specified key and its current mapped value (or null if there is no current mapping).
		
				
		Integer i=data1.compute('a', (Character,Integer)-> Integer.SIZE);
		System.out.println(i);
		
		
		HashMap<String,String> ukp=new HashMap<String, String>();
		
		ukp.put("Name", "Umakant");
		ukp.put("address","Basti");
		ukp.put("profile", "QA");
		
		ukp.compute("Name", (String1,String2)->String2.concat(" Pandey"));
		ukp.compute("address", (k,v)->v.concat(" , Basti"));
		ukp.compute("profile", (k,v)->v.concat("/Test analyst/Software tester"));
		
		System.out.println("After updating the ukp object is : "+ukp);
		
		
		// creating new Hashmap for finding max value in object
		HashMap<Character,Integer> d=new HashMap<Character,Integer>();
		d.put('a', 5);
		d.put('b', 8);
		d.put('c', 13);
		d.put('d', 9);
		
		Collection<Integer> intval=d.values();
		
		Object[] a=intval.toArray();
		int len=a.length;
		int max=0;
		
		for(int i1=0;i1<len;i1++)
		{
			max=(int) a[i1];
			for(int j=i1+1;j<len;j++)
			{
				if(max<(int)a[j])
				{
					max=(int)a[j];
					
				}
			}
		}
		System.out.println(max);
		
		
		
//		Iterator<Integer> i2=intval.iterator();
//		int max=0;
//		while(i2.hasNext())
//		{
//			if(max<i2.next())
//			{
//				max=i2.next();
//			}
//		}
//		System.out.println(max);
		
		
		
		
		
	}

}
