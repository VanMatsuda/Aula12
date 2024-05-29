public class Leafeon extends Eevee{
    public Leafeon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
    @Override
    public String Tipo(){
        return "Grass",65,1.0,25.5,"Leafeon";
    }
    @Override
    public double Altura(){
        return 1.0;
    }
    @Override
    public int HP(){
        return 65;
    }
    @Override
    public double Peso(){
        return 25.5;
    }
}
