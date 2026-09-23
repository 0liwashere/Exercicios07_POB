public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo. Valor não alterado.");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Quantidade em estoque não pode ser negativa. Valor não alterado.");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }

    public static void main(String[] args) {
        Produto produtoA = new Produto("Teclado", 150.0, 10);
        Produto produtoB = new Produto("Mouse", 80.0);

        System.out.println("Valor total em estoque A: " + produtoA.calcularValorTotalEmEstoque());
        System.out.println("Valor total em estoque B: " + produtoB.calcularValorTotalEmEstoque());

        System.out.println("Tentando setar preço negativo em B:");
        produtoB.setPreco(-10.0);
        System.out.println("Preço de B continua: " + produtoB.getPreco());
    }
}
