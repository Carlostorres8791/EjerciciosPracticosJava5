
public class Main {
    public static void main(String[] args) {
        saludarUsuario("Luis");

        System.out.println("el calculo del area del triangulo para una base de 5 y  una altura de 10 es: "+areaTriangulo(5,10));

        numeroMayorMenor(5, 23);

        System.out.println("100 grados celsius es igual a: "+conversorTemp(100));

        parImpar(1);
    }

    public static void saludarUsuario(String nombre){
        System.out.println("Hola, Bienvenido "+nombre+" este es tu primer metodo en java " +
                "\n pasando parametros en este caso es un parametro de tipo String");

    }

    public static int areaTriangulo(int base, int altura){
        int area = (base*altura)/2;
        return area;
    }

    public static void numeroMayorMenor(int numeroUno, int numeroDos){
        if (numeroUno > numeroDos) {
            System.out.println("Numero "+numeroUno+" es mayor que "+numeroDos);
        }else {
            System.out.println("Numero "+numeroDos+" es mayor que "+numeroUno);
        }
    }

    public static double conversorTemp(double celsius){
        double fahrenheit = (celsius*1.8)+32;
        return fahrenheit;
    }

    public static void parImpar(int numero){
        int residuo = numero%2;

        if (residuo == 0) {
            System.out.println("El numero "+numero+" es par");
        }else{
            System.out.println("El numero "+numero+" es impar");
        }
    }
}