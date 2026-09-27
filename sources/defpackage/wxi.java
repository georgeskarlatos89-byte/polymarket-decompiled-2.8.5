package defpackage;

import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultColors;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wxi {
    public final int a;
    public final FontFamily b;
    public final FontStyle c;
    public final FontWeight d;
    public final long e;
    public final lqi f;
    public final Integer g;
    public final Integer h;

    public wxi(int i, FontFamily fontFamily, FontStyle fontStyle, FontWeight fontWeight, long j, lqi lqiVar, Integer num, Integer num2, int i2) {
        i = (i2 & 1) != 0 ? 14 : i;
        fontFamily = (i2 & 2) != 0 ? hp6.a : fontFamily;
        fontStyle = (i2 & 4) != 0 ? FontStyle.Normal : fontStyle;
        fontWeight = (i2 & 8) != 0 ? FontWeight.Normal : fontWeight;
        j = (i2 & 16) != 0 ? DefaultColors.PRIMARY : j;
        lqiVar = (i2 & 32) != 0 ? lqi.Start : lqiVar;
        num = (i2 & 256) != 0 ? null : num;
        num2 = (i2 & Barcode.FORMAT_UPC_A) != 0 ? null : num2;
        fontFamily.getClass();
        fontStyle.getClass();
        fontWeight.getClass();
        lqiVar.getClass();
        this.a = i;
        this.b = fontFamily;
        this.c = fontStyle;
        this.d = fontWeight;
        this.e = j;
        this.f = lqiVar;
        this.g = num;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wxi) {
                wxi wxiVar = (wxi) obj;
                if (this.a != wxiVar.a || !Intrinsics.areEqual(this.b, wxiVar.b) || this.c != wxiVar.c || this.d != wxiVar.d || this.e != wxiVar.e || this.f != wxiVar.f || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.g, wxiVar.g) || !Intrinsics.areEqual(this.h, wxiVar.h)) {
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
        int b = woa.b(bd0.API_PRIORITY_OTHER, (this.f.hashCode() + woa.d((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31, 961);
        int i = 0;
        Integer num = this.g;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Integer num2 = this.h;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "TextStyle(size=" + this.a + ", fontFamily=" + this.b + ", fontStyle=" + this.c + ", fontWeight=" + this.d + ", color=" + this.e + ", textAlign=" + this.f + ", maxLines=2147483647, maxLength=null, lineHeight=" + this.g + ", letterSpacing=" + this.h + ")";
    }
}
