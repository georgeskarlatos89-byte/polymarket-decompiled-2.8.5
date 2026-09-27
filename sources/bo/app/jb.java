package bo.app;

import defpackage.qga;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jb {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public jb(JSONObject jSONObject) {
        Integer c = qga.c(jSONObject, "bg_color");
        Integer c2 = qga.c(jSONObject, "text_color");
        Integer c3 = qga.c(jSONObject, "close_btn_color");
        Integer c4 = qga.c(jSONObject, "icon_color");
        Integer c5 = qga.c(jSONObject, "icon_bg_color");
        Integer c6 = qga.c(jSONObject, "header_text_color");
        Integer c7 = qga.c(jSONObject, "frame_color");
        this.a = c;
        this.b = c2;
        this.c = c3;
        this.d = c4;
        this.e = c5;
        this.f = c6;
        this.g = c7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        if (Intrinsics.areEqual(this.a, jbVar.a) && Intrinsics.areEqual(this.b, jbVar.b) && Intrinsics.areEqual(this.c, jbVar.c) && Intrinsics.areEqual(this.d, jbVar.d) && Intrinsics.areEqual(this.e, jbVar.e) && Intrinsics.areEqual(this.f, jbVar.f) && Intrinsics.areEqual(this.g, jbVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
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
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num4 = this.d;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num5 = this.e;
        if (num5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num6 = this.f;
        if (num6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Integer num7 = this.g;
        if (num7 != null) {
            i = num7.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        return "InAppMessageTheme(backgroundColor=" + this.a + ", textColor=" + this.b + ", closeButtonColor=" + this.c + ", iconColor=" + this.d + ", iconBackgroundColor=" + this.e + ", headerTextColor=" + this.f + ", frameColor=" + this.g + ')';
    }
}
