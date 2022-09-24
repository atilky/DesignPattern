package com.atguigu.prototype.deepcopy;

import java.io.*;

/**
 * 第一層
 */
public class DeepProtoType implements Cloneable, Serializable {

    private String name;

    private DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    /**
     * 深拷貝方式1 - 使用clone
     * @return
     */
    @Override
    protected Object clone()  {
        DeepProtoType deepProtoType = null;
        try {
            deepProtoType = (DeepProtoType)super.clone();
            //針對第二層,做copy
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        }catch (CloneNotSupportedException e){
            System.out.println("DeepProtoType clone fail");

        }

        return deepProtoType;
    }

    /**
     * 拷貝方式2 - 通過對象的序列化實現()
     */
    public Object deepClone(){

        ByteArrayOutputStream bos = null; //輸出流
        ObjectOutputStream oos = null;    //對象的輸出流

        ByteArrayInputStream bis = null; //輸入流
        ObjectInputStream ois = null;     //對象的輸入流

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //將此class用 對象流的方式輸出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepProtoType)ois.readObject();
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }
        return null;
    }



}
