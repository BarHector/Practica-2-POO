class Circulo {
    private double radio;
    final double pi = 3.1416;

    public Circulo(double radio){
        this.radio = radio;
    }

    public void areaC(){
        double resultadoA = pi*(radio*radio);
        
        if(resultadoA %1==0){
            System.out.print("\nAREA: " + (int)resultadoA);
        }else{
            System.out.print("\nAREA: ");
            
            String resultadoAS = String.valueOf(resultadoA);
            int indice = resultadoAS.indexOf('.');
            // double resultadoAA = Double.parseDouble(resultadoAS.substring(0, indice+2));

            // System.out.print(resultadoAA);
            double resultadoAA = 0;/*= Double.parseDouble(resultadoPS.substring(0, indice+2))*/;

			if(resultadoAS.length() >= indice+3){
				/*double*/ resultadoAA = Double.parseDouble(resultadoAS.substring(0, indice+3));
			}else{
				resultadoAA =  Double.parseDouble(resultadoAS.substring(0, indice+2));
			}

            System.out.print(resultadoAA);
        }
    }

    public void perimetroC(){
        double resultadoP = 2*(pi*radio);

        if(resultadoP %1==0){
            System.out.print("PERIMETRO: " + (int)resultadoP);
        }else{
            System.out.print("PERIMETRO: ");
            
            String resultadoPS = String.valueOf(resultadoP);
            int indice = resultadoPS.indexOf('.');
            // double resultadoPP = Double.parseDouble(resultadoPS.substring(0, indice+2));

            // System.out.print(resultadoPP);
            double resultadoPP = 0;/*= Double.parseDouble(resultadoPS.substring(0, indice+2))*/;

			if(resultadoPS.length() >= indice+3){
				/*double*/ resultadoPP = Double.parseDouble(resultadoPS.substring(0, indice+3));
			}else{
				resultadoPP =  Double.parseDouble(resultadoPS.substring(0, indice+2));
			}

            System.out.print(resultadoPP);
        }
    }
}
