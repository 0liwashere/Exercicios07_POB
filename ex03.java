public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            System.out.println("Largura inválida. Aplicando valor padrão 1.0.");
            this.largura = 1.0;
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("Altura inválida. Aplicando valor padrão 1.0.");
            this.altura = 1.0;
        } else {
            this.altura = altura;
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5.0, 3.0);
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());

        Retangulo r2 = new Retangulo(-2.0, 4.0); 
        System.out.println("Área r2: " + r2.calcularArea());
    }
}
