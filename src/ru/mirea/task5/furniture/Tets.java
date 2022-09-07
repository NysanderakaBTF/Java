package ru.mirea.task5.furniture;

import java.util.Scanner;

public class Tets {
    public static void main(String[] args){
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("1 - Add to cart\n2 - Remove from cart\n3 -  Clear cart\n4 - Pay\n5 - Show cart\n" +
                "6 - Show balance\n7- Add money\n8 - Show catalogue\n9 - Leave shop");
        while (true) {
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    shop.addToCart();
                    break;
                case 2:
                    shop.removeFromCart();
                    break;
                case 3:
                    shop.clearCart();
                    break;
                case 4:
                    shop.pay();
                    break;
                case 5:
                    shop.showCart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    int m;
                    System.out.println("Add money:");
                    m = in.nextInt();
                    shop.addMoney(m);
                    break;
                case 8:
                    shop.showCatalogue();
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }
}

