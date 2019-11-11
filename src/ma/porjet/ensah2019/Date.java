package ma.porjet.ensah2019;

import java.util.Scanner;

public class Date{

    private static int jour;
    private static int mois;
    private static int annee;

    Scanner clavier = new Scanner(System.in);
    public void saisir_date() {
    	String date =clavier.nextLine();
        jour=Integer.parseInt( date.split("/")[0]);
     	mois=Integer.parseInt( date.split("/")[1]);
	    annee=Integer.parseInt( date.split("/")[2]);
       
        try {
            this.date_valide();
        } catch (DateException de) {
            System.out.println(de);
        }
    }

   
    public void infos_date() {
        System.out.println( jour+"/"+ mois+"/"+annee);
        clavier.close();
    }

    public boolean Bissextile() {
        if (((annee % 100 == 0) && (annee % 400 == 0)) || ((annee % 100 != 0) && (annee % 4 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public int NbJour() {
        switch (mois) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (this.Bissextile()) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public void date_valide() throws DateException {
        if (annee <= 0) {
            throw new DateException(3);
        }
        if ((mois <= 0) || (mois > 12)) {
            throw new DateException(2);
        }
        if ((jour <= 0) || (jour > this.NbJour())) {
            throw new DateException(1);
        }
    }
}