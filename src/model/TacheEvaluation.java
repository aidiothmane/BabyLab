/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author abdou
 */
public class TacheEvaluation extends Tache{
    private String media;
    private String text;
    private Response reponse;

    public String getMedia() {
        return media;
    }

    public String getText() {
        return text;
    }
    
    public Response getReponse()
    {
        return reponse;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param reponse the reponse to set
     */
    public void setReponse(Response reponse) {
        this.reponse = reponse;
    }
    
    
}
