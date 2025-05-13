package day4.examples;

class Desktop {

    String ram;
    String memory;
    String brand;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void print() {
        System.out.println("RAM-" + this.getRam());
        System.out.println("MEMORY-" + this.getMemory());
        System.out.println("BRAND-" + this.getBrand());
    }
}

abstract class DesktopBuilder {
    protected Desktop desktop = new Desktop();

    public abstract void buildRam();

    public abstract void buildMemory();

    public abstract void buildBrand();

    public Desktop getDesktop() {
        return desktop;
    }

//    For Chaining
//    public abstract DesktopBuilder buildRam();
//
//    public abstract DesktopBuilder buildMemory();
//
//    public abstract DesktopBuilder buildBrand();

}

class DellDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildRam() {
        desktop.setBrand("8GB");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("8GB");
    }

    @Override
    public void buildBrand() {
        desktop.setBrand("DELL");
    }
}

class HPDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildRam() {
        desktop.setBrand("16GB");
    }

    @Override
    public void buildMemory() {
        desktop.setMemory("16GB");
    }

    @Override
    public void buildBrand() {
        desktop.setBrand("HP");
    }
}

class Director {
    public static Desktop buildDesktop(DesktopBuilder desktopBuilder) {
        desktopBuilder.buildRam();
        desktopBuilder.buildBrand();
        desktopBuilder.buildMemory();
        return desktopBuilder.getDesktop();
    }
    // Builder with chaining

}


public class BuilderDesignPattern1 {
    public static void main(String[] args) {
        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop desktop = Director.buildDesktop(dellDesktopBuilder);
        desktop.print();
    }
}
