class Triangulo{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public void areaT(){
        double resultadoA = (base*altura)/2;

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

    public void perimetroT(){
        double resultadoP = lado1 + lado2 + base;

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