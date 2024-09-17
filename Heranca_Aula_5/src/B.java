public class B extends A{

    public B(){
        super();
        System.out.println("Construtor default B");
    }

    public B(int i){
        super(i);
        System.out.println("Construtor com argumentos B" + i);
    }

    @Override
    public void a1() {
        super.a1();
        System.out.println("Método a1 sobrescrito em B");
    }


    public void b2() {
        super.a2();
        System.out.println("Método a2 sobrescrito em B");
    }

}
