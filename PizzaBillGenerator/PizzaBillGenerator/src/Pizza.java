public class Pizza {
    private int price;
    private Boolean veg;
    private int extraToppingsAdded = 200;
    private int extrachesseAdded = 100;
    private int backPack = 20;
    private int basedPizzaPrice;
    private boolean isExtraCheeseAdded= false;
    private boolean isExtraToppingsAdded =false;
    private boolean isOptedForTakeaway=false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else{
            this.price = 400;
        }
        basedPizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;

        this.price+= extrachesseAdded;
    }


    public void addExtraToppings(){
        isExtraToppingsAdded = true;

        this.price += extraToppingsAdded;
    }

    public void takeAway(){
        isOptedForTakeaway =true;
        //System.out.println("takeaway ready to go");
        this.price += backPack;
    }

    public void getBill(){
        String  bill = "";
        System.out.println("Pizza: "+basedPizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added :"+extrachesseAdded+ "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings added :"+extraToppingsAdded+ "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Take Away added :"+backPack+ "\n";
        }
        bill+= "Bill : "+this.price + "\n";
        System.out.println(bill);
    }
}
