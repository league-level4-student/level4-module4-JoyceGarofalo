package _04_hospital;

import java.util.ArrayList;

public class Patient {
	int pulsechecked = 0;
	
	public Object feelsCaredFor() {
		// TODO Auto-generated method stub
		System.out.println("pulse checked: " + pulsechecked);
		if(pulsechecked == 1) {
			return true;/////
		}
		return false;
	}

	public void checkPulse() {
		pulsechecked += 1;
		// TODO Auto-generated method stub
		ArrayList<Patient> p = new ArrayList<Patient>();
		for (int i = 0; i < p.size(); i++) {
			p.get(i).feelsCaredFor();
		}
	}

}
