class fan {

    int speed = 1;
    boolean on = false;
    double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public boolean geton() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor(String color) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!on)
            return "the fan is off";
        return "fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';

    }
}
        class main{
            public static void main(String[] args) {
                int slow = 1;
                int medium = 2;
                int fast = 3;
                fan quat = new fan();
                quat.setColor("yellow");
                quat.setOn(true);
                quat.setspeed(fast);
                quat.setRadius(10);
                fan quat2= new fan();
                quat2.setOn(false);
                quat2.setspeed(medium);
                quat2.setRadius(5);
                quat2.setColor("Blue");
                System.out.println(quat.toString());
                System.out.println(quat2.toString());
            }
        }

