package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n8a extends mca {
    public final Function1 e;

    public n8a(Function1 function1) {
        this.e = function1;
    }

    @Override // defpackage.mca
    public final boolean k() {
        return false;
    }

    @Override // defpackage.mca
    public final void l(Throwable th) {
        this.e.invoke(th);
    }
}
