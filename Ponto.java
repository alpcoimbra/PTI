package PTI;

public class Ponto {
	
	private int x;
	private int y;
			
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Ponto() {
		this.x = 0;
		this.y = 0;
	};
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int distancia(int pontoXb, int pontoXa) {
		//D = ((Xb - Xa)^2 + (Yb - Ya)^2)
		Ponto pontoY = new Ponto();
		return (int)Math.sqrt((Math.pow(pontoXb - pontoXa, 2)) + (Math.pow(pontoY.getX() - pontoY.getY(), 2)));
	}
	
	
	// se a distancia entre eles for igual a 0, os pontos são iguais
	public String igual(int pontoX, int pontoY, Ponto ponto) {
		if (ponto.distancia(pontoX, pontoY) == 0) {
			return " e os numeros sao iguais";
		} else {
			return " e os numero sao diferentes";
		}
		
	}
	
	
}
