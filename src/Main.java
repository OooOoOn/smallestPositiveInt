public class Main {

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] A = new int[]{-1, 1, 1, 2, 2, 3, 6}; //4
        int[] B = new int[]{-25, -12, 2, 2, 2, 4, 6}; //3
        int[] C = new int[]{1, 1, 1, 2, 2, 3, 4}; //5
        int[] D = new int[]{5, 6, 7, 8}; //1   EJ LÖST!!!
        int[] E = new int[]{-5, -6, -7, -8}; //1     
        int[] F = new int[]{1, 3, 6, 4, 1, 2}; //5
        System.out.println("Smallest positive integer = " + s1.solution(A));
        System.out.println("Smallest positive integer = " + s1.solution(B));
        System.out.println("Smallest positive integer = " + s1.solution(C));
        System.out.println("Smallest positive integer = " + s1.solution(D));
        System.out.println("Smallest positive integer = " + s1.solution(E));
        System.out.println("Smallest positive integer = " + s1.solution(F));
    }
}
