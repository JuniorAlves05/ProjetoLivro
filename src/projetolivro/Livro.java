package projetolivro;

public class Livro implements projetolivro.Publicacao {

    private String titulo;
    private String livro;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private projetolivro.Pessoa leitor;

    @Override
    public String detalhes() {
        return "Titulo Do " + " Livro  = " + titulo + "\n, autor ="
                + autor + "\n, totPaginas = " + totPaginas
                + "\n, pagAtual="+pagAtual + "\n, aberto ="
                + aberto + "\n, leitor = " + leitor.getNome()+
                "\n, idade = " + leitor.getIdade() +
                "\n, sexo  = " + leitor.getSexo();

    }

    public Livro(String titulo, String autor, int totPaginas, projetolivro.Pessoa leitor) {
        this.titulo=titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
            this.aberto=false;
        this.pagAtual=0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public projetolivro.Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(projetolivro.Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto=true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void folhear(int p) {
        if(p>this.totPaginas){
            this.pagAtual=0;
        }else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
