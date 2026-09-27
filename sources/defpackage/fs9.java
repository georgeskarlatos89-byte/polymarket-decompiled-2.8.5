package defpackage;

import bo.app.pa;
import bo.app.sa;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fs9 {
    public final pa a;
    public final sa b;
    public final jj9 c;
    public final String d;

    public fs9(pa paVar, sa saVar, jj9 jj9Var, String str) {
        paVar.getClass();
        saVar.getClass();
        jj9Var.getClass();
        this.a = paVar;
        this.b = saVar;
        this.c = jj9Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs9)) {
            return false;
        }
        fs9 fs9Var = (fs9) obj;
        if (Intrinsics.areEqual(this.a, fs9Var.a) && Intrinsics.areEqual(this.b, fs9Var.b) && Intrinsics.areEqual(this.c, fs9Var.c) && Intrinsics.areEqual(this.d, fs9Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return qga.e((JSONObject) this.c.forJsonPut());
    }
}
