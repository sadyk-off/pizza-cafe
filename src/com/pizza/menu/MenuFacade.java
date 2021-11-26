package com.pizza.menu;

import com.pizza.customCombo.concreteBuilder.HawaiianPizzaBuilder;
import com.pizza.order.Order;
import com.pizza.order.adapter.CardImplementation;
import com.pizza.order.adapter.CardToCashAdapter;
import com.pizza.order.card.Card;
import com.pizza.order.cash.Cash;
import com.pizza.pizzasFactory.concreteFactory.MargheritaPizzaFactory;
import com.pizza.pizzasFactory.concreteFactory.PepperoniPizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MenuFacade {
    public static Map<Integer, Double> menu = new HashMap<>();
    private static Order order = new Order();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void openMenu() throws IOException {
        System.out.println("Make order");

        MargheritaPizzaFactory margheritaPizzaFactory = new MargheritaPizzaFactory();
        PepperoniPizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        menu.put(1, margheritaPizzaFactory.getPrice());
        menu.put(2, pepperoniPizzaFactory.getPrice());
        menu.put(3, hawaiianPizzaBuilder.getPrice());

        boolean active;
        String message;

        while (true) {
            System.out.println(
                    "1. Make an order \n" +
                            "2. See price list \n" +
                            "3. Exit");
            message = reader.readLine();
            if (Objects.equals(message, "2")) {
                System.out.println(Arrays.asList(menu));
            } else if (Objects.equals(message, "3")) break;
            else if (Objects.equals(message, "1")) {
                do {
                    System.out.println("Please choose pizza you want to add: \n" +
                            "1." + margheritaPizzaFactory.getName() + "\n" +
                            "2." + pepperoniPizzaFactory.getName() + "\n" +
                            "3." + hawaiianPizzaBuilder.getName() + "\n" +
                            "4. Or create your own pizza");
                    int num = Integer.parseInt(reader.readLine());
//                    if (num == 4)
                    double cost = menu.get(num);
                    order.setPrice(order.getPrice() + cost);
                    System.out.println("Your total price is : " + order.getPrice());
                    System.out.println("Continue? Y/N");
                    message = reader.readLine();
                } while (message.equalsIgnoreCase("Y"));

                System.out.println("Your total price - " + order.getPrice());


                // payment part
                Card card = new CardImplementation();

                do {
                    System.out.println("Please choose payment method: \n" +
                            "1. Card \n" +
                            "2. Cash \n");
                    int num = Integer.parseInt(reader.readLine());

                    if (num == 1) {
                        System.out.println("Enter card No");
                        String cardNo = reader.readLine();

                        card.setPrice(order.getPrice());

                        Cash cash = new CardToCashAdapter(card);

                        System.out.println("Payment of " +
                                +cash.getTotalPrice()
                                + " successful!");
                    }

                    if (num == 2) {
                        System.out.println("Success");
                    }

                    message = reader.readLine();
                } while (message.equalsIgnoreCase("Y"));
                break;
            }
            else System.out.println("Wrong input!");

        }

        System.out.println( "Thank you! Enjoy your meal!");

    }
}
