package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fbi implements asb {
    public final String a;
    public volatile asb b;
    public Boolean c;
    public Method d;
    public ko7 e;
    public final LinkedBlockingQueue f;
    public final boolean g;

    public fbi(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.g = z;
    }

    @Override // defpackage.asb
    public final void a(String str) {
        m().a(str);
    }

    @Override // defpackage.asb
    public final boolean b() {
        return m().b();
    }

    @Override // defpackage.asb
    public final boolean c() {
        return m().c();
    }

    @Override // defpackage.asb
    public final void d(String str, Object... objArr) {
        m().d(str, objArr);
    }

    @Override // defpackage.asb
    public final boolean e() {
        return m().e();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && fbi.class == obj.getClass() && this.a.equals(((fbi) obj).a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.asb
    public final boolean f() {
        return m().f();
    }

    @Override // defpackage.asb
    public final void g(Throwable th) {
        m().g(th);
    }

    @Override // defpackage.asb
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.asb
    public final boolean h() {
        return m().h();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.asb
    public final void i(Object obj, String str) {
        m().i(obj, str);
    }

    @Override // defpackage.asb
    public final void j(String str) {
        m().j(str);
    }

    @Override // defpackage.asb
    public final boolean k(f6b f6bVar) {
        return m().k(f6bVar);
    }

    @Override // defpackage.asb
    public final void l(String str) {
        m().l(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [asb, ko7, java.lang.Object] */
    public final asb m() {
        if (this.b != null) {
            return this.b;
        }
        if (this.g) {
            return qrc.a;
        }
        ko7 ko7Var = this.e;
        if (ko7Var == null) {
            LinkedBlockingQueue linkedBlockingQueue = this.f;
            ?? obj = new Object();
            obj.b = this;
            obj.a = this.a;
            obj.c = linkedBlockingQueue;
            this.e = obj;
            return obj;
        }
        return ko7Var;
    }

    public final boolean n() {
        Boolean bool;
        Boolean bool2 = this.c;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", hbi.class);
            bool = Boolean.TRUE;
            this.c = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.c = bool;
        }
        return bool.booleanValue();
    }
}
