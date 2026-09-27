package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cu1 implements oo5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cu1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.oo5
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.oo5
    public final Class b() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.oo5
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.oo5
    public final void d(h6f h6fVar, no5 no5Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    no5Var.q(hu1.a((File) obj));
                    return;
                } catch (IOException e) {
                    Log.isLoggable("ByteBufferFileLoader", 3);
                    no5Var.c(e);
                    return;
                }
            default:
                no5Var.q(obj);
                return;
        }
    }

    @Override // defpackage.oo5
    public final ep5 getDataSource() {
        switch (this.a) {
            case 0:
                return ep5.LOCAL;
            default:
                return ep5.LOCAL;
        }
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
