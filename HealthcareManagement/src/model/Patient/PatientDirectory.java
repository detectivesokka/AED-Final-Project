/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Patient;

import java.util.ArrayList;

/**
 *
 * @author Akshita
 */
public class PatientDirectory {

    private ArrayList<Patient> patients = new ArrayList<>();

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

}
