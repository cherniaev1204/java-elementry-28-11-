package lessons.lesson5.phone;

import lessons.lesson5.phone.AbstractPhone;

public class SmartPhone extends AbstractPhone {
    public SmartPhone(int year){
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Нажимаем на копочки");
        System.out.println("Вызываем " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("На экране смартфона видим номер " + inputNumber);
    }

}
