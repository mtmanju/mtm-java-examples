package com.mtm.examples.threads;

public class Downloader extends Thread {

    private final String url;

    Downloader(String url) {
        this.url = url;
    }

    public void run() {
        DownloadFile d = new DownloadFile();
        d.download(this.url);
    }
}
