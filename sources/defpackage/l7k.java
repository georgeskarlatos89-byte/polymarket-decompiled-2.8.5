package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l7k extends k7k {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    /* JADX WARN: Type inference failed for: r5v0, types: [b7h, fl0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [b7h, fl0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [b7h, fl0] */
    public l7k(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b7h(), new b7h(), new b7h());
    }

    @Override // defpackage.k7k
    public final l7k a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new l7k(parcel, dataPosition, i, woa.r(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.k7k
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 < this.g) {
                if (i3 != i) {
                    if (String.valueOf(i3).compareTo(String.valueOf(i)) <= 0) {
                        int i4 = this.j;
                        Parcel parcel = this.e;
                        parcel.setDataPosition(i4);
                        int readInt = parcel.readInt();
                        this.k = parcel.readInt();
                        this.j += readInt;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                if (i3 == i) {
                    return true;
                }
                return false;
            }
        }
    }

    @Override // defpackage.k7k
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public l7k(Parcel parcel, int i, int i2, String str, fl0 fl0Var, fl0 fl0Var2, fl0 fl0Var3) {
        super(fl0Var, fl0Var2, fl0Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
