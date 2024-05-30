public class Leafeon extends Eevee{
    public Leafeon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
    @Override
    public String Ataque(){
        return "Giga Drain";
    }
    @Override
    public String Defesa(){
        return "Chlorophyl";
    }
    @Override
    public String Especial(){
        return "Leaf Guard";
    }
}
