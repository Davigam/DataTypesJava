public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String[] weeday = new String[7];

        String[][] cities = new String[4][2];
        /*
        *    +-----------------------------------+
        *    |      Paises     |     Ciudades    |
        *    -------------------------------------
        *    |      España     |     Malaga      |
        *    |     Colombia    |     Medellin    |
        *    |     Islandia    |    Reikiavik    |
        *    |  Estados Unidos |     Seattle     |
        *    +-----------------------------------+
         */

        int[][][] numbers = new int[2][2][2];
        int[][][][][] numbers1 = new int[2][2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

//        for (int i = 0; i < androidVersions.length; i++) {
//            System.out.println(androidVersions[i]);
//        }

        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

//        System.out.println(androidVersions[0]);
//        System.out.println(androidVersions[1]);
//        System.out.println(androidVersions[2]);
//        System.out.println(androidVersions[3]);


        System.out.println();
        System.out.println();
        System.out.println();


        cities[0][0] = "Estados Unidos";
        cities[0][1] = "Seattle";
        cities[1][0] = "Islandia";
        cities[1][1] = "Reikiavik";
        cities[2][0] = "Colombia";
        cities[2][1] = "Medellin";
        cities[3][0] = "España";
        cities[3][1] = "Malaga";

        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

//        for (int i = 0; i < cities.length; i++) {
//            for (int j = 0; j < cities[i].length; j++) {
//                System.out.println(cities[i][j]);
//
//            }
//        }

        for (String[] pair:
             cities) {
            for (String name:
                 pair) {
                System.out.println(name);
            }
        }



        System.out.println();
        System.out.println();
        System.out.println();

        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }
    }
}
