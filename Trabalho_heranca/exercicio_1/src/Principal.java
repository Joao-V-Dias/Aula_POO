public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setCodigo(101010);
        pessoa1.setDataCadastro("20/03/2025");

        System.out.println("Pessoas");

        System.out.println("A pessoa com o nome de " + pessoa1.getNome()
                + ", com o codigo " + pessoa1.getCodigo() + ", realizou o cadastro na data "
                + pessoa1.getDataCadastro());

        System.out.println("**********************************");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setCodigo(20202);
        pessoa2.setDataCadastro("21/03/2025");

        System.out.println("A pessoa com o nome de " + pessoa2.getNome()
                + ", com o codigo " + pessoa2.getCodigo() + ", realizou o cadastro na data "
                + pessoa2.getDataCadastro());

        System.out.println("**********************************");

        System.out.println("Clientes");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jose");
        cliente1.setCodigo(7823);
        cliente1.setDataCadastro("10/02/2020");
        cliente1.setEmail("jose@gmail.com");
        cliente1.setEndereco("Rua Vargas, Bairro Centro");
        cliente1.setTelefone("34 9999-7842");

        System.out.println("Dados de cliente");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Código: " + cliente1.getCodigo());
        System.out.println("Data de cadastro: " + cliente1.getDataCadastro());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Endereco: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());

        System.out.println("**********************************");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Bia");
        cliente2.setCodigo(2343);
        cliente2.setDataCadastro("14/01/2019");
        cliente2.setEmail("bia@gmail.com");
        cliente2.setEndereco("Rua 5, Bairro Jardim Sul");
        cliente2.setTelefone("34 9959-3234");

        System.out.println("Dados de cliente");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Código: " + cliente2.getCodigo());
        System.out.println("Data de cadastro: " + cliente2.getDataCadastro());
        System.out.println("Email: " + cliente2.getEmail());
        System.out.println("Endereco: " + cliente2.getEndereco());
        System.out.println("Telefone: " + cliente2.getTelefone());

        System.out.println("**********************************");

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Gabriel");
        usuario1.setCodigo(2317);
        usuario1.setDataCadastro("01/01/2017");
        usuario1.setLogin("gabriel340");
        usuario1.setSenha("Mudar123*");

        System.out.println("Dados do Usuario");
        System.out.println("Nome: " + usuario1.getNome());
        System.out.println("Código: " + usuario1.getCodigo());
        System.out.println("Data de cadastro: " + usuario1.getDataCadastro());
        System.out.println("Login: " + usuario1.getLogin());
        System.out.println("Senha: " + usuario1.getSenha());

        System.out.println("**********************************");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Jonas");
        usuario2.setCodigo(641);
        usuario2.setDataCadastro("08/04/2018");
        usuario2.setLogin("jonas329");
        usuario2.setSenha("Teste123*");

        System.out.println("Dados do Usuario");
        System.out.println("Nome: " + usuario2.getNome());
        System.out.println("Código: " + usuario2.getCodigo());
        System.out.println("Data de cadastro: " + usuario2.getDataCadastro());
        System.out.println("Login: " + usuario2.getLogin());
        System.out.println("Senha: " + usuario2.getSenha());
    }
}