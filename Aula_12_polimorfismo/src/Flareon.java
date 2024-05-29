public class Flareon extends Eevee {
    public Flareon(String tipo, int hP, double altura, double peso, String nome){
        super(tipo, hP, altura, peso, nome);
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
    @Override
    public String Tipo(){
        return "Fire",65,0.9,25.0,"Flareon";
    }
   // @Override
    //public double Altura(){
      //  return 0.9;
    //}
    //@Override
    //public int HP(){
      //  return 65;
    //}
    //@Override
    //public double Peso(){
      //  return 25.0;
    //}
}
