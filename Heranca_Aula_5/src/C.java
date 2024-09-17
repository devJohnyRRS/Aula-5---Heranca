public class C extends B{

    public C(){
        super();
        System.out.println("Construtor default de C");

    }

    public C(int i){
        super(i);
        System.out.println("Contrutor com parÂmetros C");
    }

    @Override
    public void a1() {
        super.a1();
        System.out.println("Método a1 sobrescrito para a classe C");
    }

    @Override
    public void b2() {
        super.b2();
        System.out.println("Método b2 sobrescrito para a classe C");
    }

    public void c1(){

        System.out.println("Método c1");
    }


}
