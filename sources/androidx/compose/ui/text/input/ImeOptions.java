package androidx.compose.ui.text.input;

import defpackage.hdi;
import defpackage.jpb;
import defpackage.loa;
import defpackage.roa;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeOptions {
    public static final ImeOptions g = new ImeOptions(false, 0, true, 1, 1, jpb.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final jpb f;

    public ImeOptions(boolean z, int i, boolean z2, int i2, int i3, jpb jpbVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = jpbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        if (this.a == imeOptions.a && this.b == imeOptions.b && this.c == imeOptions.c && this.d == imeOptions.d && this.e == imeOptions.e && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.f, imeOptions.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.a.hashCode() + woa.b(this.e, woa.b(this.d, hdi.g(woa.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) loa.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) roa.a(this.d)) + ", imeAction=" + ((Object) ImeAction.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
