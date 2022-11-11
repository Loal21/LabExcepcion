package LabExcep;

public class ExcepcionDivision {

    public static void main(String[] args) {
        aritmetico();
    }

    public static void aritmetico() {
        int numero = 5, resultado;
        try {
            //Se divide en 0 el numero 5
            resultado = numero / 0;
            //El catch actua con la ArithmeticException para ver que hay un error en la operacion
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0 " + "\n " + e.getMessage());
        }

    }

}
