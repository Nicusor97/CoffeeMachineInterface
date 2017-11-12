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
public abstract class StateMachine {
	protected int currentState;
	protected MyList list;

	public void transition(String action) {
		int nextState= getNextAction(action);
		if (nextState != -1) {
			execute(action);
		}
		else{
			System.out.println("\nEroare!");
			System.out.println("\n");
		}
	}

	public abstract void execute(String action);

	private int getNextAction(String action) {
		int nextState = list.contains(currentState, action);

		return nextState;

	}
}