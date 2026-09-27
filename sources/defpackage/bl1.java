package defpackage;

import bo.app.jh;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class bl1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ bl1(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        long j2 = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("Braze SDK loaded in ");
                long j3 = j2 - j;
                sb.append(j3 / 1000000);
                sb.append(" ms / ");
                sb.append(j3);
                sb.append(" nanos");
                return sb.toString();
            default:
                return jh.a(j2, j);
        }
    }
}
