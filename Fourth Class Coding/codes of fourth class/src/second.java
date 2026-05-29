public class second extends first{


        int speed;


        second(String nam, String type, int id, int speed) {
            super(nam, type, id); // call first class constructor
            this.speed = speed;
        }


        public void pd2() {
            super.pd1(); // call parent method
            System.out.println("speed= " + this.speed);
        }


        int getspeed() {  super.getid();
            return this.speed;
        }

    }

