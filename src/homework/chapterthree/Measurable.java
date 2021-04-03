package homework.chapterthree;

public interface Measurable {

    int getMeasure();

    static double average (Measurable[] m) {
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i].getMeasure();
        }
        return sum / m.length;
    }

    static Measurable largest (Measurable[] m){
        Measurable max = m[0];
        for(int i = 1; i < m.length; i++){
            if(m[i].getMeasure() > max.getMeasure()){
                max = m[i];
            }
        }
        return max;
    }
}
