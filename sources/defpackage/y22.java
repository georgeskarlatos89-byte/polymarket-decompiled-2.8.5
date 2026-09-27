package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class y22 {
    public final String a;
    public final String b;
    public final List c;
    public final Function0 d;
    public final String e;
    public final x22 f;
    public final boolean g;
    public final boolean h;
    public final Boolean i;
    public final Boolean j;

    public /* synthetic */ y22(String str, String str2, List list, Function0 function0, String str3, x22 x22Var, boolean z, boolean z2, Boolean bool, Boolean bool2, int i) {
        this(str, (i & 2) != 0 ? null : str2, list, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? x22.Standard : x22Var, (i & 256) != 0 ? false : z, (i & Barcode.FORMAT_UPC_A) != 0 ? false : z2, (i & Barcode.FORMAT_UPC_E) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y22) {
                y22 y22Var = (y22) obj;
                if (!Intrinsics.areEqual(this.a, y22Var.a) || !Intrinsics.areEqual(this.b, y22Var.b) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.c, y22Var.c) || !Intrinsics.areEqual(this.d, y22Var.d) || !Intrinsics.areEqual(this.e, y22Var.e) || this.f != y22Var.f || this.g != y22Var.g || this.h != y22Var.h || !Intrinsics.areEqual(this.i, y22Var.i) || !Intrinsics.areEqual(this.j, y22Var.j)) {
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
        int hashCode5 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int f = hdi.f((hashCode5 + hashCode) * 29791, 31, this.c);
        Function0 function0 = this.d;
        if (function0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = function0.hashCode();
        }
        int i2 = (f + hashCode2) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int g = hdi.g(hdi.g((this.f.hashCode() + ((i2 + hashCode3) * 31)) * 31, 31, this.g), 31, this.h);
        Boolean bool = this.i;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i3 = (g + hashCode4) * 31;
        Boolean bool2 = this.j;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder r = m51.r("CUICollectionSection(id=", this.a, ", title=", this.b, ", titleBadgeCount=null, headerImage=null, items=");
        r.append(this.c);
        r.append(", onHeaderTapped=");
        r.append(this.d);
        r.append(", headerActionLabel=");
        r.append(this.e);
        r.append(", headerStyle=");
        r.append(this.f);
        r.append(", showSectionDivider=");
        hdi.B(r, this.g, ", showItemDividers=", this.h, ", stickyHeader=");
        r.append(this.i);
        r.append(", headerShowsDivider=");
        r.append(this.j);
        r.append(")");
        return r.toString();
    }

    public y22(String str, String str2, List list, Function0 function0, String str3, x22 x22Var, boolean z, boolean z2, Boolean bool, Boolean bool2) {
        str.getClass();
        list.getClass();
        x22Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = function0;
        this.e = str3;
        this.f = x22Var;
        this.g = z;
        this.h = z2;
        this.i = bool;
        this.j = bool2;
    }
}
