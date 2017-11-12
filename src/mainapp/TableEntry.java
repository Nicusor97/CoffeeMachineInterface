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
public class TableEntry {
    
    private int currentState;
	private String action;
	private int nextState;
	
	public TableEntry(int currentState,String action,int nextState){
		this.currentState = currentState;
		this.action = action;
		this.nextState = nextState;
	}

	public int getCurrentState() {
		return currentState;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getNextState() {
		return nextState;
	}

	public void setNextState(int nextState) {
		this.nextState = nextState;
	}
	
}
