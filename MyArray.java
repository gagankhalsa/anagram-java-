import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyArray {
	 

	    public static void main(String[] args) {
	        
	        Scanner scan=new Scanner(System.in);
	        String str=scan.next();
	        String str2=scan.next();
	        char[] characters  = str.toCharArray();
	        char[] characters1  = str2.toCharArray();
	        boolean g;
	        if(characters.length!=characters1.length)
	        {
	        	//retun false;
	        }
	           Map<Character,Integer> charmap= new TreeMap<Character,Integer>();
	             for(Character ch:characters)
	           {
	        	   if(charmap.containsKey(ch))
	        	   {
	        		   charmap.put(ch,charmap.get(ch)+1);
	        	   }
	        	   else
	        	   {
	        		   charmap.put(ch,1);
	        	   }
	           }
	           
	           Set<Map.Entry<Character,Integer>> entryset = charmap.entrySet();
	           for(Map.Entry<Character,Integer> entry:entryset)
	        	   
	           {
	        	   System.out.println(entry.getKey()+" "+entry.getValue());
	        	   //System.out.println( "mmmmmmmmmmmmmmmmmmmm");
	           }
	           
	           //string2
	           Map<Character,Integer> charmap1= new TreeMap<Character,Integer>();
	             for(Character ch:characters1)
	           {
	        	   if(charmap1.containsKey(ch))
	        	   {
	        		   charmap1.put(ch,charmap1.get(ch)+1);
	        	   }
	        	   else
	        	   {
	        		   charmap1.put(ch,1);
	        	   }
	           }
	             System.out.println("========================");
	           Set<Map.Entry<Character,Integer>> entryset1 = charmap1.entrySet();
	           String nav = "gaganjot";
	           String jot = "jotgagan";
	           if(nav.equals(jot))
	           {
	        	   System.out.println("yes");
	        	   System.out.println(jot);
	        	   
	           }
	           else
	           {
	        	   System.out.println("no");
	           }
	           for(Map.Entry<Character,Integer> entry:entryset1)
	        	   
	           {
	        	   System.out.println(entry.getKey()+" "+entry.getValue());
	           }
	           
	            if(charmap.equals(charmap1))
	            {
	            	//System.out.println(charmap1.size() + " "+charmap.size());
	            	List<Integer> v = new ArrayList<Integer>(charmap1.values());
	            	List<Integer> v1 = new ArrayList<Integer>(charmap.values());
	            	System.out.print(v);
	            	System.out.println(v1);
	            	if(v.containsAll(v1))
	            	{
	            		g=true;
	            		System.out.println("Anagram");
	            	}
                   	            }
	            else
	            {
	            	g=false;
	            	System.out.println("not an anagram");
	            }
	        
	        //SortedSet<String> sets=new TreeSet<String>();
	       // System.out.println(str.compareToIgnoreCase(str2));
	      //  System.out.println(sets.first());
	      //  System.out.println(sets.last());
	    }
	      
	        
	    }
