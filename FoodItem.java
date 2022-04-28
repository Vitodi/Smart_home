public class FoodItem {
    String name;
    int qty;
    int speedEating;
    public FoodItem(String name, int qty, int speedEating){
        this.name = name;
        this.qty=qty;
        this.speedEating = speedEating;
        foods[0]=milk;
    }
    FoodItem [] foods = new FoodItem[10];
    FoodItem milk = new FoodItem("milk",1,10);
    FoodItem egg = new FoodItem("egg", 10,25);
    //FoodItem bread = new FoodItem();


    public void makeFood(){
        foods[0] = milk;
        foods[1]=egg;
    }

}
