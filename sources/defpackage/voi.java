package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface voi extends k7b {
    l1g getRequest();

    void getSize(n9h n9hVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(Object obj, jcj jcjVar);

    void removeCallback(n9h n9hVar);

    void setRequest(l1g l1gVar);
}
