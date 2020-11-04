package it.unical.ingsw2020.ProvaIngsw;

import java.util.ArrayList;

public class MyListUtil {
	
	public ArrayList<Integer> ordinaNumeri(ArrayList<Integer> numeri, char carattere) {
		
		if(carattere == 'c') {
			for(int i = 0; i < numeri.size(); i++) {
				for(int j = 0; j < numeri.size(); j++) {
					if(i != j) {
						if(numeri.get(i) < numeri.get(j)) {
							int help = numeri.get(j);
							numeri.set(j, numeri.get(i));
							numeri.set(i, help);
						}
					}
				}
			}
		}
		else {
			for(int i = 0; i < numeri.size(); i++) {
				for(int j = 0; j < numeri.size(); j++) {
					if(i != j) {
						if(numeri.get(i) > numeri.get(j)) {
							int help = numeri.get(j);
							numeri.set(j, numeri.get(i));
							numeri.set(i, help);
						}
					}
				}
			}
		}
		
		return numeri;
	}
}
