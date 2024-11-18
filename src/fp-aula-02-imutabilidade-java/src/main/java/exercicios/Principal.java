package exercicios;

/**
 * Classe para você testar suas implementações.
 * Veja o README para mais detalhes.
 */
public class Principal {
    public static void main(final String[] args) {
        // Exemplo de uso das classes e records criados:
        CidadeRecord cidadeRecord = new CidadeRecord("São Paulo");
        Cidade cidade = new Cidade("Rio de Janeiro");

        PessoaRecordShallow pessoaShallow = new PessoaRecordShallow("João", cidade);
        PessoaRecord pessoaImutavel = new PessoaRecord("Maria", cidadeRecord);

        System.out.println(pessoaShallow);
        System.out.println(pessoaImutavel);

        cidade.setNome("Curitiba");
        System.out.println("Cidade alterada em PessoaRecordShallow: " + pessoaShallow);
    }
}
