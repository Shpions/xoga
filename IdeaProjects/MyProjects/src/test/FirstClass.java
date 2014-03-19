import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class FirstClass
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dedN =reader.readLine();
        Cat catDed=new Cat(dedN, null, null);
        System.out.println(catDed);

        String babN=reader.readLine();
        Cat catBab=new Cat(babN, null, null);
        System.out.println(catBab);

        String papN=reader.readLine();
        Cat catPap=new Cat(papN, null, catDed);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBab, null);
        System.out.println(catMother);

        String sonN=reader.readLine();
        Cat catSon=new Cat(sonN, catMother,catPap);
        System.out.println(catSon);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catPap);


        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mom;
        private Cat father;

        Cat(String name, Cat mom, Cat father)
        {
            this.name = name;
            this.mom = mom;
            this.father=father;
        }

        @Override
        public String toString()
        {
            if (mom == null && father == null)
                return "Cat name is " + name + ", no mother"+", no father";
            else if(mom!=null && father==null)
                return "Cat name is " + name + ", mother is " + mom.name+", no father";
            else if(mom==null && father!=null)
                return "Cat name is " + name + ", no mother"+", father is " + father.name;
            else
                return "Cat name is " + name + ", mother is " + mom.name+", father is " + father.name;

        }
    }

}