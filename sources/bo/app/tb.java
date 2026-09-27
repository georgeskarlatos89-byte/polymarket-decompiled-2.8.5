package bo.app;

import defpackage.qga;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tb {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public tb(JSONObject jSONObject) {
        Integer c = qga.c(jSONObject, "bg_color");
        Integer c2 = qga.c(jSONObject, "text_color");
        Integer c3 = qga.c(jSONObject, "border_color");
        this.a = c;
        this.b = c2;
        this.c = c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb)) {
            return false;
        }
        tb tbVar = (tb) obj;
        if (Intrinsics.areEqual(this.a, tbVar.a) && Intrinsics.areEqual(this.b, tbVar.b) && Intrinsics.areEqual(this.c, tbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num3 = this.c;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "MessageButtonTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", borderColor=" + this.c + ')';
    }
}
