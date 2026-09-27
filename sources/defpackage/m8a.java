package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m8a extends mca {
    public static final /* synthetic */ long f = oo4.a.objectFieldOffset(m8a.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 e;

    public m8a(Function1 function1) {
        this.e = function1;
    }

    @Override // defpackage.mca
    public final boolean k() {
        return true;
    }

    @Override // defpackage.mca
    public final void l(Throwable th) {
        if (oo4.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
