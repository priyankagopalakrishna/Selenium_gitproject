package practice;

import java.util.ArrayList;
import java.util.HashSet;

public class FirstRepeatingElement {

	public int find(int [] arrA){
		int index = -1;
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i = arrA.length-1;i>=0;i--){
			if(hs.contains(arrA[i])){
				index = i;
			}else{
				hs.add(arrA[i]);
			}
		}
		return arrA[index];
	}
	
	public static void main(String[] args) {

		int [] a = {1,5,2,7,5,3,10,2};
		FirstRepeatingElement f = new FirstRepeatingElement();
	//	System.out.println("{1,2,5,7,5,3,10,2}");
		System.out.println("First repeated number is : " + f.find(a));
	}
}
