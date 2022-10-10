public class cc {
    double ss;

    cc(double x) {
        ss = x;
    }



        String letterGrade () {
        if (100 >= ss && ss >= 80) {
            return "A";
        } else if (80 >= ss && ss >= 70) {
            return "B";
        } else if (70 >= ss && ss >= 50) {
            return "C";
        } else if (50 >= ss && ss >= 40) {
            return "D";
        } else if (40 >= ss && ss >= 20) {
            return "E";
        } else if (20 >= ss && ss >= 0) {
            return "f";
        } else {
            return "soory , not valid";
        }

    }


    }



