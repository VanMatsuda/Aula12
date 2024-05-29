public class Umbreon extends Eevee {
    public Umbreon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
