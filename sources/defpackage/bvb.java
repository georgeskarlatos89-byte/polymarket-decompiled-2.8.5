package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bvb extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ evb i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvb(evb evbVar, int i, int i2) {
        super(1);
        this.h = i2;
        this.i = evbVar;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        int i2 = this.j;
        evb evbVar = this.i;
        switch (i) {
            case 0:
                return Boolean.valueOf(evbVar.b(i2, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(evbVar.b(i2, ((Number) obj).longValue()));
        }
    }
}
