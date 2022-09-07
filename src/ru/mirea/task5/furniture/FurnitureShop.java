package ru.mirea.task5.furniture;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private Furniture ach = new Armchair("blue", "oak","big");
    private Furniture tab = new Table("white", "fir","small");
    private Furniture ward = new Wardrobe("red","osb",3 );
    private Furniture tab2 = new Table("brown","red wood","big" );
    private ArrayList<Furniture> cart;
    private int sum;
    private int money;
    public FurnitureShop(){
        sum=0;
        money=0;
        cart = new ArrayList<Furniture>(0);
    }
    public void showCatalogue(){
        System.out.println(ach);
        System.out.println("Table 1 "+tab);
        System.out.println(ward);
        System.out.println("Table 2 "+tab2);
    }
    public void getBalance()
    {
        System.out.println("Balance: " +money);
    }

    public void addMoney(int money)
    {
        this.money += money;
        System.out.println("Balance: " +this.money);
    }

    public void addToCart()
    {
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter choise:\n1 - Wardrobe\n2 - Armchair\n3 - Table1\n4 - Table2");
        ch=in.nextInt();
        switch (ch){
            case 1:
                cart.add(ward);
                break;
            case 2:
                cart.add(ach);
                break;
            case 3:
                cart.add(tab);
                break;
            case 4:
                cart.add(tab2);
                break;
        }
        System.out.println("Successfully added");
    }
    public void clearCart(){
        cart.clear();
    }
    public void removeFromCart(){
        showCart();
        int ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter what to delete: ");
        ch=in.nextInt();
        cart.remove(ch-1);
    }
    public void showCart()
    {
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i+1)+" "+cart.get(i)+" cost: "+cart.get(i).cost);
        }
    }

    public void pay()
    {
        if (money >= sum)
        {
            money -=sum;
            System.out.println("You bought: ");
            showCart();
            sum=0;
            cart.clear();
        }
        else
        {
            System.out.println("Total: " +sum+ ". Not enough money.");
        }
    }
}
