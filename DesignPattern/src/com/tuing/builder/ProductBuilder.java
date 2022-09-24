package com.tuing.builder;

/**
 * 建造者模式
 */
public class ProductBuilder {

    public static void main(String[] args) {
        Product builder=new Product.Builder()
                .builderPart1( "part1" )
                .builderPart2( "part2" )
                .build();

        new Student.Builder().builderAge(18).builderName("alan").builderPhone("9888").build();

    }

}

class Student{

    private String name;
    private Integer age;
    private String phone;

    public Student(String name, Integer age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    static class Builder {
        private String name;
        private Integer age;
        private String phone;

        public Builder builderName(String name){
            this.name = name;
            return this;
        }
        public Builder builderAge(Integer age){
            this.age = age;
            return this;
        }
        public Builder builderPhone(String phone){
            this.phone = phone;
            return this;
        }

        public Student build(){
            return new Student(name, age, phone);
        }
    }

}


class Product {


    private final String part1;
    private final String part2;
    private final String part3;
    private final String part4;
    //  .....


    public Product(String part1, String part2, String part3, String part4 ) {
        this.part1=part1;
        this.part2=part2;
        this.part3=part3;
        this.part4=part4;
    }

    public String getPart1() {
        return part1;
    }

    public String getPart2() {
        return part2;
    }

    public String getPart3() {
        return part3;
    }

    public String getPart4() {
        return part4;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                ", part4='" + part4 + '\'' +
                '}';
    }



    static class Builder{
        private   String part1;
        private   String part2;
        private   String part3;
        private   String part4;

        public Builder builderPart1(String part1){
            this.part1=part1;
            return this;
        }

        public Builder builderPart2(String part2){
            this.part2=part2;
            return this;
        }

        public Builder builderPart3(String part3){
            this.part3=part3;
            return this;
        }
        public Builder builderPart4(String part4){
            this.part4=part4;
            return this;
        }

        Product build(){
            return new Product( part1,part2,part3,part4 );
        }

    }


}
