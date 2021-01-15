package lessons.lesson5.phone;

import lessons.lesson5.phone.AbstractPhone;

public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(String outputNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента,сэр");
        System.out.println("Набираем абонента номер " + outputNumber);
    }

    @Override
    public void ring(String inputNumber) {
        System.out.println("Вхрдящий звонок от абонента " + inputNumber);
    }

}
