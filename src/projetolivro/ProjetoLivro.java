package projetolivro;
public class ProjetoLivro {
    public static void main ( String [] args){

        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro[3];

        p[0] = new Pessoa("Marcos",30,"M");
        p[1] = new Pessoa("Marcia",40,"F");

        l[0]= new Livro("Aprendendo Java","Jose Jaime",300,p[0]);
        l[1]= new Livro("POO para iniciantes","Pedro Paulo",500,p[1]);
        l[2]= new Livro("Java Avancado","Mariano ",800,p[0]);


        l[0].abrir();
        l[0].folhear(400);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println();
        System.out.println(l[2].detalhes());

        //Alteração Teste


    }
}
