package codeBreaker;

public class CodeBreaker {
	private String valorGeneral="1234";
	
	public String acertar(String posibleValor){
		
		String respuestaX = "", respuesta_="";
		
	
		for (int i=0; i<posibleValor.length(); i++)
		{
			if(posibleValor.charAt(i)==valorGeneral.charAt(i))
			{
				respuestaX+="x";
			}
			else if(valorGeneral.contains(posibleValor.charAt(i)+""))
			{
				respuesta_+="_";
			}
		}
					
		
		return respuestaX+respuesta_;
	}
}

