package shesijie.bawei.com.ssj041201.model;

import javax.security.auth.callback.Callback;

public interface IModel {
    void Login(CallBack callBack);

    public interface  CallBack{
        //成功
        void onSuccess(Object data);
        //失败
        void  onFail(Exception e);
    }
}
