package org.johncode;

public class Pc {
	private String ram;
	private String processor;
	private String powerSupply;
	private String disk;
	private int ramSize;
	private int powerVoltage;
	private int diskSize;
	private int processorSize;

	public Pc() {
	}

	public Pc(String ram, String processor, String powerSupply, String disk, int ramSize, int powerVoltage,
			  int diskSize, int processorSize) {
		this.ram = ram;
		this.processor = processor;
		this.powerSupply = powerSupply;
		this.disk = disk;
		this.ramSize = ramSize;
		this.powerVoltage = powerVoltage;
		this.diskSize = diskSize;
		this.processorSize = processorSize;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getPowerVoltage() {
		return powerVoltage;
	}

	public void setPowerVoltage(int powerVoltage) {
		this.powerVoltage = powerVoltage;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public int getProcessorSize() {
		return processorSize;
	}

	public void setProcessorSize(int processorSize) {
		this.processorSize = processorSize;
	}

	@Override
	public String toString() {
		return "Pc{" +
				"ram='" + ram + '\'' +
				", processor='" + processor + '\'' +
				", powerSupply='" + powerSupply + '\'' +
				", disk='" + disk + '\'' +
				", ramSize=" + ramSize +
				", powerVoltage=" + powerVoltage +
				", diskSize=" + diskSize +
				", processorSize=" + processorSize +
				'}';
	}
}