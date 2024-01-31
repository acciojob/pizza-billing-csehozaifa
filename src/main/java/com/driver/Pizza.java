package com.driver;

public class Pizza {
/*
    public int cheesePrice;
    public int basePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public String bill;
    public int totalPrice;
    boolean isCheeseAdded;
    //2 benefits of these variable
    //if prevent duplicate addition of the cheese if called multiple time
    //it also tells which all things have been added
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){

        // your code goes here
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        } else{
            //non veg case
            basePrice=400;
            toppingsPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;
        isCheeseAdded=false;
        isToppingsAdded=false;
        isPaperBagAdded=false;
        totalPrice=basePrice;
        bill="Base Price Of The Pizza: "+basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded) {
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded=true; //so to prevent it from adding again
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            totalPrice=totalPrice+toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice=totalPrice+paperBagPrice;
            isPaperBagAdded=true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill=bill+"Extra Cheese Added: "+cheesePrice + "\n";
            }
            if(isToppingsAdded){
                bill=bill+"Extra Toppings Added: "+toppingsPrice + "\n";
            }
            if(isPaperBagAdded){
                bill=bill+"Paperbag Added: "+paperBagPrice + "\n";
            }
            bill=bill+"Total Price:"+totalPrice + "\n";


            isBillGenerated=true;
        }
        return bill;
*/
public int cheesePrice;
    public int basePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public String bill;
    public int totalPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isPaperBagAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){

        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
        } else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        paperBagPrice = 20;
        cheesePrice = 80;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperBagAdded){
            totalPrice += paperBagPrice;
            isPaperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if(isToppingsAdded){
                bill = bill + "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(isPaperBagAdded){
                bill = bill + "Paperbag Added: " + paperBagPrice + "\n";
            }
            bill = bill + "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }
        return bill;
    }
}
