package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class un2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ i1d c;

    public /* synthetic */ un2(i1d i1dVar, float f) {
        this.a = 2;
        this.c = i1dVar;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = 0.0f;
        boolean z = false;
        float f2 = this.b;
        i1d i1dVar = this.c;
        switch (i) {
            case 0:
                if (f2 > 0.0f) {
                    f = lnf.d((-i1dVar.h.y()) / f2, 0.0f, 1.0f);
                }
                return Float.valueOf(f);
            case 1:
                if (f2 > 0.0f) {
                    f = lnf.d((-i1dVar.h.y()) / f2, 0.0f, 1.0f);
                }
                if (f <= 0.05f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (i1dVar.h.y() < f2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ un2(float f, i1d i1dVar, int i) {
        this.a = i;
        this.b = f;
        this.c = i1dVar;
    }
}
