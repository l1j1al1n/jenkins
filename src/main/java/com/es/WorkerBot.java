package com.es;

import java.util.Random;

/**
 * @author lijialin
 */
public class WorkerBot {
    private static final String[] MESSAGES = {
            "又是搬砖的一天。",
            "今天也要加班到深夜吗？",
            "Jenkins 爸爸，我又来了！",
            "喝杯咖啡，继续干活。",
            "写代码使我快乐（？）",
            "谁在偷懒，我看到了！",
            "打工是不可能打工的，这辈子都不可能...",
            "不摸鱼，怎么有灵感？",
            "构建成功了？我不信，再跑一次看看。",
            "测试又挂了？再重启试试。"
    };

    public static void main(String[] args) {
        Random random = new Random();
        int counter = 1;

        System.out.println("🤖 WorkerBot 启动！准备开始打工...");

        while (true) {
            try {
                // 2~5 秒随机间隔
                int delay = 2000 + random.nextInt(3000);
                Thread.sleep(delay);
                String message = MESSAGES[random.nextInt(MESSAGES.length)];
                System.out.printf("[%03d] %s%n", counter++, message);
            } catch (InterruptedException e) {
                System.out.println("😵 WorkerBot 被打断了，准备下班...");
                break;
            }
        }
    }
}
