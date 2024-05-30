public class Sylveon extends Eevee {
    public Sylveon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso);
    }
    @Override
    public String Ataque(){
        return "Moonblast";
    }
    @Override
    public String Defesa(){
        return "Pixilate";
    }
    @Override
    public String Especial(){
        return "Cute Charm";
    }
}
