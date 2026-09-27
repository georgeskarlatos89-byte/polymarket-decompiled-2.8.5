package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rui extends sui {
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rui(int i, int i2, List list) {
        this(i, list, r3);
        boolean z;
        list = (i2 & 2) != 0 ? null : list;
        if ((i2 & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
    }

    @Override // defpackage.oui
    public final boolean a() {
        return false;
    }

    @Override // defpackage.oui
    public final boolean b(boolean z, boolean z2) {
        return true;
    }

    @Override // defpackage.sui, defpackage.oui
    public final boolean c() {
        return this.b;
    }

    public rui(mz7 mz7Var) {
        super(mz7Var);
        this.b = false;
    }

    public rui(int i, List list, boolean z) {
        super(new lz7(i, list));
        this.b = z;
    }
}
