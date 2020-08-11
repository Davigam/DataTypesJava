public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOffLight();

        int i = 1;
        while (isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
