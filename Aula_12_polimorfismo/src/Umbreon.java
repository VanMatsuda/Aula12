public class Umbreon extends Eevee {
    public Umbreon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
    @Override
    public String Ataque(){
        return "Faint Attack";
    }
    @Override
    public String Defesa(){
        return "Inner Focus";
    }
    @Override
    public String Especial(){
        return "Synchronize";
    }
}
