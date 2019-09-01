package assignment_1;
/**
 * A data-type which holds a student's name and their test scores.
 */

class Tests {
    private String firstName, lastName;
    private int[] scores;
    
    /**
     * Create a Tests object using an array of scores
     * @param firstName The student's first name
     * @param lastName The student's last name
     * @param scores An array of the student's test scores (0-100%)
     */
    public Tests(String firstName, String lastName, int ...scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores.clone();
    }

    /** 
     * @return The student's first name
     */
    public String getFirstName() {
        return this.firstName;
    }  
    /**
     * @return The student's last name
     */
    public String getLastName() {
        return this.lastName;
    }
    /** 
     * @return The student's first and last name, separated by a space
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    /** 
     * @return the scores array as a simple string
     * i.e. "85 50 76 32 99"
     */
    public String getScoreList() {
        String list = "";
        for (int i = 0; i < this.scores.length; i++) {
            list += this.scores[i] + " ";
        }
        return list.trim();
    }
    /** 
     * @return the average of the student's test scores
     */
    public double getAverage() {
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }
        return avg / scores.length;
    }
    /** 
     * @return the letter grade corresponding to the student's average
     */
    public String getLetterGrade() {
        double avg = getAverage();
        if (avg < 60)
            return "F";
        if (60 <= avg && avg < 70)
            return "D";
        if (70 <= avg && avg < 80)
            return "C";
        if (80 <= avg && avg < 90)
            return "B";
        if (90 <= avg)
            return "A";
        return "";
    }
    
    /**
     * A string formatted like: 
     * "John Smith - SCORES: [0 5 1 2 3 ] - AVG: 2.0 - GRADE: F"
     */
    public String toString() {
        String name = this.getFirstName() + " " + this.getLastName();
        String scoreList = "SCORES: [" + this.getScoreList() + "]";
        String average = "AVG: " + getAverage();
        String letterGrade = "GRADE: " + getLetterGrade();
        return String.join(" - ", 
            name,
            scoreList, 
            average, 
            letterGrade);
    }
    public static void main(String[] args) {
        Tests example = new Tests("", "Lasname", new int[]{98, 47, 85, 79, 82});
        System.out.println(example.toString());
    }
}