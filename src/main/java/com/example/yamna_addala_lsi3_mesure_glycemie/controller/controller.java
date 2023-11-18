package com.example.yamna_addala_lsi3_mesure_glycemie.controller;
import com.example.yamna_addala_lsi3_mesure_glycemie.model.patient;
public class controller {
    private static patient patient;
    public controller()
    {
        super();
    }
    public void create_patient(int age ,float valeur , boolean isFasting){
        patient=new patient(age,valeur,isFasting) ;
    }
    //update entre le controller vers la view
    public String getResult(){

        return patient.getResultat();//update patient to controller
    }

}
