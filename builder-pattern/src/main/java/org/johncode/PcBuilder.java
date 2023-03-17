package org.johncode;

public class PcBuilder {
	private Pc myPc = new Pc();

	public PcBuilder setRAM(String ram) {
		myPc.setRam(ram);
		return this;
	}

	public PcBuilder setProcessor(String processor) {
		myPc.setProcessor(processor);
		return this;
	}


	public PcBuilder setPowerSupply(String powerSupply) {
		myPc.setPowerSupply(powerSupply);
		return this;
	}


	public PcBuilder setDisk(String disk) {
		myPc.setDisk(disk);
		return this;
	}

	public PcBuilder setRamSize(int ramSize) {
		if (ramSize < 0) {
			throw new IllegalArgumentException("Memory size must be at least 2 GB.");
		}
		myPc.setRamSize(ramSize);
		return this;
	}

	public PcBuilder setPowerVoltage(int powerVoltage) {
		myPc.setPowerVoltage(powerVoltage);
		return this;
	}

	public PcBuilder setDiskSize(int diskSize) {
		myPc.setDiskSize(diskSize);
		return this;
	}

	public PcBuilder setProcessorSize(int processorSize) {
		myPc.setProcessorSize(processorSize);
		return this;
	}

	public Pc build() {
		return myPc;
	}
}