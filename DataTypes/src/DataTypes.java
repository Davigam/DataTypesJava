public class DataTypes {
    public static void main(String[] args) {
        /*
        * Tipos de datos numericos:
        * byte: Ocupa 1 byte de memoria y su rango es de -128 hasta 127.
          short: Ocupa 2 bytes de memoria y su rango es de -32,768 hasta 32,727.
          int: Ocupa 4 bytes de memoria y su rango es de -2,147,483,648 hasta 2,147,483,647. Es muy cómodo de usar, ya que no es tan pequeño para que no quepan nuestros números ni tan grande como para desperdiciar mucha memoria. Puede almacenar hasta 10 dígitos.
          long: Ocupa 8 bytes de memoria y su rango es de -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807. Para diferenciarlo de un tipo de dato long debemos terminar el número con la letra L.
        * */
        int n = 568789890; //Hasta 9 cifras
        long nl = 1234567893456L; //Muchos mas, se distingue con una L al final

        /*
        * Tipos de datos para números flotantes (con decimales):

            float: Ocupan 4 bytes de memoria y su rango es de 1.40129846432481707e-45 hasta 3.40282346638528860e+38. Así como long, debemos colocar una letra F al final.
            double: Ocupan 8 bytes de memoria y su rango es de 4.94065645841246544e-324d hasta 1.79769313486231570e+308d.
        * */
        double nD = 123.456123456; //Este es mejor para operaciones matematicas por su precision.
        float nF = 123.456F; //Se distingue con una F al final.

        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);
    }
}
