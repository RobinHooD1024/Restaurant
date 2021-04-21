package takeout;

import static takeout.utils.PrintUtil.*;

public class Menu {

    final MainDish _beef = new MainDish("Beef", 13.0);
    final MainDish _pork = new MainDish("Pork", 18.0);
    final MainDish _steak = new MainDish("Steak", 20.0);
    final MainDish _fish = new MainDish("Fish", 9.0);

    MainDish[] mainDishes = new MainDish[] {_beef, _pork, _steak, _fish};

    Side rice = new Side("Brown Rice", 2.99);
    Side asparagus = new Side("Oven-Roasted Asparagus", 4.50);
    Side beans = new Side("Green Beans Amandine", 5.00);
    Side potato = new Side("Creamy Mashed Potatoes", 4.00);

    Drink water = new Drink("Perrier® carbonated mineral water", 3.50);
    Drink wineWhite = new Drink("Oaked Chardonnay", 20.50);
    Drink wineRed =  new Drink("Château Corton Grancey Grand Cru", 40.00);
    Drink juiceApple = new Drink("Fresh squeezed Apple juice", 10.00);

    Drink[] drinks = new Drink[] {water, wineRed, wineWhite, juiceApple};
    Side[] sides = new Side[] {rice, asparagus, beans, potato};



    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesNames[i] = mainDishes[i].getName();
        }
        return mainDishesNames;
    }



    public double[] getMainDishesPrice() {
        double[] mainDishesPrices = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i++) {
            mainDishesPrices[i] = mainDishes[i].getPrice();
        }
        return mainDishesPrices;
    }

    public String[] getDrinkNames() {
        String[] drinksDishesNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinksDishesNames[i] = drinks[i].getName();
        }
        return drinksDishesNames;
    }

    public double[] getDrinkPrice() {
        double[] drinksDishesNames = new double[drinks.length];
        for (int i = 0; i < drinks.length; i++) {
            drinksDishesNames[i] = drinks[i].getPrice();
        }
        return drinksDishesNames;
    }

    public String[] getSidesNames() {
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i++) {
            sidesNames[i] = sides[i].getName();
        }
        return sidesNames;
    }

    public double[] getSidesPrice() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i++) {
            sidesPrices[i] = sides[i].getPrice();
        }
        return sidesPrices;
    }

    String[] mainDishesNames = getMainDishesNames();
    double[] mainDishesPrices = getMainDishesPrice();

    private void printMainDishes() {
        printMainDishesTitle();
        for (int i = 0; i < mainDishesNames.length; i++) {
            print(mainDishesNames[i]);
            printSpaces(mainDishesNames[i]);
            printPrice(mainDishesPrices[i]);
            println();

        }
    }

    private void printSides() {
        printSidesTitle();
        for (int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpaces(getSidesNames()[i]);
            printPrice(getSidesPrice()[i]);
            println();

        }
    }

    private void printDrinks() {
        printDrinksTitle();
        for (int i = 0; i < getDrinkNames().length; i++) {
            print(getDrinkNames()[i]);
            printSpaces(getDrinkNames()[i]);
            printPrice(getDrinkPrice()[i]);
            println();

        }
    }

    public void printMenu() {
        printMenuTitle();
        printMainDishes();
        printLine();
        println();
        printSides();
        printLine();
        println();
        printDrinks();
        printLine();
        println();
    }



}
