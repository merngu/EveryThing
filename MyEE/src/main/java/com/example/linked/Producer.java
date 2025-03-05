package com.example.linked;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * FileName: Producer
 * Date:   20252025/3/4下午3:53
 * Description:案例
 * <author> maziyu
 */
public class Producer implements Runnable{

    private BlockingQueue<Integer> quene;

    public Producer(BlockingQueue<Integer> quene) {
        this.quene = quene;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                // 模拟生产数据
                System.out.println("Producing:" + i);
                // 将数据放入队列
                quene.put(i);
                // 模拟生产间隔
                Thread.sleep((long) (Math.random() * 2000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> quene;

    public Consumer(BlockingQueue<Integer> quene) {
        this.quene = quene;
    }

    @Override
    public void run() {
        try {
            // 从队列中获取数据
            Integer data = quene.take();
            // 模拟消费数据
            System.out.println("Consuming:" + data);

            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}


class Main{
    public static void main(String[] args) {
        // 创建一个容量为5的LinkedBlockingQueue
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // 启动生产者线程和消费者线程
        new Thread(producer).start();
        new Thread(consumer).start();
    }

}
