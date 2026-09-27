package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class h78 extends i78 {
    public final x4a[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h78(int i, x4a[] x4aVarArr) {
        super(i, r2, 0, (byte) 0);
        if (x4aVarArr != null) {
            int i2 = 1;
            int length = x4aVarArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                omf.q(x4aVarArr.getClass(), "Empty enum: ");
                throw null;
            }
            this.d = x4aVarArr;
            return;
        }
        dmk.v("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        throw null;
    }

    @Override // defpackage.i78
    public final Object e(int i) {
        int i2 = (1 << this.c) - 1;
        int i3 = this.b;
        int i4 = (i & (i2 << i3)) >> i3;
        for (x4a x4aVar : this.d) {
            if (x4aVar.a() == i4) {
                return x4aVar;
            }
        }
        return null;
    }
}
