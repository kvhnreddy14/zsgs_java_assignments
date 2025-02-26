package assignments.assignment_datatypes;

public class AvgWeightOfTenPeople_6 {
    public static void main(String[] args){
        float[] weights = new float[] {77.5f, 86.6f, 95.23f, 67.33f, 55.6f, 77.5f, 86.6f, 95.23f, 67.33f, 55.6f};
        float total_weight = 0;
        for(float weight : weights){
            total_weight += weight;
        }
        float avg_weight = (total_weight / weights.length);
        System.out.println(avg_weight);
    }
}
