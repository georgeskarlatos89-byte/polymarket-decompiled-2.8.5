package androidx.compose.ui.text.input;

import defpackage.gb0;
import defpackage.gvi;
import defpackage.h8m;
import defpackage.lph;
import defpackage.nxi;
import defpackage.woa;
import defpackage.zcg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final zcg d = new zcg(1, new lph(28), new gvi(1));
    public final gb0 a;
    public final long b;
    public final nxi c;

    public TextFieldValue(gb0 gb0Var, long j, nxi nxiVar) {
        nxi nxiVar2;
        this.a = gb0Var;
        this.b = h8m.b(gb0Var.b.length(), j);
        if (nxiVar != null) {
            nxiVar2 = new nxi(h8m.b(gb0Var.b.length(), nxiVar.a));
        } else {
            nxiVar2 = null;
        }
        this.c = nxiVar2;
    }

    public static TextFieldValue a(TextFieldValue textFieldValue, gb0 gb0Var, long j, int i) {
        nxi nxiVar;
        if ((i & 1) != 0) {
            gb0Var = textFieldValue.a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.b;
        }
        if ((i & 4) != 0) {
            nxiVar = textFieldValue.c;
        } else {
            nxiVar = null;
        }
        textFieldValue.getClass();
        return new TextFieldValue(gb0Var, j, nxiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (nxi.b(this.b, textFieldValue.b) && Intrinsics.areEqual(this.c, textFieldValue.c) && Intrinsics.areEqual(this.a, textFieldValue.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = nxi.c;
        int d2 = woa.d(hashCode, 31, this.b);
        nxi nxiVar = this.c;
        if (nxiVar != null) {
            i = Long.hashCode(nxiVar.a);
        } else {
            i = 0;
        }
        return d2 + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) nxi.h(this.b)) + ", composition=" + this.c + ')';
    }

    public TextFieldValue(int i, long j, String str) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? nxi.b : j, (nxi) null);
    }

    public TextFieldValue(String str, long j, nxi nxiVar) {
        this(new gb0(str), j, nxiVar);
    }
}
