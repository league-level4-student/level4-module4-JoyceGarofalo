package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub	
		doctors.add(doctor);
		////
	}
	

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		//System.out.println("hi");
		System.out.println(doctors);

		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

		doctors.get(0).assignPatient(patients.get(0));
		doctors.get(0).assignPatient(patients.get(1));
		doctors.get(0).assignPatient(patients.get(2));
		
		doctors.get(1).assignPatient(patients.get(3));
		doctors.get(1).assignPatient(patients.get(4));
		doctors.get(1).assignPatient(patients.get(5));
		
		doctors.get(2).assignPatient(patients.get(6));
		doctors.get(2).assignPatient(patients.get(7));
		
	}


}
