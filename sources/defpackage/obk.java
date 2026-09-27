package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class obk {
    public final Object a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public obk(View view, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.a = view;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = z;
        this.j = z2;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof obk) {
                obk obkVar = (obk) obj;
                if (!Intrinsics.areEqual(this.a, obkVar.a) || !Intrinsics.areEqual(this.b, obkVar.b) || !Intrinsics.areEqual(this.c, obkVar.c) || !Intrinsics.areEqual(this.d, obkVar.d) || !Intrinsics.areEqual(this.e, obkVar.e) || !Intrinsics.areEqual(this.f, obkVar.f) || !Intrinsics.areEqual(this.g, obkVar.g) || !Intrinsics.areEqual(this.h, obkVar.h) || this.i != obkVar.i || this.j != obkVar.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int e = hdi.e((i6 + hashCode6) * 31, 31, this.g);
        String str6 = this.h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return Boolean.hashCode(this.j) + hdi.g((e + i) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTarget(_view=");
        sb.append(this.a);
        sb.append(", className=");
        sb.append(this.b);
        sb.append(", resourceName=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", text=");
        sb.append(this.e);
        sb.append(", accessibilityLabel=");
        sb.append(this.f);
        sb.append(", source=");
        sb.append(this.g);
        sb.append(", hierarchy=");
        sb.append(this.h);
        sb.append(", ampIgnoreRageClick=");
        sb.append(this.i);
        sb.append(", ampIgnoreDeadClick=");
        return hdi.t(sb, this.j, ')');
    }
}
