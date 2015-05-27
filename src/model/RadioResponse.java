/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author abdou
 */
public class RadioResponse extends Response{
    private ArrayList<String> reponses = new ArrayList();
    private String selected = "??????";
    
    /**
     *Reponose de type radio
     * @param list
     */
    public RadioResponse(ArrayList<String> list)
    {
        reponses.addAll(list);
    }

    /**
     * @return the reponses
     */
    public ArrayList<String> getReponses() {
        return reponses;
    }

    /**
     * @param reponses the reponses to set
     */
    public void setReponses(ArrayList<String> reponses) {
        this.reponses = reponses;
    }

    /**
     * @return the selected
     */
    public String getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(String selected) {
        this.selected = selected;
    }
    

}
