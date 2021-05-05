package formas_geometricas;

public class Retangulo {
    private float area;
    private float perimetro;
    private float base;
    private float altura;
    public Retangulo(float base, float altura){
        this.altura = altura;
        this.base = base;
        calculaRetangulo();
    }
    void calculaRetangulo(){
        area = base * altura;
        perimetro = (base + altura)*2;
    }
    public float getArea(){
        return area;
    }
    public float getPerimetro(){
        return perimetro;
    }
    public float getBase(){
        return base;
    }
    public float getAltura(){
        return altura;
    }
    public void setBase(float base){
        this.base = base;
        calculaRetangulo();
    }
    public void setAltura(float altura){
        this.altura = altura;
        calculaRetangulo();
    }
}
