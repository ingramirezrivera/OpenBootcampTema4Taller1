package Package;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = -3;

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


    }
}
