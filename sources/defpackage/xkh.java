package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xkh implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xdh b;
    public final /* synthetic */ qf8 c;

    public xkh(int i, xdh xdhVar, qf8 qf8Var) {
        this.a = i;
        this.b = xdhVar;
        this.c = qf8Var;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        if (Math.abs(((Number) obj).floatValue() - this.a) > 0.1f) {
            xdh xdhVar = this.b;
            if (xdhVar != null) {
                ((hk6) xdhVar).a();
            }
            qf8.a(this.c);
        }
        return Unit.INSTANCE;
    }
}
