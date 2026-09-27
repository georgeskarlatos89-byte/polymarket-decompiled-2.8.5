package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w44 {
    public static final w44 b = new w44(0);
    public static final w44 c = new w44(1);
    public static final w44 d = new w44(2);
    public final /* synthetic */ int a;

    public /* synthetic */ w44(int i) {
        this.a = i;
    }

    public static String a(u44 u44Var) {
        String str;
        csc name = u44Var.getName();
        name.getClass();
        String b2 = qun.b(name);
        if (!(u44Var instanceof lhj)) {
            tw5 e = u44Var.e();
            e.getClass();
            if (e instanceof s34) {
                str = a((u44) e);
            } else if (e instanceof rpd) {
                yl8 yl8Var = ((spd) ((rpd) e)).e.a;
                yl8Var.getClass();
                str = qun.d(yl8.f(yl8Var));
            } else {
                str = null;
            }
            if (str != null && !Intrinsics.areEqual(str, "")) {
                return str + '.' + b2;
            }
        }
        return b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [tw5, u44, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tw5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [tw5] */
    public final String b(u44 u44Var, nn6 nn6Var) {
        int i = this.a;
        u44Var.getClass();
        switch (i) {
            case 0:
                if (u44Var instanceof lhj) {
                    csc name = ((lhj) u44Var).getName();
                    name.getClass();
                    return nn6Var.n(name, false);
                }
                yl8 f = zn6.f(u44Var);
                f.getClass();
                return ((tn6) nn6Var).o(qun.d(yl8.f(f)));
            case 1:
                if (u44Var instanceof lhj) {
                    csc name2 = ((lhj) u44Var).getName();
                    name2.getClass();
                    return nn6Var.n(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(u44Var.getName());
                    u44Var = u44Var.e();
                } while (u44Var instanceof s34);
                return qun.d(new h7g(arrayList));
            default:
                return a(u44Var);
        }
    }
}
