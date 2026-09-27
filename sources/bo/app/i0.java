package bo.app;

import defpackage.sv6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i0 {
    public final JSONObject a;
    public final Long b;
    public final List c;

    public i0(JSONObject jSONObject, Long l, List list) {
        jSONObject.getClass();
        list.getClass();
        this.a = jSONObject;
        this.b = l;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (Intrinsics.areEqual(this.a, i0Var.a) && Intrinsics.areEqual(this.b, i0Var.b) && Intrinsics.areEqual(this.c, i0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannersReceivedEvent(bannersData=");
        sb.append(this.a);
        sb.append(", requestTime=");
        sb.append(this.b);
        sb.append(", acknowledgedDismissals=");
        return sv6.r(sb, this.c, ')');
    }
}
