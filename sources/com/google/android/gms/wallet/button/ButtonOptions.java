package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.dkn;
import defpackage.g5;
import defpackage.hxn;
import defpackage.o4l;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ButtonOptions extends g5 implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new o4l(3);
    public int a;
    public int b;
    public int c;
    public String d;
    public boolean e = false;

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (dkn.b(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && dkn.b(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && dkn.b(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && dkn.b(this.d, buttonOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        int i2 = this.a;
        hxn.o(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        hxn.o(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        hxn.o(parcel, 3, 4);
        parcel.writeInt(i4);
        hxn.j(parcel, 4, this.d);
        hxn.q(parcel, p);
    }
}
