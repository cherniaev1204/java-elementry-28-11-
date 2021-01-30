package homework.thirdHW.family;

public class Main {

    public static class Person {
        private String name;
        private Main mother;
        private Main father;


        public Person(String name) {
            this.name = name;
        }

        public Person(String name, Main mother, Main father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "Grandparent " + name;
            } else if (mother != null && father == null) {
                return "Child " + name + ". Mother " + mother + ". No father";
            } else if (mother == null && father != null) {
                return "Child " + name + ". Father " + father + ". No mother";
            } else {
                return "Child " + name + ". Mother " + mother + ". Father " + father;
            }
//     return (mother != null) ? "Mother " + mother.name : "no mother";
//     return (father != null) ? "Father " + father.name : "no father"};
        }

    }
}
