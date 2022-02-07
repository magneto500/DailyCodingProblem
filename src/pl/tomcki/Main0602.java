package pl.tomcki;

/*
06.02
Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice,
find the two elements that appear only once.
For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8.
The order does not matter.
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main0602 {
				public static void main(String[] args) {



								Integer[] integerTable = {2, 4, 6, 8, 10, 2, 6, 10};
								List<Integer> integerList = Arrays.asList(integerTable);
								List<Integer> singleNumberIntegerList = new ArrayList<>();
								for (int i = 0; i <8; i++) {
												if(!singleNumberIntegerList.contains(integerList.get(i))){
																singleNumberIntegerList.add(integerList.get(i));
												} else
												{
																singleNumberIntegerList.remove(integerList.get(i));
												}
								}
								System.out.println(Arrays.toString(integerList.toArray()));
								System.out.println(singleNumberIntegerList);
				}
}
