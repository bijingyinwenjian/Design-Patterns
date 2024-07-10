package com.sky.builder;

public class Computer {
    private String cpu;
    private String zhuban;
    private String ram;
    private String disk;

    public Computer(String cpu, String zhuban, String ram, String disk) {
        this.cpu = cpu;
        this.zhuban = zhuban;
        this.ram = ram;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getZhuban() {
        return zhuban;
    }

    public void setZhuban(String zhuban) {
        this.zhuban = zhuban;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", zhuban='" + zhuban + '\'' +
                ", ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.zhuban = builder.zhuban;
        this.ram = builder.ram;
        this.disk = builder.disk;
    }

    public static final class Builder{
        private String cpu;
        private String zhuban;
        private String ram;
        private String disk;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder zhuban(String zhuban){
            this.zhuban = zhuban;
            return this;
        }

        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }

        public Builder disk(String disk){
            this.disk = disk;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
