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
public class CoffeeMachine extends StateMachine {

	public CoffeeMachine() {
		list = new MyList();
		list.add(new TableEntry(0, "5b", 5));
		list.add(new TableEntry(0, "10b", 10));
		list.add(new TableEntry(5, "5b", 10));
		list.add(new TableEntry(5, "10b", 15));
		list.add(new TableEntry(10, "5b", 15));
		list.add(new TableEntry(10, "10b", 20));
		list.add(new TableEntry(15, "5b", 20));
		list.add(new TableEntry(15, "coffee15", 0));
		list.add(new TableEntry(20, "coffee20", 0));

		this.currentState = 0;
	}

	@Override
	public void execute(String action) {
		switch (action) {
		case "5b":
			updateAction5b();
			break;
		case "10b":
			updateAction10b();
			break;
			
		case "coffee15":
			getCoffee15();
			break;
		case "coffee20":
			getCoffee20();
			break;

		default:
			break;
		}
	}


	private void updateAction5b() {
		switch (currentState) {

		case 0:
			currentState = 5;
			System.out.println("currentState = " + currentState);
			break;
		case 5:
			currentState = 10;
			System.out.println("currentState = " + currentState);
			break;
		case 10:
			currentState = 15;
			System.out.println("currentState = " + currentState);
			break;

		case 15:
			currentState = 20;
			System.out.println("currentState = " + currentState);
			break;

		default:
			break;
		}
	}

	private void updateAction10b() {
		switch (currentState) {

		case 0:
			currentState = 10;
			System.out.println("currentState = " + currentState);
			break;
		case 5:
			currentState = 15;
			System.out.println("currentState = " + currentState);
			break;

		case 10:
			currentState = 20;
			System.out.println("currentState = " + currentState);
			break;

		default:
			break;
		}
	}
	

	private void getCoffee15() {
		System.out.println("==> ");
		System.out.println("SIMPLE Coffee with 15!");
		currentState = 0;
		
	}


	private void getCoffee20() {
		System.out.println("==> ");
		System.out.println("LATTE  with 20 !");
		currentState = 0;
		
	}

}

