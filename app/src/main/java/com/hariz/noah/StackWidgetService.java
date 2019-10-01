package com.hariz.noah;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class StackWidgetService extends RemoteViewsService{
//    @Override
//    public class RemoteViewsFactory onGetViewFactory(Intent intent) {
//        return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
//    }
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext(),intent);
    }
}
