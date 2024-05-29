public class Sylveon extends Eevee {
    public Sylveon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
