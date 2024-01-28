package classes;

public class Sports {
    private int burpeeCount;
    private int pushupCount;
    private int situpCount;
    private int squatCount;

    public Sports(int burpeeCount, int pushupCount, int situpCount, int squatCount) {
        this.burpeeCount = burpeeCount;
        this.pushupCount = pushupCount;
        this.situpCount = situpCount;
        this.squatCount = squatCount;
    }

    // Methods Start
    public void makeMove(String exerciseType, int number) {
        if (exerciseType.equals("Burpee")) {
            doBurpees(number);
        } else if (exerciseType.equals("Pushup")) {
            doPushups(number);
        } else if (exerciseType.equals("Situp")) {
            doSitups(number);
        } else if (exerciseType.equals("Squat")) {
            doSquats(number);
        } else {
            System.out.println("Invalid exercise type");
        }
    }

    public void doBurpees(int number) {
        if (burpeeCount == 0) {
            System.out.println("Burpee exercise completed");
        }
        if (burpeeCount - number < 0) {
            System.out.println("You exceeded your target number of burpees. Congratulations");
            burpeeCount = 0;
        } else {
            burpeeCount -= number;
        }
        System.out.println("Remaining: " + burpeeCount);
    }

    public void doPushups(int number) {
        if (pushupCount == 0) {
            System.out.println("Pushup exercise completed");
        }
        if (pushupCount - number < 0) {
            System.out.println("You exceeded your target number of pushups. Congratulations");
            pushupCount = 0;
        } else {
            pushupCount -= number;
        }
        System.out.println("Remaining: " + pushupCount);
    }

    public void doSitups(int number) {
        if (situpCount == 0) {
            System.out.println("Situp exercise completed");
        }
        if (situpCount - number < 0) {
            System.out.println("You exceeded your target number of situps. Congratulations");
            situpCount = 0;
        } else {
            situpCount -= number;
        }
        System.out.println("Remaining: " + situpCount);
    }

    public void doSquats(int number) {
        if (squatCount == 0) {
            System.out.println("Squat exercise completed");
        }
        if (squatCount - number < 0) {
            System.out.println("You exceeded your target number of squats. Congratulations");
            squatCount = 0;
        } else {
            squatCount -= number;
        }
        System.out.println("Remaining: " + squatCount);
    }

    public boolean trainingIsOver() {
        return (burpeeCount == 0) && (pushupCount == 0) && (situpCount == 0) && (squatCount == 0);
    }
    // Methods End

    public int getBurpeeCount() {
        return burpeeCount;
    }

    public void setBurpeeCount(int burpeeCount) {
        this.burpeeCount = burpeeCount;
    }

    public int getPushupCount() {
        return pushupCount;
    }

    public void setPushupCount(int pushupCount) {
        this.pushupCount = pushupCount;
    }

    public int getSitupCount() {
        return situpCount;
    }

    public void setSitupCount(int situpCount) {
        this.situpCount = situpCount;
    }

    public int getSquatCount() {
        return squatCount;
    }

    public void setSquatCount(int squatCount) {
        this.squatCount = squatCount;
    }
}
