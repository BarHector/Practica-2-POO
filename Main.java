import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nao = new Scanner(System.in);
        
        double lado = 0, altura=0, base=0;
        String opc;
        
        opc = nao.next();
        switch (opc){
            case "T": double lado1, lado2; 
                    lado1 = nao.nextDouble();
                    lado2 = nao.nextDouble();
                    base = nao.nextDouble();
                    altura = nao.nextDouble();
                    nao.close();
                    Triangulo tri = new Triangulo(lado1, lado2, base, altura);
                    tri.perimetroT();
                    tri.areaT();
                    break; 
            
            case "S": lado = nao.nextDouble();
                    nao.close();
                    Cuadrado c = new Cuadrado(lado);
                    c.perimetro();
                    c.area();
                    break;
            
            case "R": base = nao.nextDouble();
                    altura = nao.nextDouble();
                    nao.close();
                    Rectangulo re = new Rectangulo(base, altura);
                    re.perimetroR();
                    re.areaR();
                    break;
            
            case "A": double dMayor, dMenor; 
                    lado = nao.nextDouble();
                    dMayor = nao.nextDouble();
                    dMenor = nao.nextDouble();
                    Rombo rom = new Rombo(lado, dMayor, dMenor);
                    rom.perimetroA();
                    rom.areaA();
                    break;
            
            case "B": base = nao.nextDouble();
                    altura = nao.nextDouble();
                    lado = nao.nextDouble();
                    Romboide rim = new Romboide(base, altura, lado);
                    rim.perimetroB();
                    rim.areaB();
                    break;
            
            case "D": double bMayor, bMenor;
                    bMayor = nao.nextDouble();
                    bMenor = nao.nextDouble();
                    altura = nao.nextDouble();
                    lado = nao.nextDouble();
                    Trapecio trap = new Trapecio(bMayor, bMenor, altura, lado);
                    trap.perimetroD();
                    trap.areaD();
                    break;
            
            case "P": double numLados, apotema;
                    numLados = nao.nextDouble();
                    lado = nao.nextDouble();
                    apotema = nao.nextDouble();
                    Poligono poli = new Poligono(numLados, lado, apotema);
                    poli.perimetroP();
                    poli.areaP();
                    break;
            
            case "C": double radio;
                    radio = nao.nextDouble();
                    Circulo ci = new Circulo(radio);
                    ci.perimetroC();
                    ci.areaC();
                    break;                    

            default: System.out.println("Letra invalida");
                break;
        }
    }    
}
