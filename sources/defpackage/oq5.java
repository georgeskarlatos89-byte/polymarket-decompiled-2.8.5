package defpackage;

import bo.app.r;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oq5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fq5 b;

    public /* synthetic */ oq5(fq5 fq5Var, int i) {
        this.a = i;
        this.b = fq5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        fq5 fq5Var = this.b;
        switch (i) {
            case 0:
                return "Key " + fq5Var.b() + " is not a LIST type. Returning empty list.";
            case 1:
                return r.a(fq5Var, new StringBuilder("Failed to read list from DataStore for key: "));
            case 2:
                return "Key " + fq5Var.b() + " is not a MAP type. Returning empty map.";
            case 3:
                return r.a(fq5Var, new StringBuilder("Failed to read map from DataStore for key: "));
            case 4:
                StringBuilder sb = new StringBuilder("Key ");
                sb.append(fq5Var.b());
                sb.append(" is not a LIST type. Cannot write key:");
                return r.a(fq5Var, sb);
            case 5:
                return r.a(fq5Var, new StringBuilder("Failed to write list to DataStore for key: "));
            case 6:
                StringBuilder sb2 = new StringBuilder("Key ");
                sb2.append(fq5Var.b());
                sb2.append(" is not a MAP type. Cannot write key:");
                return r.a(fq5Var, sb2);
            default:
                return r.a(fq5Var, new StringBuilder("Failed to write map to DataStore for key: "));
        }
    }
}
