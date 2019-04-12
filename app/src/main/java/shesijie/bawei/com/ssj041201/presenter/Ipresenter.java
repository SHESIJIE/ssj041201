package shesijie.bawei.com.ssj041201.presenter;

import android.view.View;

import shesijie.bawei.com.ssj041201.view.IView;

public interface Ipresenter {
    void getData();
    void getView(IView view);
    void getModel();
}
