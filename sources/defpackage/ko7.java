package defpackage;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ko7 implements asb, Serializable {
    public String a;
    public fbi b;
    public LinkedBlockingQueue c;

    @Override // defpackage.asb
    public final void a(String str) {
        m(f6b.WARN, null);
    }

    @Override // defpackage.asb
    public final boolean b() {
        return true;
    }

    @Override // defpackage.asb
    public final boolean c() {
        return true;
    }

    @Override // defpackage.asb
    public final void d(String str, Object... objArr) {
        f6b f6bVar = f6b.WARN;
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th != null) {
            if (objArr.length != 0) {
                int length = objArr.length - 1;
                Object[] objArr2 = new Object[length];
                if (length > 0) {
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                }
                m(f6bVar, objArr2);
                return;
            }
            dmk.n("non-sensical empty or null argument array");
            return;
        }
        m(f6bVar, objArr);
    }

    @Override // defpackage.asb
    public final boolean e() {
        return true;
    }

    @Override // defpackage.asb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.asb
    public final void g(Throwable th) {
        m(f6b.DEBUG, null);
    }

    @Override // defpackage.asb
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.asb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.asb
    public final void i(Object obj, String str) {
        m(f6b.WARN, new Object[]{obj});
    }

    @Override // defpackage.asb
    public final void j(String str) {
        m(f6b.INFO, null);
    }

    @Override // defpackage.asb
    public final void l(String str) {
        m(f6b.TRACE, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, hbi] */
    public final void m(f6b f6bVar, Object[] objArr) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.a = f6bVar;
        obj.b = this.b;
        Thread.currentThread().getName();
        obj.c = objArr;
        this.c.add(obj);
    }
}
