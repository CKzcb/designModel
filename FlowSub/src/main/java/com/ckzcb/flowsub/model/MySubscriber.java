package com.ckzcb.flowsub.model;

import java.util.concurrent.Flow;

// 自定义订阅者类
class MySubscriber<T> implements Flow.Subscriber<T> {
    private Flow.Subscription subscription;
    private int counter = 0;
    private final int limit;

    public MySubscriber(int limit) {
        this.limit = limit;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("订阅成功，开始请求数据");
        this.subscription = subscription;
        // 请求第一个元素
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        System.out.println("接收到元素: " + item);
        counter++;
        if (counter < limit) {
            // 请求下一个元素
            subscription.request(1);
        } else {
            // 达到限制，取消订阅
            subscription.cancel();
            System.out.println("达到限制，取消订阅");
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("发生错误: " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("订阅完成");
    }
}
