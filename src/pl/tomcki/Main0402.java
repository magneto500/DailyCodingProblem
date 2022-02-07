package pl.tomcki;
/*
Find the minimum number of coins required to make n cents.
You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
*/


public class Main0402 {


				public static void main(String[] args) {
								int price = 47;
								int coin1 = 1;
								int coin5 = 5;
								int coin10 = 10;
								int coin25 = 25;
								int counter25 = 0;
								int counter10 = 0;
								int counter5 = 0;
								int counter1 = 0;


								while (counter25 * coin25 <= price) {
												counter25 = counter25 + 1;
								}
								int resultAfter25 = price - (counter25 - 1) * coin25;
								System.out.println("We need " + (counter25 - 1) + " coins 25¢");


								while (counter10 * coin10 <= resultAfter25) {
												counter10 = counter10 + 1;
								}
								int resultAfter10 = resultAfter25 - (counter10 - 1) * coin10;
								System.out.println("We need " + (counter10 - 1) + " coins 10¢");


								while (counter5 * coin5 <= resultAfter10) {
												counter5 = counter5 + 1;
								}
								int resultAfter5 = resultAfter10 - (counter5 - 1) * coin5;
								System.out.println("We need " + (counter5 - 1) + " coins 5¢");


								while (counter1 * coin1 <= resultAfter5) {
												counter1 = counter1 + 1;
								}
								System.out.println("We need " + (counter1 - 1) + " coins 1¢");
								System.out.println("");
								System.out.println("Purchase price is " + price +"¢, so we need to spent " + (counter1 + counter5 + counter10 + counter25 - 4) + " coins.");

				}
}