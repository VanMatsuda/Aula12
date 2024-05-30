public class Glaceon extends Eevee{
    public Glaceon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
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
