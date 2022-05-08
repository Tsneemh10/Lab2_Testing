public class Watch {

    private int m,h,D,M,Y;

    private String state,state1;

    public Watch() {
        this.state = "NORMAL";
        this.state1 = "TIME";
        this.m = 0;
        this.h = 0;
        this.D = 1;
        this.M = 1;
        this.Y = 2000;
    }

    public void switchState(String input) {
        switch (this.state) {
            case "NORMAL" -> {
                if (input.equals("c")) {
                    this.state = "UPDATE";
                    this.state1 = "MIN";
                }
                else if (input.equals("b")) {
                    this.state = "ALARM";
                    this.state1 = "ALARM1";
                }
                else if (input.equals("a"))
                    this.state1 = (this.state1.equals("TIME")) ? "DATE" : "TIME";

            }
            case "UPDATE" -> {
                if (input.equals("a")) {
                    if (this.state1.equals("MIN")) this.state1 = "HOUR";
                    else if (this.state1.equals("HOUR")) this.state1 = "DAY";
                    else if (this.state1.equals("DAY")) this.state1 = "MONTH";
                    else if (this.state1.equals("MONTH")) this.state1 = "YEAR";
                    else if (this.state1.equals("YEAR")) {
                        this.state = "NORMAL";
                        this.state1 = "TIME";
                    }
                }
                else if (input.equals("b")) {
                    if (this.state1.equals("MIN")) {
                        this.m++;
                        if (this.m > 59) this.m = 0;

                    }
                    else if (this.state1.equals("HOUR")) {
                        this.h++;
                        if (this.h > 23) this.h = 0;

                    }
                    else if (this.state1.equals("DAY")) {
                        this.D++;
                        if (this.D > 31) this.D = 1;

                    }
                    else if (this.state1.equals("MONTH")) {
                        this.M++;
                        if (this.M > 12) this.M = 1;

                    }
                    else if (this.state1.equals("YEAR")) {
                        this.Y++;
                        if(this.Y > 2099) this.Y = 2000;
                    }
                }

                else if (input.equals("d")) {
                    this.state = "NORMAL";
                    this.state1 = "TIME";
                }

            }
            case "ALARM" -> {
                if (input.equals("d")) { this.state = "NORMAL"; this.state1= "TIME"; }
                else if (input.equals("a"))
                    if (this.state1.equals("ALARM1")) this.state1 = "CHIME";

            }
        }
    }

    public void DisplayDate() {
        System.out.println(this.Y + "-" + this.M + "-" + this.D);
    }

    public void DisplayTime() {
        System.out.println(((this.h < 10) ? "0"+this.h:this.h) + ":" + ((this.m < 10) ? "0"+this.m:this.m));
    }

    public String getState() {
        return this.state;
    }
    public String getState1() {
        return this.state1;
    }


}
