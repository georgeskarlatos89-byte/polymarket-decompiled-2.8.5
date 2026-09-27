package defpackage;

import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pwi {
    public static final int e = FontFamily.$stable;
    public final String a;
    public final Integer b;
    public final wxi c;
    public final boolean d;

    public /* synthetic */ pwi(String str, Integer num, wxi wxiVar, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new wxi(0, null, null, null, 0L, null, null, null, 1023) : wxiVar, false);
    }

    public static pwi a(pwi pwiVar, String str) {
        Integer num = pwiVar.b;
        wxi wxiVar = pwiVar.c;
        boolean z = pwiVar.d;
        pwiVar.getClass();
        str.getClass();
        wxiVar.getClass();
        return new pwi(str, num, wxiVar, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pwi) {
                pwi pwiVar = (pwi) obj;
                if (!Intrinsics.areEqual(this.a, pwiVar.a) || !Intrinsics.areEqual(this.b, pwiVar.b) || !Intrinsics.areEqual(this.c, pwiVar.c) || this.d != pwiVar.d) {
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
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "TextLabelStyle(text=" + this.a + ", textId=" + this.b + ", textStyle=" + this.c + ", isLabelPreparingForInputField=" + this.d + ")";
    }

    public pwi(String str, Integer num, wxi wxiVar, boolean z) {
        str.getClass();
        wxiVar.getClass();
        this.a = str;
        this.b = num;
        this.c = wxiVar;
        this.d = z;
    }
}
