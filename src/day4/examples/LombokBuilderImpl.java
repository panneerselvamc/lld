package day4.examples;

class Data {

    private String name;
    private String age;

    private Data(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;
        private String age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Data build() {
            return new Data(this);
        }
    }

}


public class LombokBuilderImpl {

    public static void main(String[] args) {
        Data data = new Data.Builder().age("10").name("panneer").build();
    }

}
