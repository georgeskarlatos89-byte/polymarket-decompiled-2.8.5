package com.google.android.libraries.places.internal;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzl extends TouchDelegate {
    private static final Rect zza = new Rect();
    private final List zzb;
    private TouchDelegate zzc;

    public zzzl(View view) {
        super(zza, view);
        this.zzb = new ArrayList();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        boolean onTouchEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            if (motionEvent.getPointerCount() > 1) {
                return false;
            }
            List list = this.zzb;
            int size = list.size();
            do {
                size--;
                if (size < 0) {
                    return false;
                }
                touchDelegate = (TouchDelegate) list.get(size);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                onTouchEvent = touchDelegate.onTouchEvent(motionEvent);
                motionEvent.setLocation(x, y);
            } while (!onTouchEvent);
            this.zzc = touchDelegate;
            return true;
        }
        TouchDelegate touchDelegate2 = this.zzc;
        if (touchDelegate2 != null && touchDelegate2.onTouchEvent(motionEvent)) {
            z = true;
        }
        if (actionMasked != 1 && actionMasked != 32) {
            return z;
        }
        this.zzc = null;
        return z;
    }

    public final void zza(TouchDelegate touchDelegate) {
        touchDelegate.getClass();
        this.zzb.add(touchDelegate);
    }
}
