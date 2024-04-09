public class FoodTest {
    public static void main(String[] args) {
        Food[] foodArray = new Food[4];
        foodArray[0] = new Food();
        foodArray[0].SetId(1);
        foodArray[0].SetName("pizza");
        foodArray[0].SetPrice(12);
        foodArray[0].SetSize(11);
        foodArray[0].SetType("Seafood");
        foodArray[1] = new Food();
        foodArray[1].SetId(2);
        foodArray[1].SetName("pizza");
        foodArray[1].SetPrice(10);
        foodArray[1].SetSize(9);
        foodArray[1].SetType("Beef");
        foodArray[2] = new Food();
        foodArray[2].SetId(3);
        foodArray[2].SetName("fried rice");
        foodArray[2].SetPrice(12);
        foodArray[2].SetSize(5);
        foodArray[2].SetType("Seafood");
        foodArray[3] = new Food();
        foodArray[3].SetId(4);
        foodArray[3].SetName("noodles");
        foodArray[3].SetPrice(14);
        foodArray[3].SetSize(6);
        foodArray[3].SetType("Beef");
        for (int sequence = 0; sequence < 4; sequence++) {
            foodArray[sequence].getMenu();
        }
        FoodTwo newFood = new FoodTwo(1,"pizza","Seafood",11,12);
        System.out.println(newFood.typeMenu());
    }
}
