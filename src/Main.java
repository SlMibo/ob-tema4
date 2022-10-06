import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;
        if (numeroIf == 0) {
            System.out.println("El valor de la variable es cero");
        } else if (numeroIf > 0) {
            System.out.println("El valor de la variable es positivo");
        } else {
            System.out.println("El valor de la variable es negativo");
        }

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            System.out.println("While, " + numeroWhile);
            numeroWhile = numeroWhile +  1;
        }

        do {
            System.out.println("Do, " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 3);

        int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            numeroFor++;
            System.out.println("For, " + numeroFor);
        }

        String estacion = "Otoño";
        switch (estacion) {
            case "Otoño":
            case "Invierno":
            case "Primavera":
            case "Verano":
                System.out.println(estacion);
                break;
            default:
                System.out.println("Estación no válida.");
                break;
        }

    }
}