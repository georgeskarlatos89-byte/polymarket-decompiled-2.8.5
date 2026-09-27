package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.api.Keys;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gw7 extends g5 {
    public static final Parcelable.Creator<gw7> CREATOR = new mbl(27);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public gw7(int i, long j, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long O() {
        long j = this.c;
        if (j == -1) {
            return this.b;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gw7) {
            gw7 gw7Var = (gw7) obj;
            if (dkn.b(this.a, gw7Var.a) && O() == gw7Var.O() && this.d == gw7Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(O()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        ss9Var.R(this.a, Keys.KEY_NAME);
        ss9Var.R(Long.valueOf(O()), "version");
        ss9Var.R(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return ss9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 1, this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        long O = O();
        hxn.o(parcel, 3, 8);
        parcel.writeLong(O);
        hxn.o(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        hxn.q(parcel, p);
    }

    public gw7(String str, long j) {
        this(-1, j, str, false);
    }
}
