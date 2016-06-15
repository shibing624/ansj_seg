package org.ansj.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalBagDemo {
    public static void main(String[] args) throws IOException {

        System.out.println(1L<<32);
        int nCases=0;
        int nPack, nVolume1, nVolume2, nVolume;
        int weight[]= new int[510];
        int value[] = new int[510];
        int record[]= new int[1000];
        int INF = 1000000001;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = null;
        System.out.print("输入数据：");
        try {
            read = br.readLine();
            nCases = Integer.valueOf(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的数据："+read);
        while(nCases-->0)
        {
            nVolume1 = Integer.valueOf(br.readLine());
            nVolume2 = Integer.valueOf(br.readLine());
            nVolume = nVolume2-nVolume1;
            nPack = Integer.valueOf(br.readLine());
            System.out.println("npack:" + nPack);
            for(int i=0; i<nPack; ++i)
            {
                value[i] = Integer.valueOf(br.readLine());
                System.out.println("value[i]" + value[i]);
                weight[i] = Integer.valueOf(br.readLine());
                System.out.println("weight[i]" + weight[i]);
            }
            for(int i=0; i<=nVolume; ++i)
                record[i] = INF;
            record[0] = 0;
            for(int i=0; i<nPack; ++i)
                for(int j=weight[i]; j<=nVolume; ++j)
                    if(record[j]>record[j-weight[i]]+value[i])
                        record[j] = record[j-weight[i]]+value[i];
            if(record[nVolume] == INF)
                System.out.println("This is impossible.\n");
            else
                System.out.println("The minimum amount of money in the piggy-bank is " + record[nVolume]);

        }

    }



}
