package function;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class CallKotlinFunction {

    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("John", "Ada", "Mole");
        System.out.println(SecondElementFromListKt.secondOrNull(list));
    }
}
