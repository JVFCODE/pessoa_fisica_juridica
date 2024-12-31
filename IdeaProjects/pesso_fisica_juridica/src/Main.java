import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void exibirDados();
}

class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica(String nome, String cpf, String rg, Date dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + sdf.format(dataNascimento));
    }
}

class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private Date dataFundacao;

    public PessoaJuridica(String nome, String cnpj, String razaoSocial, String inscricaoEstadual, Date dataFundacao) {
        super(nome);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataFundacao = dataFundacao;
    }

    @Override
    public void exibirDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Data de Fundação: " + sdf.format(dataFundacao));
    }
}

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João Silva", "123.456.789-00", "MG-12.345.678", new Date(90, 4, 5));
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Tech Solutions Ltda", "12.345.678/0001-99", "Tech Solutions", "1234567890", new Date(120, 0, 1));

        System.out.println("Pessoa Física:");
        pessoaFisica.exibirDados();

        System.out.println("\nPessoa Jurídica:");
        pessoaJuridica.exibirDados();
    }
}
