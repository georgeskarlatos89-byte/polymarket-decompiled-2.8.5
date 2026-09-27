package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zwm {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile zwm l = null;
    public static final gci m = ftl.b(yxm.a);
    public final ndj a = new ndj(13);
    public final Context b;
    public final gci c;
    public final gci d;
    public final gci e;
    public final gci f;
    public final hnn g;
    public final gci h;
    public final vjn i;

    public zwm(Context context, gci gciVar, gci gciVar2, gci gciVar3, gci gciVar4, gci gciVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        gciVar.getClass();
        gciVar2.getClass();
        gciVar3.getClass();
        gciVar4.getClass();
        gciVar5.getClass();
        gci b = ftl.b(gciVar);
        gci b2 = ftl.b(gciVar2);
        gci b3 = ftl.b(new fym(gciVar3, 0));
        gci b4 = ftl.b(gciVar4);
        gci b5 = ftl.b(gciVar5);
        this.b = applicationContext;
        this.c = b;
        this.d = b2;
        this.e = b3;
        this.f = b4;
        this.g = new hnn(applicationContext, b, b4, b2);
        this.h = b5;
        this.i = new vjn(applicationContext, b, b3, b2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [lym, java.lang.Exception] */
    public static void b() {
        synchronized (x5n.a) {
        }
        if (k.get() == null && x5n.b == null) {
            x5n.b = new Exception();
        }
    }

    public final lkb a() {
        return (lkb) this.c.get();
    }
}
