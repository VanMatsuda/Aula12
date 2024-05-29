public class Vaporeon extends Eevee{
    public Vaporeon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
