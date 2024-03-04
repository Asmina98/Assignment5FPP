import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    //Constructor
    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }
    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double computePower() {
        return (ramSize * processorSpeed);
    }

    @Override
    public String toString() {
        return "Computer{" + "\'" +
                ", manufacturer=" + manufacturer + "\'" +
                ", processor=" + processor + "\'" +
                ", ramSize=" + ramSize + "\'" +
                ",processorSpeed=" + processorSpeed + "\'" +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ((obj == null) || (this.getClass() != obj.getClass())) return false;
        Computer comp = (Computer) obj;
        return (manufacturer.equals(comp.manufacturer) && processor.equals(comp.processor) &&
                (ramSize == comp.ramSize) && (processorSpeed == comp.processorSpeed));
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
