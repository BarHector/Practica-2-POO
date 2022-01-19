class Cuadrado {
	private double lado;
	
    public Cuadrado (double lado){
		this.lado = lado;
	}

	public void area(){
		double resultadoA = lado * lado;
		
		if(resultadoA%1==0){
            System.out.print("\nAREA: " + (int)resultadoA);
        }else{
			String resultadoAS = String.valueOf(resultadoA);
            int indice = resultadoAS.indexOf('.');
			double resultadoAA = 0;

			if(resultadoAS.length() >= indice+3){
				resultadoAA = Double.parseDouble(resultadoAS.substring(0, indice+3));
			}else{
				resultadoAA =  Double.parseDouble(resultadoAS.substring(0, indice+2));
			}

			System.out.print("\nAREA: ");
            System.out.print(resultadoAA);
        }
	}

	public void perimetro(){
		double resultadoP = lado*4;

		if(resultadoP %1==0){
            System.out.print("PERIMETRO: " + (int)resultadoP);
        }else{
			System.out.print("PERIMETRO: ");
            
            String resultadoPS = String.valueOf(resultadoP);
            int indice = resultadoPS.indexOf('.');
            double resultadoPP = 0;

			if(resultadoPS.length() >= indice+3){
				resultadoPP = Double.parseDouble(resultadoPS.substring(0, indice+3));
			}else{
				resultadoPP =  Double.parseDouble(resultadoPS.substring(0, indice+2));
			}

            System.out.print(resultadoPP);
        }
	}
}
