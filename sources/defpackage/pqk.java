package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pqk implements Function1 {
    public static final pqk b = new pqk(0);
    public final /* synthetic */ int a;

    public /* synthetic */ pqk(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (defpackage.tba.j.containsKey(defpackage.zn6.f((defpackage.s34) r2)) != false) goto L23;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof e77);
            case 1:
                ((ota) obj).getClass();
                return null;
            case 2:
                ((c44) obj).getClass();
                return peh.H0;
            case 3:
                qv2 qv2Var = (qv2) obj;
                if (qv2Var.getKind() == pv2.DECLARATION) {
                    tw5 e = qv2Var.e();
                    e.getClass();
                    String str = tba.a;
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                return ((hqb) obj).b.invoke();
            case 5:
                return (qv2) obj;
            case 6:
                return (qv2) obj;
            case 7:
                w6h w6hVar = (w6h) obj;
                w6hVar.getClass();
                aca acaVar = l1f.b;
                w6hVar.c("java/util/Spliterator", acaVar, acaVar);
                v6g v6gVar = v6g.MustUse;
                return Unit.INSTANCE;
            default:
                if (((xl8) obj) != null) {
                    return Boolean.valueOf(!r3.equals(fvh.y));
                }
                dmk.v("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }

    public /* synthetic */ pqk(Object obj, int i) {
        this.a = i;
    }
}
