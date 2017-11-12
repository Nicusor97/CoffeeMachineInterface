/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;

/**
 *
 * @author nicol
 */
public class MainApp {

	public static void main(String[] args) {
		CoffeeMachine c = new CoffeeMachine();

		c.transition("5b");
		c.transition("10b");
		c.transition("5b");
		c.transition("coffee20");
		c.transition("10b");
		c.transition("5b");
		c.transition("coffee15");
		c.transition("25b");
		c.transition("5b");
		c.transition("10b");
		c.transition("5b");
		c.transition("coffee20");
	}

}

