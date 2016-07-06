package com.androidjp.design_pattern_demo.singleton;

/**
 * Created by androidjp on 16-7-6.
 */
public class SingleTonManager{

    private SingleTonManager(){

    }

    public static SingleTonManager getInstance(){
        return SingleTonHolder.sInstance;
    }

    private static class SingleTonHolder{
        private static final SingleTonManager sInstance = new SingleTonManager();
    }

    ///-------------------------------------------------------------------------------
    /// 成员方法
    ///-------------------------------------------------------------------------------

}
