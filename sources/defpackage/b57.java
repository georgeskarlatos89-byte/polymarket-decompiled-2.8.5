package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b57 extends ggf {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b57(Function0 function0, int i) {
        super(function0);
        this.b = i;
    }

    @Override // defpackage.ggf
    public final lf0 a(Object obj) {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                return new lf0(this, obj, z, vwb.q, true);
            default:
                if (obj == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new lf0(this, obj, z2, null, false);
        }
    }
}
