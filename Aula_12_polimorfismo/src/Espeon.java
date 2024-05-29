public class Espeon extends Eevee {

    public Espeon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
