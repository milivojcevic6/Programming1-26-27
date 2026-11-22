//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //izpisKvadrata();
    izrisTrikotnik();
    spodnjiLevi();
    desniZgornji();
    //preberiNiz("kruh in mleko");
    //vsebujeCrko(" A Danes je lep dan gospod kaplan!");
    //obrniString("banana");
    //zamenjava("banana");
    int[] polje = {2, 3, 4};
    //spremeni(polje);
    //stevecPresledkov("Konj je travo");
    //
    vsebuje("Slovenija", "love");


    //
    //polja - arrrayi
    //2 nacina - 1. nacin - vemo kateri elementi so notri ze od zacetka
    int[] polje1 = {2, 4, 6, 8};
    //2. nacin - vemo koliko bo elementov
    int[] polje2 = new int[5];
    polje2[0] = 22;
    String[] besede = {"avto", "bus", "kolo"};
    String[][] polje3 = {{"avto", "kolo"}, {"bus", "motor"}};

    System.out.println(Arrays.toString(besede));
    System.out.println(Arrays.deepToString(polje3));

    izpisStevil();
    System.out.println();
    System.out.println();
    izpisStevi();
    System.out.println();
    System.out.println(izpisProdukt(polje1));
    System.out.println(najvecje(polje1));


    //branje polj s Scannerjem
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] polja = new int[length];
    for (int i = 0; i < polja.length; i++){
        polja[i] = scanner.nextInt();
    }

    System.out.println(Arrays.toString(polja));
}

//zvezdice
public static void izpisKvadrata(){
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            System.out.print(" x ");
        }
        System.out.println();
    }
}

//zgornji levi trikotnik
public static void izrisTrikotnik(){
    for (int i = 0; i < 5; i++){
        for (int j = 4; j>=i; j--){
            System.out.print(" x ");
        }
        System.out.println();
    }
}

//spodnji levi trikotnik
public static void spodnjiLevi(){
    for(int i = 0; i < 5; i++){
        for(int j = 0; j <= i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}

//desni zgornji trikotnik
public static void desniZgornji(){
    for(int i = 0; i < 5; i++){
        for(int j = 0; j < 5; j++){
            if(j<i){
                System.out.print("   ");
            } else System.out.print(" + ");
        }
        System.out.println();
    }
}

//izpisi vsako drugo črko v prebranem stringu
public static void preberiNiz(String beseda){
    String izpis = "";
    for(int i = 0; i <= beseda.length()-1; i ++){
        if(i%2!=0){
            izpis += beseda.charAt(i);
        }
    }
    System.out.println(izpis);
}

//izpisi vsako besedo, ki vsebuje "a"
public static void vsebujeCrko(String stavek){
    String[] stavki = stavek.split(" ");
    for(int i = 0; i < stavki.length; i++){
        if(stavki[i].toLowerCase().contains("a")){
            System.out.print(" " + stavki[i] + " ");
        }
    }
    System.out.println();
}

//obrni string
public static void obrniString(String beseda){
    String obrnjen = "";
    for(int i = beseda.length()-1; i>= 0; i--){
        obrnjen += beseda.charAt(i);

    }
    System.out.println(obrnjen);
}

//zamenjaj crko a z "22"
public static void zamenjava(String stavek){

    System.out.println(stavek.replace("a","22"));

}

//napisi metodo, ki sprejme polje stevk (najvec 3) in jih spremeni v eno stevilo [2, 3, 5] -> 235
public static void spremeni(int[] polje){
    int stevilo = 0;
    for(int i = 0; i < polje.length; i++){
        stevilo = stevilo + polje[i];
        if (i != polje.length-1 )
            stevilo = stevilo * 10;
    }
    System.out.println(stevilo);
}

//napisi metodo, ki sprejme stavek in izpise koliko je presledkov
public static void stevecPresledkov(String stavek){
    int stevec = 0;
    for(int i = 0; i < stavek.length(); i++){
        if(stavek.charAt(i) == ' '){
            stevec++;
        }
    }
    System.out.println(stevec);
}

//napisi metodo, ki sprejme 2 besedi, če se katerakoli izmed njiju vsebujeta, potem izpisi "YES", če ne "NO"
public static void vsebuje(String beseda1, String beseda2){
    if(beseda1.contains(beseda2) || beseda2.contains(beseda1)){
        System.out.println("YES");
    }
    else System.out.println("NO");
}

//napisi metodo, ki izpise stevila od 1 do 10
public static void izpisStevil(){
    for (int i = 1; i <= 10; i++){
        System.out.print(i + " ");
    }
}

//napisi metodo, ki izpise stevila od 9 do 3
public static void izpisStevi(){
    for (int i = 9; i >= 3; i--){
        System.out.print(i + " ");
    }
}
//napisi metodo 1. nacin: izpisi soda stevila, tako da v pogoju ima korak dva od 0 do 12
public static void izpisStevil2(){
    for (int i = 0; i <= 12; i = i +2){
        System.out.print(i + " ");
    }
}

//2.nacin: soda stevila s pogojnim stavkom in sicer od 0 do 12
public static void izpisStevilSoda(){
    for (int i = 0; i <= 12; i++){
        if (i % 2 == 0){
            System.out.print(i + " ");
        }
    }
}

//napisi metodo, ki sprejme polje in vrne sestevek vseh elementov
public static int izpisSestevek(int [] polje){
    int vsota  =0;
    for(int i = 0; i < polje.length; i++){
        vsota += polje[i];
    }
    return vsota;
}
//napisi metodo, ki sprejme polje in pomnozi stevilo na vsakem drugem mestu, ter vrne rezultat
public static int izpisProdukt(int [] polje){
    int produkt = 1;
    for(int i = 1; i < polje.length; i = i+2){
        produkt *= polje[i];
    }
    return produkt;
}
// napisi metodo, ki sprejme dve stevili, a in b in izpise stevila od a do b
public static void izpisOdDo(int a, int b){
    for (int i =a; i <= b; i++){
        System.out.println(i);
    }
}
//napisi metodo, ki sprejme array in vrne najvecje stevilo
public static int najvecje(int[] polje){
    int max = polje[0];
    for (int i = 1; i < polje.length; i++){
        if (polje[i] > max){
            max = polje[i];
        }
    }
    return max;
}

//napisi metodo, ki sprejme besedo in jo obrne (lahko naredite na vec nacinov - tukaj naredite s for zanko!)
public static void izpisObrne(String beseda){
    for (int i = beseda.length()-1; i >= 0; i--){
        System.out.print(beseda.charAt(i));
    }
    System.out.println();
}