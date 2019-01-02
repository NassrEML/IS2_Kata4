package Controlador;

import Modelo.Histogram;
import Modelo.Mail;
import Vista.HistogramDisplay;
import Vista.MailHistogramBuilder;
import Vista.MailListReader;
import java.io.IOException;
import java.util.List;

/**
 * @author NassrEML
 */

public class Kata4 {
    
    //private static HistogramDisplay histoDisplay;
    private static MailListReader lecturaLista;
    private static String fileName;
    private static List<Mail> mailList;
    private static MailHistogramBuilder histogramBuild;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) throws IOException {
        execute();
    }
    
    private static void execute(){
        input();
        process();
        output();
    }

    private static void input(){
        lecturaLista = new MailListReader();
        fileName = "email.txt";
        mailList = lecturaLista.read(fileName);
    }

    private static void process(){
        histogramBuild = new MailHistogramBuilder();
        histogram = histogramBuild.build(mailList);
    }

    private static void output(){
        HistogramDisplay histo = new HistogramDisplay(histogram);
        
        histo.execute();
    }
}
