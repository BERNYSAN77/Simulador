import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        //pedir datos del cliente y crear la instacia

        do{
            System.out.println("1. Visualizar el saldo de la cuenta corriente del cliente.");
            System.out.println("2. Visualizar el saldo de la cuenta de ahorros del cliente.");
            System.out.println("3. Visualizar el saldo del CDT del cliente.");
            System.out.println("4. Visualizar el saldo total que tiene el cliente en los productos del banco.");
            System.out.println("5. Invertir un monto de dinero en un CDT.");
            System.out.println("6. Cerrar la inversión en CDT.");
            System.out.println("7. Consignar un monto de dinero en la cuenta corriente del cliente.");
            System.out.println("8. Retirar un monto de dinero en la cuenta corriente del cliente.");
            System.out.println("9. Consignar un monto de dinero en la cuenta de ahorros del cliente.");
            System.out.println("10. Retirar un monto de dinero en la cuenta de ahorros del cliente.");
            System.out.println("11. Avanzar en un mes la simulación.");
            System.out.println("12. Visualizar puntos");
            System.out.println("13. Modificar tipo de cliente");
            System.out.println("14. Mostrar cliente (simulador bancario");
            System.out.println("15. Salir");
            System.out.print("Ingrese una opcion: ");
            op = Integer.parseInt(sc.next());
            switch (op){

            }

        }while(op != 15 );
        );
    }
}