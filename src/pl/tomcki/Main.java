package pl.tomcki;

import java.util.ArrayList;
import java.util.List;

public class Main {
				public static void main(String[] args) {
								int[] integerTable = {2, 4, 6, 8, 10, 2, 6, 10};
								List<Integer> singleNumberIntegerList = new ArrayList<>();

								for (int i = 0; i <8; i++) {
												if(!singleNumberIntegerList.contains(integerTable[i])){
																singleNumberIntegerList.add(integerTable[i]);
												} else
												{
																singleNumberIntegerList.remove(integerTable[i]);
												}
								}
								System.out.println(singleNumberIntegerList);
				}
}
