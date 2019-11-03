package com.learn.designpatterns.creational.builderPattern;

public class Computer {
    private String HDD;
    private String RAM;

    private boolean isBluetoothEnabled;
    private boolean isGraphicsEnabled;

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                '}';
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public Computer(BuilderComputer builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
    }

    public static class BuilderComputer{
        private String HDD;
        private String RAM;

        private boolean isBluetoothEnabled;
        private boolean isGraphicsEnabled;

        @Override
        public String toString() {
            return "BuilderComputer{" +
                    "HDD='" + HDD + '\'' +
                    ", RAM='" + RAM + '\'' +
                    ", isBluetoothEnabled=" + isBluetoothEnabled +
                    ", isGraphicsEnabled=" + isGraphicsEnabled +
                    '}';
        }

        public BuilderComputer(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public BuilderComputer setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            System.out.println(this);
            return this;
        }

        public BuilderComputer setGraphicsEnabled(boolean graphicsEnabled) {
            isGraphicsEnabled = graphicsEnabled;
            return this;
        }

        public Computer build(){
            System.out.println(this);
            return new Computer(this);
        }
    }
}
