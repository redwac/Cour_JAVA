public class Helloworld {
    public static void main(String args[]) {
        System.out.println("Hello world");
        int age = 35;
        boolean B1=true;
        if (age !=35 && B1 ) {
            System.out.println("l'age est different de 35");

        }
        else {
            System.out.println("l'age du capitaine est : " + age);
        }
        int age2 = 33;
        boolean B2=true;
        boolean B3 = (age2 == 30) && B2 ;
        if (B3){
            System.out.println("le capitaine a l age de :" + age2);
        }
        else {
            System.out.println("le capitaine n'a pas l'age de :" + age2);
        }
        int age3=20;
        boolean B4 =true ;
        boolean B5 = age3==20 && B4 ;
        System.out.println(B5?"l'age du capitaine est :" + age3 : "l'age du capitaine different de :"+age3);
        System.out.println(age3==20 && B4?"l'age du chaf est :" + age3 : "l'age du chaf different de :"+age3);

        int age4 = 43;

        if (age4 == 40){
            System.out.println("l'age du capitain est égale à : 40" );
        }
        else if (age4>40){
            System.out.println("l'age du capitain est superieur à : 40" );
        }
        else {
            System.out.println("l'age du capitaine est inférieur à : 40" );
        }
        int age5 = 80 ;
        switch (age5){
            case  20 :
                System.out.println("le capitaine à 20 ans");
                break;
            case 10 :
                System.out.println("le capitaine à 10 ans");
                break;
            default:
                System.out.println("cette valeur ne correspond pas");
        }

        for (int nbr7=0;nbr7<=3;nbr7++){
            switch (nbr7){
                case 0 :
                    System.out.println("le nombre est : " + nbr7);
                    break;
                case 1 :
                    System.out.println("le nombre est : " + nbr7);
                    break;
                case 2 :
                    System.out.println("le nombre est : " + nbr7);
                    break;
                case 3 :
                    System.out.println("le nombre est : " + nbr7);
                    break;
                default :
                    System.out.println("aucun nombre ne correspond");


            }
        }

    boolean b9=true;
            while (b9){
        System.out.println("l'itération while active");
        b9=false;
        }
        boolean b10=true;
            do {
                System.out.println("l'itération DO_while n'es pas active");
                b10=false;
            }while (b10);

        int b=0;
        while (b<3){
            switch (b){
                case 0 :
                    System.out.println("le nombre b est : " + b);
                    break;
                case 1 :
                    System.out.println("le nombre b est : " + b);
                    break;
                case 2 :
                    System.out.println("le nombre b est : " + b);
                    break;
                case 3 :
                    System.out.println("le nombre b est : " + b);
                    break;
                default :
                    System.out.println("aucun nombre b ne correspond");

            }
            b++;
        }
        boolean bo1 =true;
        while (bo1){
            System.out.println("la boucle est active pour une autre seconde");
            break;
        }




        }

}

