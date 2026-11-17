public class Main {

    public static void main(String[] args) {

        System.out.println("=== TESTES POSITIVOS ===");
        Produto p = new Produto("Teclado Mecânico", 249.90);
        p.exibirResumo();                       

        p.adicionarEstoque(50);                 
        p.vender(20);                           
        p.exibirResumo();

        p.setNome("Teclado Gamer");             
        p.setPreco(199.99);
        p.exibirResumo();

        System.out.println("=== TESTES NEGATIVOS ===");
        System.out.println("> Vender mais do que o estoque (30):");
        p.vender(100);                          // Estoque insuficiente

        System.out.println("> Adicionar quantidade negativa:");
        p.adicionarEstoque(-5);

        System.out.println("> Vender quantidade negativa:");
        p.vender(-3);

        System.out.println("> Setter com preço negativo:");
        try {
            p.setPreco(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("> Setter com nome vazio:");
        try {
            p.setNome("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("> Construtor com dados inválidos:");
        try {
            new Produto(null, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        p.exibirResumo();                       

        System.out.println("=== CASOS EXTREMOS ===");
        System.out.println("> Adicionar 0:");
        p.adicionarEstoque(0);

        System.out.println("> Vender 0:");
        p.vender(0);

        System.out.println("> Vender exatamente todo o estoque (30):");
        p.vender(30);                           
        p.exibirResumo();

        System.out.println("> Vender com estoque zerado:");
        p.vender(1);                            

        System.out.println("> Produto grátis (preço 0):");
        Produto brinde = new Produto("Brinde", 0);
        brinde.exibirResumo();

        System.out.println("> Overflow de estoque:");
        Produto limite = new Produto("Item Limite", 1.0);
        limite.adicionarEstoque(Integer.MAX_VALUE);   
        limite.adicionarEstoque(1);                   
        limite.exibirResumo();

        System.out.println("=== RESUMO FINAL ===");
        p.exibirResumo();
    }
}