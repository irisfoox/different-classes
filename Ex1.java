package lesson9classes;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		//int[] array = Arrayhelper.creatarr(size);     1 way to do it
		//Arrayhelper.printarr(array);
		//Arrayhelper.printarr(Arrayhelper.powerarr(array));
	    Arrayhelper arrhelper=new Arrayhelper();
	    arrhelper.printarr(arrhelper.powerarr(arrhelper.creatarr(size)));  //the best way to do it
	}

}
