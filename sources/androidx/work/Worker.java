package androidx.work;

import android.content.Context;
import defpackage.in8;
import defpackage.xjb;
import defpackage.xzg;
import defpackage.zjb;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class Worker extends zjb {
    public xzg e;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xzg, java.lang.Object] */
    @Override // defpackage.zjb
    public final xzg b() {
        this.e = new Object();
        this.b.d.execute(new in8(this, 25));
        return this.e;
    }

    public abstract xjb e();
}
