public class Glaceon extends Eevee{
    public Glaceon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
    
    @Override
    public String Ataque(){
        return "Blizzard";
    }
    @Override
    public String Defesa(){
        return "Ice Body";
    }
    @Override
    public String Especial(){
        return "Snow Cloak";
    }
}
