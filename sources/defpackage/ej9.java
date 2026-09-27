package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ej9 {
    public final int a;
    public final Map b;
    public final JSONObject c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ej9(Map map, int i, int i2) {
        this(i, map, (JSONObject) null);
        if ((i2 & 2) != 0) {
            map = zc7.a;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej9)) {
            return false;
        }
        ej9 ej9Var = (ej9) obj;
        if (this.a == ej9Var.a && Intrinsics.areEqual(this.b, ej9Var.b) && Intrinsics.areEqual(this.c, ej9Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c = sv6.c(this.b, Integer.hashCode(this.a) * 31, 31);
        JSONObject jSONObject = this.c;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.a + ", responseHeaders=" + this.b + ", jsonResponse=" + this.c + ')';
    }

    public ej9(int i, Map map, JSONObject jSONObject) {
        map.getClass();
        this.a = i;
        this.b = map;
        this.c = jSONObject;
    }
}
