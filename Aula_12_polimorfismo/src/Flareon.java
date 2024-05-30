public class Flareon extends Eevee {
    public Flareon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
    @Override
    public String Ataque(){
        return "Fire Fang";
    }
    @Override
    public String Defesa(){
        return "Superpower";
    }
    @Override
    public String Especial(){
        return "Flash Fire";
    }
}
