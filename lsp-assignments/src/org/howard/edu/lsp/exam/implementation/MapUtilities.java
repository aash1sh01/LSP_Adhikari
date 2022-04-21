package org.howard.edu.lsp.exam.implementation;
import java.util.*;

public class MapUtilities {
	public static int commonKeyValuePairs(
	        HashMap<String, String> map1,
	        HashMap<String, String> map2)throws NullMapException {
			Integer Counter=0;
			if (map1==null || map2==null) {
				throw new NullMapException("One or both maps are null!!");	
			}
			Integer a=map1.size();
	        Integer b= map2.size();
	        Boolean map1Flag=false;
	        Boolean map2Flag=false;
	        if (a==0 || b == 0){
	          return Counter;
	        }
	        if (a>b){
	          map2Flag=true;
	        }
	        else {
	          map1Flag=true;
	        }
	        if (map1Flag==true){
	          for (String key : map1.keySet()) {
	            if (map1.get(key)==map2.get(key)){
	              Counter+=1;
	            }}}
	        if (map2Flag==true){
	          for (String key1 : map1.keySet()) {
	            if (map2.get(key1)==map1.get(key1)){
	              Counter+=1;
	            }
	      }
	        }
	         return Counter;
	    }


}
