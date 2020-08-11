import javafx.scene.shape.Sphere;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        double areaC = circleArea(y);
        System.out.println(areaC); //Area de un circulo: PI * r2

        double areaS = sphereArea(y);
        System.out.println(areaS); //Area de una esfera

        double volumeS = sphereVolume(y);
        System.out.println(volumeS); //Volumen de la esfera: (4/3)*pi * r3

//        System.out.println(Math.PI * Math.pow(y, 2)); //Area de un circulo: PI * r2
//        System.out.println(4 * Math.PI * Math.pow(y, 2)); //Area de una esfera
//        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); //Volumen de la esfera: (4/3)*pi * r3

        System.out.println("De pesos a dolares: " + converToDollar(10000, "COP"));
        System.out.println("De pesos a dolares: " + converToDollar(200, "MXN"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);

}
    public static double sphereArea(double s) {
        return 4 * Math.PI * Math.pow(s, 2);
    }

    public static double sphereVolume(double v) {
        return 4/3 * Math.PI * Math.pow(v, 3);
    }


    /**
     * Descripcion: Esta funcion puede cambiar la moneda que se especifique a dolar estadounidense (USD).
     *
     * @param quantify Cantidad de dinero
     * @param currency Tipo de moneda: Solo MXN o COP
     * @return quantify Devuelve la cantidad en dolares
     * */

    public static double converToDollar(double quantify, String currency) {
        //MXN COP
        switch (currency){
            case "MXN":
                quantify = quantify * 23.30;
                break;
            case "COP":
                quantify = quantify * 0.00026;
                break;
        }
        return quantify;
    }
}
