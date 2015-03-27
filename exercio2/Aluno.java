public class Aluno{
	int  idade;
	String nome, matricula;
	

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Matricula: " + this.matricula);
  }
		
		

	public static void main (String [] args){
		Aluno um = new Aluno();
		um.nome= "Eddie Vedder";
		um.idade= 50;
		um.matricula="1111234345";

		Aluno dois = new Aluno();
		dois.nome= "Kurt Cobain";
		dois.idade= 27;
		dois.matricula="2124535565";

		Aluno tres = new Aluno();
		tres.nome= "Layne Staley";
		tres.idade= 34;
		tres.matricula="201318110159";
		
		Aluno quatro = new Aluno();
		quatro.nome= "Chris Cornell";
		quatro.idade= 51;
		quatro.matricula="201318110159";

		um.imprimirDadosCadastrais();
		dois.imprimirDadosCadastrais();
		tres.imprimirDadosCadastrais();
		quatro.imprimirDadosCadastrais();


  }

}
