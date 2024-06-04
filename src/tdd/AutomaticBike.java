package tdd;

public class AutomaticBike {
    private boolean startEngine;
    private int gear = 1;
    private int speed;

    public void key() {
        startEngine = !startEngine;
    }

    public boolean isOn(){
        return startEngine;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }


    public void accelerate() {
        if (speed >= 0 && speed < 20){
            speed += 1;
            gear = 1;
        }

       else if(speed >= 20 && speed < 30){
            speed += 2;
            gear = 2;
        }


        else if(speed >= 30 && speed < 41){
            speed += 3;
            gear = 3;
        }
        else{
            speed += 4;
            gear = 4;
        }
    }



    public void decelerate() {
        if (speed >= 0 && speed <= 20) {
            speed -= 1;
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            speed -= 2;
            gear = 2;

        } else if (speed >= 31 && speed <= 40) {
            speed -= 3;
            gear = 3;
        }

    else {
        speed -= 4;
        gear = 4;
    }


}}
