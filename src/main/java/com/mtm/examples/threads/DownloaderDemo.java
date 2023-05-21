package com.mtm.examples.threads;

public class DownloaderDemo {
    public static void main(String[] args) {
        Downloader t1 = new Downloader("aa");
        Downloader t2 = new Downloader("bb");
        Downloader t3 = new Downloader("cc");
        Downloader t4 = new Downloader("dd");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
