package lesson9classes;

import java.util.Arrays;

public class Arrayhelper {

	public static void printarr(int[] arr){
		//for(int i:arr)
			//System.out.println(i);
		   
		System.out.println(Arrays.toString(arr));  //2 ways to print arr
	}

	public static int[] creatarr(int size) {
		// TODO Auto-generated method stub
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+2;
			//System.out.println(arr[i]);  // check for self
		}
		return arr;
	}
	public static int[] powerarr(int[] arr) {
		int[] arr2=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			arr2[j]=arr[i]*arr[i];
			j++;
		}
		//for(int k:arr2)
		  //  System.out.println(k);;  //check for self
	    return arr2;
	}
}
