package com.yuqi;

import com.yuqi.protocol.ProtocolMainThread;

/**
 * @author yuqi
 * @mail yuqi4733@gmail.com
 * @description your description
 * @time 30/6/20 22:25
 **/
public class FrontEndMain {
    public static void main(String[] args) {
        int port = 3016;

        //start netty pork
        LifeCycleInstance.initAll();
        new Thread(new ProtocolMainThread(port)).start();
    }
}
