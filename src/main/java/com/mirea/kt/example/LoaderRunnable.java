package com.mirea.kt.example;

import java.io.*;


public class LoaderRunnable implements Runnable{
    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }


    @Override
    public void run() {
        if (path!=null && new File(this.path).exists()){
            FileInputStream fis;
            try {
                fis = new FileInputStream(this.path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println("Desearilization was successful");
                System.out.println(message.toString());
            }catch (IOException|ClassNotFoundException e){
                System.out.println("Error loading from path: "+this.path);
                System.out.println(e.getMessage());
            }
        }
        if (!Thread.currentThread().isInterrupted()){
            Thread.currentThread().interrupt();
        }

    }
}
