package defpackage;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ooa {
    public static final ooa e = new ooa(0, 0, 0, 127);
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    public ooa(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : Boolean.FALSE, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
    }

    public static ooa a(ooa ooaVar, int i, int i2, int i3) {
        int i4 = ooaVar.a;
        Boolean bool = ooaVar.b;
        if ((i3 & 4) != 0) {
            i = ooaVar.c;
        }
        if ((i3 & 8) != 0) {
            i2 = ooaVar.d;
        }
        ooaVar.getClass();
        ooaVar.getClass();
        return new ooa(i4, bool, i, i2);
    }

    public final ImeOptions b(boolean z) {
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        loa loaVar = new loa(i3);
        ImeAction imeAction = null;
        if (i3 == -1) {
            loaVar = null;
        }
        if (loaVar != null) {
            i = loaVar.a;
        } else {
            i = 0;
        }
        int i4 = i;
        int i5 = 1;
        Boolean bool = this.b;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i6 = this.c;
        roa roaVar = new roa(i6);
        if (i6 == 0) {
            roaVar = null;
        }
        if (roaVar != null) {
            i2 = roaVar.a;
        } else {
            i2 = 1;
        }
        int i7 = this.d;
        ImeAction imeAction2 = new ImeAction(i7);
        if (i7 != -1) {
            imeAction = imeAction2;
        }
        if (imeAction != null) {
            i5 = imeAction.a;
        }
        return new ImeOptions(z, i4, z2, i2, i5, jpb.c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ooa) {
                ooa ooaVar = (ooa) obj;
                if (this.a == ooaVar.a && Intrinsics.areEqual(this.b, ooaVar.b) && this.c == ooaVar.c && this.d == ooaVar.d && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        return woa.b(this.d, woa.b(this.c, (hashCode + i) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) loa.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) roa.a(this.c)) + ", imeAction=" + ((Object) ImeAction.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public ooa(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }
}
