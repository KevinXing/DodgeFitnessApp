package com.xyxy.dodgefitnessmap;

import android.content.Context;

import java.util.List;

public class ProximityContentManager {

    private DistanceManager distanceManager;

    private Listener listener;

    public ProximityContentManager(Context context) {
        distanceManager = new DistanceManager(context);
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public interface Listener {
        void onContentChanged(Object content);
    }

    public void startContentUpdates() {
        distanceManager.startDistanceUpdates();
    }

    public void stopContentUpdates() {
        distanceManager.stopDistanceUpdates();
    }

    public void destroy() {
        distanceManager.destroy();
    }
}
