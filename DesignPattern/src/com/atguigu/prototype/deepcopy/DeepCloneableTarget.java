package com.atguigu.prototype.deepcopy;

import java.io.Serializable;

/**
 * 第
 */
public class DeepCloneableTarget implements Cloneable, Serializable {

    private String deepName;
    private int deepAge;

    public DeepCloneableTarget(String deepName, int deepAge) {
        this.deepName = deepName;
        this.deepAge = deepAge;
    }

    @Override
    protected Object clone()  {

        DeepCloneableTarget deepCloneableTarget = null;

        try {
            deepCloneableTarget = (DeepCloneableTarget)super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("DeepCloneableTarget clone fail");
        }

        return deepCloneableTarget;
    }
}
