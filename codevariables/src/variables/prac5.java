package variables;

public class prac5 {
    static int arr[]={11,22,33};
    static int arr2[]={11,22,33,44,55};
    static int ptr[];
    public static void main(String[] args) {
//        static int arr[]={11,22,33};
//        static int arr2[]={11,22,33,44,55};
//        static int ptr[];
        ptr=arr; //3
        arr=arr2;//5
        arr2=ptr;//3
        System.out.println(arr.length + "");//5
        System.out.println(arr2.length);//3
    }
}
