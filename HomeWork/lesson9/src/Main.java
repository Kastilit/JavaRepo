import java.util.Scanner;
import java.util.Random;

// Класс Телевизор
class Television {
    // Приватные поля
    private String brand;
    private int screenSize; // в дюймах
    private boolean isSmart;
    private int currentChannel;
    private int volume;
    private boolean isOn;

    // Конструктор
    public Television(String brand, int screenSize, boolean isSmart) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
        this.currentChannel = 1;
        this.volume = 50;
        this.isOn = false;
    }

    // Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }

    // Методы управления телевизором
    public void powerOn() {
        isOn = true;
        System.out.println("Телевизор " + brand + " включен");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Телевизор " + brand + " выключен");
    }

    public void changeChannel(int channel) {
        if (isOn) {
            currentChannel = channel;
            System.out.println("Переключили на канал " + channel);
        } else {
            System.out.println("Телевизор выключен, нельзя сменить канал");
        }
    }

    public void volumeUp() {
        if (isOn && volume < 100) {
            volume++;
            System.out.println("Громкость: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println("Громкость: " + volume);
        }
    }

    @Override
    public String toString() {
        return "Телевизор " + brand +
                ", размер: " + screenSize + "''" +
                ", " + (isSmart ? "Smart TV" : "обычный") +
                ", " + (isOn ? "включен" : "выключен") +
                ", канал: " + currentChannel +
                ", громкость: " + volume;
    }
}

