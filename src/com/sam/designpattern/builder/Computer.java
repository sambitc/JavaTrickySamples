package com.sam.designpattern.builder;

public class Computer {
	
	String compType;
	String ram;
	String hardDisk;
	
	// Optional
	String graphixCard;
	
	public Computer(ComputerBuilder builder) {
		// TODO Auto-generated constructor stub
	}
	
	static class ComputerBuilder {
		String compType;
		String ram;
		String hardDisk;
		
		
		
		// Optional
		String graphixCard;
		
		public ComputerBuilder(String compType, String ram, String hardDisk) {
//			super();
			this.compType = compType;
			this.ram = ram;
			this.hardDisk = hardDisk;
		}

		Computer build(){
			return new Computer(this);
		}

		public String getCompType() {
			return compType;
		}

		public void setCompType(String compType) {
			this.compType = compType;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}

		public String getHardDisk() {
			return hardDisk;
		}

		public void setHardDisk(String hardDisk) {
			this.hardDisk = hardDisk;
		}

		public String getGraphixCard() {
			return graphixCard;
		}

		public ComputerBuilder setGraphixCard(String graphixCard) {
			this.graphixCard = graphixCard;
			return this;
		}
		
		
	}
	
	public static void main(String args[]){
		Computer comp = new Computer.ComputerBuilder("", "", "").setGraphixCard("").build();
	}

}
