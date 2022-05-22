package com.nasiatech.exercises.chapter1.reinforcement;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class R1Andrew {
    Scanner keyboard = new Scanner(System.in);

    public int addNumber(int a, int b){
        return a + b;
    }

    public void R1inputAllBase(){
        int intValue;
        char charValue;
        double doubleValue;
        long longValue;
        byte byteValue;

        System.out.println("Enter Integer Value: ");
        intValue = keyboard.nextInt();
        System.out.println("Integer value: "+intValue);

        System.out.println("Enter Character Value: ");
        charValue = keyboard.next().charAt(0);
        System.out.println("Integer value: "+charValue);

        System.out.println("Enter Byte Value: ");
        byteValue = keyboard.nextByte();
        System.out.println("Integer value: "+byteValue);

        System.out.println("Enter Double Value: ");
        doubleValue = keyboard.nextDouble();
        System.out.println("Integer value: "+doubleValue);

        System.out.println("Enter Long Value: ");
        longValue = keyboard.nextLong();
        System.out.println("Long value: "+longValue);

    }

    public boolean R3isMultiple(long m, long n){
        if(m == 0){
            return false;
        }
        return n % m == 0;
    }

    public boolean R4isEven(int value){
        boolean flag = false;
        for(int i = 0; i<=value; i++){
            flag = !flag;
        }
        return flag;
    }

    public int R5sumOfAll(int value){
        int sum = 0;
        for(int a = 0; a <= value; a++){
            sum = sum+a;
        }
        return sum;
    }

    public int R6sumOfAllOds(int value){
        int sum = 0;
        if(value <= 0){
            return 0;
        }
        for (int a = 1; a <= value; a++){
            if(!(a % 2 == 0)) {
                sum = sum + a;
            }
        }
        return sum;
    }

    public int R7sumOfSquares(int value){
        int sum = 0;
        if(value == 0){
            return 0;
        }
        for (int a = 0; a <= value; a++){
            sum = (sum + a * a);
        }
        return sum;
    }

    public int R8countVowels(String stringInput){
        int count = 0;
        int len  = stringInput.length();
        for (int i = 0; i< len; i++){
            char ch = stringInput.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public String R9_1removePuntuation(String stringIput){
        stringIput = stringIput.replaceAll("\\p{P}", "");
        return stringIput;
    }

    public StringBuilder R9removePunk(StringBuilder stringInput){
        int len = stringInput.length();
        for (int i = 0; i < len-1; i++){
            char ch = stringInput.charAt(i);
            if(ch == '!' || ch == ',' || ch == '.'){
                stringInput.deleteCharAt(i);
                len--;
            }
        }
        return stringInput;
    }

    public int[] swap(int x, int y){
        int tmp;
        tmp = x;
        x = y;
        y = tmp;

        return new int[]{x, y};
    }


        //    public static void main(String[] args){
        //        Flower f = new Flower("Rose", 12, 250);
        //        //f.setFlowername("Hibiscus");
        //        //f.setNumOfPetalss(12);
        //        //f.setPrize(250);
        //
        //        System.out.println(f.getFlowername());
        //        System.out.println(f.getNumOfPetalss());
        //        System.out.println(f.getPrize());
        //
        //}
}
    class Flower {

        private String flowername;
        private int numOfPetalss;
        private float prize;

        public Flower(String name, int numOfPetals, float price) {
            flowername = name;
            numOfPetalss = numOfPetals;
            prize = price;

        }


        public void setFlowername(String flowername) {
            this.flowername = flowername;
        }

        public String getFlowername() {
            return flowername;
        }

        public void setNumOfPetalss(int numOfPetalss) {
            this.numOfPetalss = numOfPetalss;
        }

        public int getNumOfPetalss() {
            return numOfPetalss;
        }


        public void setPrize(float prize) {
            this.prize = prize;
        }

        public float getPrize() {
            return prize;
        }
    }


    class CreditCard {

    // Instance variables
    private String customer;
    // name of the customer (e.g., ”John Bowman”)
    private String bank;
    // name of the bank (e.g., ”California Savings”)
    private String account;
    // account identifier (e.g., ”5391 0375 9387 5309”)
    private int limit;
    // credit limit (measured in dollars)
    protected double balance;

    // current balance (measured in dollars)
// Constructors:
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
    }

    // Accessor methods:
    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }// Update methods:

    public boolean charge(double price) {// make a charge
        if (price + balance > limit)
            // if charge would surpass limit
            return false;
        // refuse the charge
        // at this point, the charge is successful
        balance += price; // update the balance
        return true; // announce the good news

    }

    public double makePayment(double amount) { // make a payment
        if (amount > 0){
            balance -=  amount;
        }
        else{
            System.exit(0);
        }
        return balance;
    }
    public int updateCardLimit(int amount){
        limit = limit + amount;
        return limit;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit);// implicit case
    }

//    public static void main(String[] args){
//        CreditCard card = new CreditCard("Andrew","UBA","Savings",100,10000);
//        card.updateCardLimit(400);
//        System.out.println(card.limit);
//    }
}

