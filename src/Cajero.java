public class Cajero extends CuentaBancaria {
    public Cajero(Strinf c, int i, int t){
        procesar(c,i,t);
    }

    @Override
    public void saludar(){
        System.out.println("Bienvenido a su banco,¿en que puedo ayudarle?");
    
    }

    @Override
    public void auditoria (){
        super.auditoria();
        System.out.println("Fue un placer atenderlo, vuelva pronto");
        
    }
    
}
