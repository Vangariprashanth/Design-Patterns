enum Status{
    Running, Failed, Pending, Success;
}

public class EnumPractice {
    public static void main(String[] args) {
        Status S = Status.Success;
        System.out.println(S);
    }
}
