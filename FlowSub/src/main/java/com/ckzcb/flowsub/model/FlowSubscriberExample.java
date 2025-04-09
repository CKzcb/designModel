package com.ckzcb.flowsub.model;

import java.util.concurrent.SubmissionPublisher;

public class FlowSubscriberExample {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        // 创建一个发布者
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

        // 创建一个订阅者，最多接收 3 个元素
        MySubscriber<Integer> subscriber = new MySubscriber<>(3);

        // 订阅发布者
        publisher.subscribe(subscriber);

        // 发布元素
        for (int i = 0; i < 5; i++) {
            System.out.println("发布元素: " + i);
            publisher.submit(i);
        }

        // 关闭发布者
        publisher.close();
    }
}