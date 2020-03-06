package com.company;

public class Main {

    public static void main(String[] args) {
        ISubject channel = new Channel();

        IObserver sub1 = new Subscriber("Pelle");
        IObserver sub2 = new Subscriber("Melle");
        IObserver sub3 = new Subscriber("Delle");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);

        channel.upload("Byhåla");

        System.out.println();
        channel.unSubscribe(sub2);

        channel.upload("Byhåla 2");
    }
}
