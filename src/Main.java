public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
       /** Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.**/
       int numeroif= 0;
       if(numeroif>0){
           System.out.println("El número es positivo");
       } else if (numeroif<0) {
           System.out.println("El número es negativo");
       }else {
           System.out.println("El número es cero");
       }

       // Ejercicio 2
        /** Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3**/
        int numeroWhile=0;
        while (numeroWhile<3){
        numeroWhile = numeroWhile+1;
            System.out.println("Ejercicio2:"+numeroWhile);
        }

        // Ejercicio 3
        /** Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez. **/
        int numeroDowhile =3;
        do{
            System.out.println("Ejercicio3: "+numeroDowhile);
            numeroDowhile= numeroDowhile+1;

        }while(numeroDowhile<3);

        //Ejercicio4
        /** Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.**/
        for(int numeroFor=0; numeroFor<=3; numeroFor = numeroFor+1){
            System.out.println("Ejercicio4:"+numeroFor);
        }

        /** Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. **/
         var estacion = "PRIMAVERA";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Primavera");
            break;
            case "VERANO":
                System.out.println("Verano");
            break;
            case"OTOÑO":
                System.out.println("Otoño");
            break;
            case "INVIERNO":
                System.out.println("Invierno");
            break;
        }
    }


}