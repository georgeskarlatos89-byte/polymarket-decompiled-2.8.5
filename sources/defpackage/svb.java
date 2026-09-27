package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class svb extends Lambda implements Function0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ tvb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svb(tvb tvbVar, int i) {
        super(0);
        this.h = i;
        this.i = tvbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.h;
        boolean z = false;
        tvb tvbVar = this.i;
        switch (i) {
            case 0:
                if (((mvb) tvbVar.b.getValue()) != null || ((Throwable) tvbVar.c.getValue()) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                if (((Throwable) tvbVar.c.getValue()) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((mvb) tvbVar.b.getValue()) == null && ((Throwable) tvbVar.c.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((mvb) tvbVar.b.getValue()) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
