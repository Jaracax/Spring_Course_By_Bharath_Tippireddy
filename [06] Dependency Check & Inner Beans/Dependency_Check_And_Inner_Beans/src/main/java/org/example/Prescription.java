package org.example;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

/* POJO class from which we are creating a bean to show dependency check in the "id" field
 * */
public class Prescription {


    private int id;
    private String patientName;
    private List<String> medicines;

    public int getId() {
        return id;
    }

    // The @Required annotation is used to ensure that the field is referring to gets a value assigned
    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", medicines=" + medicines +
                '}';
    }
}
