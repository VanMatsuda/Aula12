public class Espeon extends Eevee {

    public Espeon(String nome,String tipo, int hP, double altura, double peso){
        super(nome,tipo, hP, altura, peso );
    } 
        @Override
    public String Ataque(){
        return "Future Sight";
    }
    @Override
    public String Defesa(){
        return "Magic Bounce";
    }
    @Override
    public String Especial(){
        return "Synchronize";
    }
}
