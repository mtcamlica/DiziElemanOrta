public class Main {
    public static void main(String[] args) {
        int [] list = {17,4,12,4,97,6,45,5,33,5,688,9};
        double sum = 0;
        for (int i =0; i<list.length; i++) {
            sum += list[i];
        }

        double avarage = sum / list.length;
        System.out.println(avarage);
    }
}
