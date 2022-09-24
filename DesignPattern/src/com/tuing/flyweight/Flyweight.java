package com.tuing.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Flyweight {

    public static void main(String[] args) {
        Tree tree1 = TreeFactory.getTreeByName("aa", "xxx");
        Tree tree2 = TreeFactory.getTreeByName("bb", "yyy");
        Tree tree3 = TreeFactory.getTreeByName("aa", "zzz");

        TreeNode treeNode1 = new TreeNode(5, 10, tree1);
        TreeNode treeNode2 = new TreeNode(8, 8, tree2);
        TreeNode treeNode3 = new TreeNode(6, 4, tree3);
        System.out.println(treeNode1);
        System.out.println(treeNode2);
        System.out.println(treeNode3);


    }

}

class TreeNode{

    private int x;
    private int y;
    private Tree tree;

    public TreeNode(int x, int y, Tree tree){
        this.x = x;
        this.y = y;
        this.tree = tree;
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "x=" + x +
                ", y=" + y +
                ", tree=" + tree +
                '}';
    }
}


class Tree{
    String name ;
    String data ;

    public Tree(String name, String data){
        this.name = name;
        this.data = data;
    }

}

class TreeFactory{
    static Map<String, Tree> map = new ConcurrentHashMap();

    public static Tree getTreeByName(String name, String data){
        if (map.containsKey(name)){
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name, tree);
        return tree;
    }
}
