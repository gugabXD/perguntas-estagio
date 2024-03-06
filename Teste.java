
import java.util.ArrayList;
public class Teste{
public static void main(String args[]){
   System.out.println(questao2(1597));
   System.out.println(questao2(1598));

   System.out.println(questao5("batata frita"));;
}

public static boolean questao2(int n){
    int a = 0; int b = 1; int c = 1;
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(a);
    lista.add(b);
    lista.add(c);
    while(c<n){
        a = b;
        b = c;
        c = a+b;
        lista.add(c);
    }
    if(lista.contains(n)) return true;
    return false;
}

public static String questao5(String s){
    int tamanho = s.length();
    String res = "";
    for(int i=tamanho-1; i>=0; i--){
        char c = s.charAt(i);
        res+=c;
    }
    return res;
}
}

