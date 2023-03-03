public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        imprimirConsole(minhaPilha);

        imprimirConsole(minhaPilha.pop());

        imprimirConsole(minhaPilha);

        minhaPilha.push(new No(99));
        imprimirConsole(minhaPilha);
    }

    private static void imprimirConsole(Object obj) {
        System.out.println(obj);
    }
}