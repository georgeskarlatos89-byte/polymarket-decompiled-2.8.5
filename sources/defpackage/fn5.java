package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fn5 extends wtn {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ boolean[] b;

    public fn5(Function1 function1, boolean[] zArr) {
        this.a = function1;
        this.b = zArr;
    }

    @Override // defpackage.wtn
    public final boolean b(Object obj) {
        boolean booleanValue = ((Boolean) this.a.invoke(obj)).booleanValue();
        boolean[] zArr = this.b;
        if (booleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }

    @Override // defpackage.wtn
    public final Object d() {
        return Boolean.valueOf(this.b[0]);
    }
}
