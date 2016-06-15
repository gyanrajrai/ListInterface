package kist;

import java.util.ArrayList;                                                                                                        
import java.util.Iterator;                                                                                                         
import java.util.List;   

public class ListApplication {

	public static void main(String[] args) {
		   //declare a list to store(add) name of the countries                                                                       
        
        
        //insert below elements in the list                                                                                        
        //United States                                                                                                            
        //India                                                                                                                    
        //Nepal                                                                                                                    
        //China                                                                                                                    
        //Russia                                                                                                                   
        //Mongolia                                                                                                               
		                                                                                                                           
		List<String>mylist=new ArrayList<String>();                                                                                
		mylist.add("United States");                                                                                               
		mylist.add("India");                                                                                                       
		mylist.add("Nepal");                                                                                                       
		mylist.add("China");                                                                                                       
		mylist.add("Russia");                                                                                                     
		mylist.add("Mongolia");                                                                                                    
		                                                                                                                           
		 //run an enhanced for loop to print the values from the list                                                              
		for(String str:mylist){                                                                                                    
			System.out.println(str);                                                                                               
		}                                                                                                                          
		 //extract value Russia from the list, assign it to a variable                                                             
		   //and print that variable                                                                                               
		String value=mylist.get(4);                                                                                        
		System.out.println(value+  "   Russia");                                                                                   
		                                                                                                                           
		//to extract Russia from List                                                                                              
		for(String values:mylist){                                                                                                 
			if(values.equals("Russia")){                                                                                           
				System.out.println(values); 
			}
		}
				                                                                                                                   
				//check and see if Portugal is in your list, if not, add that to your list                                         
	            //use contains() function                                                                                          
				                                                                                                                   
	               if(!mylist.contains("portugal")){
	            	   mylist.add("portugal");
	               }
	            	   
	               
				                                                                                                                   
				//print the list by passing list to println()                                                                      
		                                                                                                                           
				                                                                                                                   
				System.out.println(mylist);                                                                                        
				                                                                                                                   
				//try removing United States from the list                                                                         
				mylist.remove("United States");                                                                                    
			                                                                                        
				                                                                                                                   
				//use Iterator interface to loop through the list and print all values                                             
				//System.out.println("after Iteration interface to loop");                                                           
                                                                                                                                   
				Iterator<String> itr=mylist.iterator();                                                                                
				while(itr.hasNext()){                                                                                              
					String obj=itr.next();                                                                                         
					System.out.println(obj);                                                                                       
					                                                                                                               
					                                                                                                               
				}                                                                                                                  
				                                                                                                                   
		           //Learn how to use Iterator in For loop??                                                                       
				/*System.out.println("after Iteration in for loop");                                                                 
				for(int i=0;i<mylist.size();i++){                                                                                  
					System.out.println(i);                                                                                         
				} */                                                                                                                 
				                                                                                                                   
				 /*Research what a 'ConcurrentModificationException' is and how it can be avioded..                                
				ans:=> This exception may be thrown by methods that have detected concurrent modification                          
				 of an object when such modification is not permissible.For example,                                               
				  it is not generally permissible for one thread to modify                                                         
				  a Collection while another thread is iterating over it.                                                          
				                                                                                                                   
				  Avidnace in multi-threaded environment :=>1=>You can convert the list to an array and then iterate on the array. 
				  				This approach works well for small or medium size list but                                         
				  				if the list is large then it will affect the performance a lot.                                    
				  			`2=>You can lock the list while iterating by putting it in a synchronized block.                       
				  			 	This approach is not recommended because it will cease the benefits of multithreading              
				  			 	3=>If you are using JDK1.5 or higher then you can use ConcurrentHashMap and CopyOnWriteArrayList   
				  			 	``classes. This is the recommended approach to avoid concurrent modification exception.            
				  Avoidance in  single-threaded environment:                                                                       
				  1=>Concurrent Collection classes can be modified safely, they will not throw ConcurrentModificationException.    
				  2=>In case of CopyOnWriteArrayList, iterator doesn’t accommodate the changes in the list and works on            
						the original list.                                                                                         
				3=>                                                                                                                
                                                                                                                                   
*/                                                                                                                                 
				                                                                                                                   
				                                                                                                                   
			}                                                                                                                      
				                                                                                                                   
		}                                                                

	


