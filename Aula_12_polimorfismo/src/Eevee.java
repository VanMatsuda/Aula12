public class Eevee {
    private String nome;
    private String tipo;
    private int HP;
    private double altura, peso;
    private String ataque;
    private String defesa;

    public String nome (){
        return "Eu sou O Eevee";
    }
    public String ataque(){
        return "Ataque rapido";
    }
    public String defesa(){
        return "Desvio";
    }
    public String especial(){
        return "Tri-ataque";
    }
    public String tipo(){
        return "Normal";
    }
    public double altura(){
        return 3;
    }
    public int HP(){
        return 40;
    }
    public double peso(){
        return 6.5;
    }
    public Eevee(String nome,String tipo, int hP, double altura, double peso,String ataque, String defesa) {
        this.nome = nome;
        this.tipo = tipo;
        this.HP = hP;
        this.altura = altura;
        this.peso = peso;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public Eevee() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    
}