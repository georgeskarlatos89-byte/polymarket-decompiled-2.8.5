package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class enc {
    public final String a;
    public final k8a b;
    public final Context c;
    public final t85 d;
    public final AtomicBoolean e;
    public int f;
    public tj9 g;
    public final k3h h;
    public final cnc i;
    public final bnc j;
    public final dnc k;

    public enc(Context context, String str, k8a k8aVar) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = k8aVar;
        this.c = context.getApplicationContext();
        this.d = k8aVar.a.getCoroutineScope();
        this.e = new AtomicBoolean(true);
        this.h = ozm.a(0, 0, BufferOverflow.SUSPEND);
        this.i = new cnc(this, k8aVar.b);
        this.j = new bnc(this);
        this.k = new dnc(this, 0);
    }
}
