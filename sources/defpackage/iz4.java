package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class iz4 {
    public final nok a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public iz4(Context context, nok nokVar) {
        this.a = nokVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 != null && Intrinsics.areEqual(obj2, obj)) {
                return;
            }
            this.e = obj;
            this.a.d.execute(new e10(23, CollectionsKt.M0(this.d), this));
        }
    }

    public abstract void c();

    public abstract void d();
}
