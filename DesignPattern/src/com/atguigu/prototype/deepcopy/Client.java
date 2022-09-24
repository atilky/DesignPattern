package com.atguigu.prototype.deepcopy;

public class Client {

    public static void main(String[] args) {

        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("deepName", 18);
        DeepProtoType deepProtoType1 = new DeepProtoType("name", deepCloneableTarget);

        //深拷貝1
        DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType1.clone();
        //記憶體位置不同
        System.out.println(deepProtoType1.hashCode()); //1163157884
        System.out.println(deepProtoType2.hashCode()); //1956725890

        //深拷貝2
        DeepProtoType deepProtoType3 = (DeepProtoType)deepProtoType1.deepClone();
        System.out.println(deepProtoType1.hashCode()); //1163157884
        System.out.println(deepProtoType3.hashCode()); //1791741888
    }

}
