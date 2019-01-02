/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Histogram;
import Modelo.Mail;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class MailHistogramBuilder {
    private Histogram<String> histogram;
    
    public Histogram<String> build(List<Mail> listaCorreos){
        histogram = new Histogram<>();
        for(Mail correo: listaCorreos){
            if(correo != null)
                histogram.incremet(correo.getDomain());
        }
        return histogram;
    }
}
