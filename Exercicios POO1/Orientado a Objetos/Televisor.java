package com.objetos.orientacao.andre;

public class Televisor {

	private int canal;
	private int volume;
	
	public Televisor(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public int Canal(int canal) {
		setCanal(canal);
		
		return canal;
	}
	
	public int AumentaVolume(int volume) {
		setVolume(volume);
		
		return volume;
	}
	
	public int DiminuiVolume(int volume) {
		setVolume(volume);
		
		return volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Televisor [canal=");
		builder.append(canal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
