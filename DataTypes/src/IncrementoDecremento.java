public class IncrementoDecremento {
    public static void main(String[] args) {
        int vidas = 5;
        vidas = vidas - 1;
        System.out.println(vidas);

        vidas++;
        System.out.println(vidas);

        var puntos = 0;
        puntos = 100 + ++vidas;
        System.out.println(puntos);

        System.out.println("Vidas: " + vidas + "   Puntos: " + puntos);
    }
}
