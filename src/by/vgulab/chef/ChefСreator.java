//package by.vgulab.chef;
//
//import by.vgulab.food.Vegetable;
//
//import java.lang.reflect.Constructor;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ChefСreator {
//    private String name;
//    private Salad salad;
//
//    public ChefСreator() {
//        this.name = "Маэстро";
//        this.salad = new Salad();
//    }
//
//    public ChefСreator(Salad salad) {
//        this.name = "Маэстро";
//        this.salad = salad;
//    }
//
//    public ChefСreator(String name, Salad salad) {
//        this.name = name;
//        this.salad = salad;
//    }
//
//
//    public void showRangeCalories(Scanner scanner) {
//        double lower;
//        double upper;
//
//        System.out.println(" Укажите минимальный уровень калорий ");
//        try {
//            lower = scanner.nextDouble();
//        } catch (InputMismatchException e) {
//            scanner.nextLine();
//            return;
//        }
//        System.out.println(" Укажите максимальный уровень калорий ");
//        try {
//            upper = scanner.nextDouble();
//            if (upper <= lower) {
//                System.out.println(" максисум не может быть меньше миниума ");
//                scanner.nextLine();
//            }
//        } catch (InputMismatchException e) {
//            scanner.nextLine();
//            return;
//        }
//        salad.rangeCalories(lower, upper);
//    }
//
//    public Vegetable getIngredient(Scanner scanner) {
//        String ingredient = "";
//        double weight = 0.0;
//        try {
//            ingredient = scanner.nextLine();
//            System.out.println("Укажите название ингредиента ");
//        } catch (InputMismatchException e) {
//            System.out.println("Не верно!");
//            scanner.next();
//        }
//
//        System.out.println("Укажите вес в граммах");
//        try {
//            weight = scanner.nextDouble();
//        } catch (InputMismatchException e) {
//            System.out.println("Не верно!");
//            scanner.next();
//
////            return null;
//        }
//
//        try {
//            Class[] parameters = {double.class};
//            ingredient = "by.vgulab" + ingredient;
//            Class ingredientClass = Class.forName(ingredient);
//            Constructor constructor = ingredientClass.getDeclaredConstructor(parameters);
//            Vegetable vegetable = (Vegetable) constructor.newInstance(new Object[]{new Double(weight)});
//            return vegetable;
//        } catch (Exception e) {
//            System.out.println("Нет такого ингредиента!");
//            return null;
//        }
//    }
//
//    public void showOptions() {
//        Scanner scanner = new Scanner(System.in);
//        int choice = -1;
//        Vegetable vegetable = null;
//
//        System.out.println("Привет! Мое имя " + name + ".");
//        System.out.println("Что Вы хотите приготовить сегодня?");
//
//        while (choice != 0) {
//            System.out.println("\nВыберите один из вариантов:");
//            System.out.println("1. Переименовать салат");
//            System.out.println("2. Показать рецепт");
//            System.out.println("3. Добавить ингредиент");
//            System.out.println("4. Сортировка ингредиентов по калориям");
//            System.out.println("5. Сортировка ингредиентов по весу");
//            System.out.println("6. Получите ингредиенты для калорий");
//            System.out.println("0. Завершение");
//
//            try {
//                choice = scanner.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Неправильный вариант!");
//                scanner.next();
//                choice = -1;
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Назовите свой салат:");
//                    salad.setName(scanner.next());
//                    break;
//
//                case 2:
//                    salad.showIngredient();
//                    break;
//
//                case 3:
//                    vegetable = getIngredient(scanner);
//                    if (vegetable != null) {
//                        System.out.println("Невозможно добавить ингредиент!");
//                    }
//                    break;
//
//                case 4:
//                    salad.sortIngredientByCalories();
//                    break;
//
//                case 5:
//                    salad.sortIngredientByWeight();
//                    break;
//
//                case 6:
//                    showRangeCalories(scanner);
//                    break;
//
//                case 0:
//                    System.exit(0);
//                    break;
//
//                default:
//                    break;
//            }
//        }
//
//        scanner.close();
//    }
//
//
//}
