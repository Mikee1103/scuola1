import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Random gen= new Random();
        int lungh=100;
        int continua;
        boolean esci=false;
        int pos;
        int conta=0;
        int n;
        int scelta;
        int [] numeri = new int [100];
        do{
            System.out.println("Scegli un'opzione:");
            System.out.println("1.caricamento tastiera");
            System.out.println("2.caricamento random");
            System.out.println("3.visualizzazione");
            System.out.println("4.inserimento in posizione");
            System.out.println("5.cancellazione di un elemento cercato");
            System.out.println("6.ESCI");
            scelta= in.nextInt();
            switch(scelta) {
                case 1:
                    for (int i = 0; i<100;i++) {
                        System.out.println("Inserisci il numero");
                        n = in.nextInt();
                        numeri[i] = n;
                        lungh=lungh-1;
                        System.out.println("vuoi continuare? (si=1/no=0");
                        continua=in.nextInt();
                        if (continua == 0)
                            break;

                    }
                    break;
                case 2:
                    for (int i = 0; i < 100; i++) {
                        numeri[i] = gen.nextInt(50);
                    }
                    System.out.println("array casuale completato");
                    break;
                case 3:
                    for (int o = 0; o < lungh ; o++) {
                        System.out.print(numeri[o]+", ");
                    }
                    break;
                case 4:
                    System.out.println("in che posizione vuoi inserire il numero?");
                    pos= in.nextInt();
                    System.out.println("Inserisci il numero");
                    n=in.nextInt();
                    numeri[pos]=n;
                    break;
                case 6:
                    esci=true;
                    break;
            }






            }while(esci==false);

        }
    }
