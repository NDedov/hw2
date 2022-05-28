package ru.dedov;

public class hw2 {
    public static void main(String[] args) {

        System.out.println("Удаление всех 1");
        MyArray arr = new MyArray(new int[]{1,1,2,1,34,1,1,1,1,1,45,23,1,1});
        arr.display();
        arr.deleteAll(1);
        arr.display();

        System.out.println("Очистка массива");
        MyArray arr01 = new MyArray(new int[]{1,1,2,1,34,1,1,1,1,1,45,23,1,1});
        arr01.display();
        arr01.deleteAll();
        arr01.display();
        arr01.append(125);
        arr01.display();

        System.out.println("Вставка в массив");
        MyArray arr02 = new MyArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        arr02.display();
        arr02.insert(2,100);
        arr02.display();
        arr02.insert(0,100);
        arr02.display();
        arr02.insert(12,100);
        arr02.display();

        MyArray arr03 = new MyArray(1);
        int arrayLen = 10_000;
        int max = 1000;
        long actions;
        long currentTime;
        double time;

        arr03.random(arrayLen, max);
        currentTime = System.nanoTime();
        actions = arr03.sortBubbleCount();
        time = (System.nanoTime() - currentTime) / 1_000_000_000d;
        System.out.println("Пузырьком выполнено действий: " + actions + " за " + time + "  секунд");

        arr03.random(arrayLen, max);
        currentTime = System.nanoTime();
        actions = arr03.sortSelectCount();
        time = (System.nanoTime() - currentTime) / 1_000_000_000d;
        System.out.println("Выбором выполнено действий: " + actions + " за " + time + "  секунд");

        arr03.random(arrayLen, max);
        currentTime = System.nanoTime();
        actions = arr03.sortInsertCount();
        time = (System.nanoTime() - currentTime) / 1_000_000_000d;
        System.out.println("Вставкой выполнено действий: " + actions + " за " + time + "  секунд");

        arr03.random(arrayLen, max);
        currentTime = System.nanoTime();
        actions = arr03.sortBubbleCountMod();
        time = (System.nanoTime() - currentTime) / 1_000_000_000d;
        System.out.println("Модифицированным пузырьком выполнено действий: " + actions + " за " + time + "  секунд");

        arr03.random(arrayLen, max);
        currentTime = System.nanoTime();
        arr03.sortCounting();
        time = (System.nanoTime() - currentTime) / 1_000_000_000d;
        System.out.println("Сортировка подсчетом выполнена за " + time + "  секунд");


    }
}
