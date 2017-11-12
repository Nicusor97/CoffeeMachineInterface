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
import java.util.ArrayList;
import java.util.List;

public class MyList {
	private List<TableEntry> list;

	public MyList() {
		list = new ArrayList<TableEntry>();
	}

	public void add(TableEntry element) {
		list.add(element);
	}

	public int contains(int currentState, String action) {
		int result = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCurrentState() == currentState && list.get(i).getAction() == action) {
				result = list.get(i).getNextState();
				break;
			}
		}

		return result;
	}

}