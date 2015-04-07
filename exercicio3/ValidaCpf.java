import java.util.Scanner;
public class ValidaCpf {
    
    // Faz a leitura dos nove primeiros dígitos do CPF como string. 
    
    public String leitura(){
        Scanner input = new Scanner( System.in );
        String cpf = input.next();
        return cpf;
    }
    
    // Transforma os dígitos lidos em string para números inteiros, em um vetor.
    
    public int[] Caractere(String p){
        int[] v = new int[11];
        for (int i = 0; i < 9; i++) {
            char caracter = p.charAt(i);
            v[i] = Character.getNumericValue(caracter);
        }
        return v;
    }
    
    // De acordo com os nove dígitos fornecidos, calcula o décimo dígito. 
    
    public int digito11(int[] v){
        int j = 10, x =0, i;
        for (i = 9; i > 0; i--) {
            x =+ v[i] * (j--);
        }    
            if( x % 11 < 2){
                v[9] = 0;
            }else{
                v[9] = (11-(x % 11));
            }
        return v[9];
    }
    
   // A partir dos nove dígitos fornecidos, mais o décimo dígito calculado, calcula o décimo primeiro dígito. 
    
    public int digito11(int[] v){
        int i, x, j = 11, y = 0;
        for (i = 10; i > 0; i--) {
            x =+ v[i] * (j--);
        }
        if( y % 11 < 2){
            v[10] = 0;
        }else{
            v[10] = (11-(y%11));
        }
        return v[10];
    }
    
    
    public static void main (String[] args){
        int[] v = new int[11];
        Cpf n = new Cpf();
        String p;
        p = n.leitura();
        v = n.Caractere(q);
        v[9] = n.digito10(v);
        v[10] = n.digito11(v);
        System.out.print("CPF completo: ");
        int i = 0;
        for (i = 0; i<11 ;i++){
            System.out.print(v[i]);
        }
    }
    
}
