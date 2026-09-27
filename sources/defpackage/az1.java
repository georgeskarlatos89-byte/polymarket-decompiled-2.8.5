package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class az1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ kjc c;
    public final /* synthetic */ List d;
    public final /* synthetic */ ubc e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ az1(long j, kjc kjcVar, List list, ubc ubcVar, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.b = j;
        this.c = kjcVar;
        this.d = list;
        this.e = ubcVar;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                cz1.a(this.b, this.c, this.d, this.e, this.f, (pq4) obj, rtn.a(this.g | 1), this.h);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                cz1.b(this.b, this.c, this.d, this.e, this.f, (pq4) obj, rtn.a(this.g | 1), this.h);
                return Unit.INSTANCE;
        }
    }
}
