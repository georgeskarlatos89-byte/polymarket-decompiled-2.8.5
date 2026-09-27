package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xjg {
    public final Function0 a;
    public final Function0 b;
    public final boolean c;

    public xjg(Function0 function0, Function0 function02, boolean z) {
        this.a = function0;
        this.b = function02;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.a.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.b.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return hdi.t(sb, this.c, ')');
    }
}
