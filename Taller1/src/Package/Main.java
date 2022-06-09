package Package;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = -3;
        int numeroDoWhile = -3;
        int numeroFor = 0;

        System.out.println("---------------IF ELSE------------");
        if(numeroIf > 0){
            System.out.println("El número es positivo:");
        }else if(numeroIf < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es cero.");
        }

        System.out.println("---------------WHILE------------");
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile += 1;
        }

        System.out.println("---------------DO WHILE------------");
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile += 1;
        }while(numeroDoWhile < 3);

        System.out.println("-------------FOR--------------");
        for (int i = 0; numeroFor <= 3; i++){
            numeroFor += 1;
            System.out.println("Iteración for: " + numeroFor);
        }
    }
}
