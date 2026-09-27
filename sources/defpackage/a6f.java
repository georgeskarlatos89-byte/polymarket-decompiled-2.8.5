package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class a6f implements Function0 {
    public final /* synthetic */ int a;
    public final c6f b;

    public /* synthetic */ a6f(c6f c6fVar, int i) {
        this.a = i;
        this.b = c6fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        c6f c6fVar = this.b;
        switch (i) {
            case 0:
                return c6f.f(c6fVar);
            default:
                return c6f.a(c6fVar);
        }
    }
}
