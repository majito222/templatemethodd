public class PruebaTemplate {
    public static void main(String[] args) {
        CajeroAutomatico ca = new CajeroAutomatico("M2A882F",30,1);
        ca.procesar("M2A882F",10,2);

        System.out.println();

        Cajero c = new Cajero("AM222A05",50,1);
        c.procesar("AM222A05",15,2);

        System.out.println();
    
    }
}
