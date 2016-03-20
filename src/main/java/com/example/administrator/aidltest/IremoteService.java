package com.example.administrator.aidltest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2016/3/7.
 */
public class IremoteService extends Service {

    //当客户端绑定的时候调用
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    private IBinder iBinder = new MyAidl.Stub() {
        @Override
        public int add(int num1, int num2) throws RemoteException {

            Log.d("TAG", "你输入的参数是" + num1 + "和" + num2);
            return num1 + num2;
        }
    };
}
