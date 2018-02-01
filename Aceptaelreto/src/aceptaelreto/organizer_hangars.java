
package aceptaelreto;

import java.util.Scanner;


public class organizer_hangars {

//Devuelve true cuando puedes entrar en el hangar
    static boolean resuelvecaso(int[] hangares, int[] naves) {
        for (int i = 0; i < naves.length; i++) {
            int poshangarmax = dimehangarmax(hangares);
            if (naves[i] <= hangares[poshangarmax]) {
                hangares[poshangarmax] = hangares[poshangarmax] - naves[i];
            } else {
                return false;
            }
        }
        return true;
    }

    // nos dice la posicion hangar de mayor tamaño
    static int dimehangarmax(int[] hangares) {
        int pos = 0;
        for (int i = 0; i < hangares.length; i++) {
            if (hangares[i] > hangares[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hangares[];
        int nh;
        int naves[];
        int nn;

        //En nh introduzco en numero de hangares,
        nh = scan.nextInt();
        while (nh != 0) {
            hangares = new int[nh];
            for (int i = 0; i < nh; i++) {
                //System.out.println("Dime cuantos espacios vacios en hangar: ");
                hangares[i] = scan.nextInt();
            }
            //en nn introduzco numero de naves
            nn = scan.nextInt();
            naves = new int[nn];

            for (int i = 0; i < nn; i++) {
                //tamaños de las naves
                naves[i] = scan.nextInt();
            }

            boolean res = resuelvecaso(hangares, naves);
            if (res == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            //Cuantos angares?
            nh = scan.nextInt();
        }

    }

}