public class teste{
    public static void main(String[] args)
    {
        
    }
    
    public void teste(){
        RedDuck patoVermelho = new RedDuck();
        System.out.println("--- Teste inicial ---");
        patoVermelho.performQuack();
        patoVermelho.performFly();
        patoVermelho.performSwim();
        System.out.println("--- Mudando o quack ---");
        patoVermelho.setQuackBehavior(new MuteQuack());
        patoVermelho.performQuack();
        System.out.println("Narrador: Agora nosso patinho nao 'fala'... Melhor deixar ele falando algo que ne?");
        patoVermelho.setQuackBehavior(new NaturalQuack());
        patoVermelho.performQuack();
        System.out.println("flamengo");
    }
}
