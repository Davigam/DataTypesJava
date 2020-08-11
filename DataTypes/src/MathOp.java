public class MathOp {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x)); //Devuelve un entero hacia arriba
        System.out.println(Math.floor(x)); //Devuelve un entero hacia abajo
        System.out.println(Math.pow(x, y)); //Devuelve un numero elevado a otro
        System.out.println(Math.max(x, y));
        System.out.println(Math.sqrt(y)); //Devuelve la raiz cuadrada
        System.out.println(Math.PI * Math.pow(y, 2)); //Area de un circulo: PI * r2
        System.out.println(4 * Math.PI * Math.pow(y, 2)); //Area de una esfera
        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); //Volumen de la esfera: (4/3)*pi * r3
    }
}
