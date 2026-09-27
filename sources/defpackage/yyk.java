package defpackage;

import bo.app.jh;
import bo.app.s2;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class yyk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ yyk(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return jh.a(this.b, this.c, this.d);
            default:
                return s2.a(this.b, this.c, this.d);
        }
    }
}
