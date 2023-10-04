import java.io.*;
import java.util.*;
public class MyClass {


public static Boolean areEqual1(int arr1[] , int arr2[])
{
    if (arr1.length != arr2.length)
    {
        return false ; 
    }
    
    int n = arr1.length; 
    
    int count = 0 ; 
    Map <Integer , Integer > map =new HashMap <Integer , Integer > () ; 
    for (int i = 0 ; i < n - 1 ; i++) 
    {
        if (map.get(arr1[i]) == null)
        {
            map.put(arr1[i] , 1 ) ; 
        }
        else 
        {
            count = map.get(arr1[i]) ; 
            count++ ; 
            map.put(arr1[i] , count ) ; 
        }
    }
    
    
    for (int  i = 0 ; i< n -1 ; i++)
    {
        if (!map.containsKey(arr2[i]))
        {
            return false ; 
        }
        
        if (map.get(arr2[i]) == 0 )
        {
            return false; 
        }
        
        count =map.get(arr2[i]) ; 
        count--; 
        map.put(arr2[i] , count ); 
    }
    return true; 
}


public static Boolean areEqual2(int arr1 [] , int arr2[] )
{
    if (arr1.length != arr2.length )
    {
        return false ; 
    }
    
    int n = arr1.length; 
    
    Arrays.sort(arr1); 
    Arrays.sort(arr2); 
    
    for (int i = 0 ; i< n -1 ; i++)
    {
        if (arr1[i] != arr2[i])
        {
            return false; 
        }
        
    }
    return true; 
}



    public static void main(String args[]) {
      int arr1[] = { 3, 5, 2, 5, 2 };
      int arr2[] = { 2, 3, 5, 5, 2 };
      
      if (areEqual2(arr1 , arr2))
      {
          System.out.println("Yes"); 
      }
      else 
      {
          System.out.println("NO"); 
      }
 
    }
}