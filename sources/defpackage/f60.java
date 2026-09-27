package defpackage;

import com.socure.docv.capturesdk.api.Keys;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class f60 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j60 b;
    public final /* synthetic */ hri c;

    public /* synthetic */ f60(j60 j60Var, hri hriVar, int i) {
        this.a = i;
        this.b = j60Var;
        this.c = hriVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = null;
        hri hriVar = this.c;
        j60 j60Var = this.b;
        switch (i) {
            case 0:
                e60 e60Var = j60Var.f;
                ke keVar = new ke(hriVar, 10);
                ?? obj2 = new Object();
                j60Var.e.d("dataBuilder", e60Var, new g7(6, obj2, keVar));
                Object obj3 = obj2.a;
                if (obj3 != null) {
                    return (gri) obj3;
                }
                Intrinsics.i(Keys.KEY_SOCURE_RESULT);
                throw null;
            case 1:
                e60 e60Var2 = j60Var.g;
                f60 f60Var = new f60(j60Var, hriVar, 2);
                ?? obj4 = new Object();
                j60Var.e.d("positioner", e60Var2, new g7(6, obj4, f60Var));
                Object obj5 = obj4.a;
                if (obj5 != null) {
                    return (zrf) obj5;
                }
                Intrinsics.i(Keys.KEY_SOCURE_RESULT);
                throw null;
            default:
                Object invoke = j60Var.c.invoke();
                if (((nwa) invoke).j()) {
                    obj = invoke;
                }
                nwa nwaVar = (nwa) obj;
                if (nwaVar == null) {
                    return zrf.e;
                }
                return hriVar.Z(nwaVar).l(nwaVar.Z(0L));
        }
    }
}
