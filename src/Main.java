import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * en java il existe principalement 4 structures conditionnelles
        * if
        * if...else
        * if...else...if
        * switch
        * */

        //cas de la structures if
        //Syntaxe
        /*
        * if(condition){
        * les instructions
        * }
        * */

        //cas de la structures if...else
        //Syntaxe
        /*
         * if(condition){
         * les instructions
         * }
         * else{
         * les instructions
         * }
         */
        int val = (int) ((Math.random()*10)+1);
        System.out.println("La valeure est : " + val);
        //6 7 8 9 10
        if(val>5)
        {
            System.out.println("Valeure supérieure à 5");
        }else if(val==5)
        {
            System.out.println("Valeure égale à 5");
        }
        else{
            //1 2 3 4
            System.out.println("Valeure inférieure à 5");
        }

        //cas de la structures if...else...if
        //Syntaxe
        /*
         * if(condition1){
         * Instructions exécutées lorsque la condition1 est vraie
         * }
         * else if(condition2){
         * Instructions exécutées lorsque la condition2 est vraie
         * }
         * else{
         * Instructions exécutées lorsque aucune instructions n'est vraie
         * }
         */

        //cas de la structures switch
        //Syntaxe
        /*
        switch(variable){
        case val1:
        instructions exécuté si la valeur de la variable est val1
        break;
        case val2:
        instructions exécuté si la valeur de la variable est val2
        break;
        case val3:
        instructions exécuté si la valeur de la variable est val3
        break;
        default:
        instructions exécuté si aucune des valeurs n'est vraie
        break;
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur comprise entre 1 et 7");
        int valeur = sc.nextInt();
        switch (valeur){
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
        }


    }
}