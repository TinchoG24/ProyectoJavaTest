public class Main {
    // This is a simple Java program that prints "Hello, World!" to the console.
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // The program uses the System.out.println method to print the message.
        // The main method is the entry point of the program.
        // The args parameter is an array of strings that can be used to pass command-line arguments to the program.

        // In this case, it is not used.
        // The program does not take any command-line arguments.
        // Haceme una funcion que me devuelva el cuadrado de un numero

        int resultado = cuadrado(5);
        System.out.println("El cuadrado de 5 es: " + resultado);

    }
    public static int cuadrado(int numero) {
        return numero * numero;
    }

}
