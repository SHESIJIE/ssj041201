package shesijie.bawei.com.ssj041201.presenter;

import java.lang.ref.SoftReference;
import java.net.SocketOption;

import shesijie.bawei.com.ssj041201.model.IModel;
import shesijie.bawei.com.ssj041201.model.Model;
import shesijie.bawei.com.ssj041201.view.IView;
import shesijie.bawei.com.ssj041201.view.MainActivity;

public class presenter implements Ipresenter {
    private IModel model;
    private SoftReference<IModel> softReference;
    MainActivity mainActivity;
    @Override
    public void getData() {
     model.Login ( new IModel.CallBack () {
         @Override
         public void onSuccess(Object data) {

         }

         @Override
         public void onFail(Exception e) {

         }
     } );
    }

    @Override
    public void getView(IView view) {
    this.mainActivity=( MainActivity) view;
     model=new Model ();
   softReference =new SoftReference<IModel> (model);
    }

    @Override
    public void getModel() {

    }
}
