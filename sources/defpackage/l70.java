package defpackage;

import android.app.Application;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class l70 extends dak {
    private final Application application;

    public l70(Application application) {
        application.getClass();
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        t.getClass();
        return t;
    }
}
