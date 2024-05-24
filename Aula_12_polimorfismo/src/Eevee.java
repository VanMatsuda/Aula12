public class Eevee {
    private String tipo;
    private int HP;
    private double altura, peso;
    private String nome;
    private String ataque;
    private String defesa;
    private String especial;
    
    public String Nome(){
        return "Eu sou O Eevee";
    }
    public String Ataque(){
        return "Ataque rapido";
    }
    public String Defesa(){
        return "Desvio";
    }
    public String Especial(){
        return "Tri-ataque";
    }
    public String Tipo(){
        return "Normal";
    }
    public double Altura(){
        return 3;
    }
    public int HP(){
        return 40;
    }
    public double Peso(){
        return 6.5;
    }
    public Eevee(String tipo, int hP, double altura, double peso, String nome, String ataque, String defesa, String especial) {
        this.tipo = tipo;
        this.HP = hP;
        this.altura = altura;
        this.peso = peso;
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.especial = especial;
    }
    public Eevee() {
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        this.HP = hP;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAtaque() {
        return ataque;
    }
    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }
    public String getDefesa() {
        return defesa;
    }
    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }
    public String getEspecial() {
        return especial;
    }
    public void setEspecial(String especial) {
        this.especial = especial;
    }
    public void imprimir (){
    System.out.println("Nome: " + getNome());
    System.out.println("Tipo: " + getTipo());
    System.out.println("HP: " + getHP());
    System.out.println("Altura: " + getAltura() + " m");
    System.out.println("Peso: " + getPeso() + " kg");
    System.out.println("Ataque: " +getAtaque());
    System.out.println("Defesa: " +getDefesa());
    System.out.println("Especial: " +getEspecial());
    }
}
