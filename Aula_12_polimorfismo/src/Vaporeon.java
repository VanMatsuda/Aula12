public class Vaporeon extends Eevee{
    public Vaporeon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
    @Override
    public String Ataque(){
        return "Jato d'água - Water Pulse";
    }
    @Override
    public String Defesa(){
        return "Water Pulse";
    }
    @Override
    public String Especial(){
        return "Hydratation";
    }
    
}
