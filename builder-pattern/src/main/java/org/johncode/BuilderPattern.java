package org.johncode;

public class BuilderPattern {
	public static void main(String[] args) {
//		Pc pc = new PcBuilder()
//				.setProcessor("Intel i9 9900k")
//				.setRAM("Kingston")
//				.setDisk("Curve")
//				.setProcessorSize(-1) <-- this will throw an error due to the validation which we have in builder
//				.setRamSize(-11)
//				.setDiskSize(500)
//				.build();

		Pc newPc = new PcBuilder()
				.setProcessor("Intel i9 9900k")
				.setRAM("Kingston")
				.setDisk("Curve")
				.setProcessorSize(12)
				.setRamSize(12)
				.setDiskSize(500)
				.build();


		System.out.println(newPc.toString());
	}
}