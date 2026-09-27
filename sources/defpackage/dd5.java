package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dd5 extends zd5 {
    public final Context d;
    public od5 e;
    public Executor f;
    public CancellationSignal g;
    public final cd5 h;

    public dd5(Context context) {
        context.getClass();
        this.d = context;
        this.h = new cd5(this, new Handler(Looper.getMainLooper()), 0);
    }
}
