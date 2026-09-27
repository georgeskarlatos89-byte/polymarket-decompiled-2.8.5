package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jkg implements fpd {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public xjg e = null;
    public xjg f = null;

    public jkg(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.fpd
    public final boolean c0() {
        return this.b.contains(this);
    }
}
