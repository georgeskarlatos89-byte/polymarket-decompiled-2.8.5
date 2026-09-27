package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ag5 extends g5 {
    public static final Parcelable.Creator<ag5> CREATOR = new rwl(16);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    public ag5(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag5)) {
            return false;
        }
        ag5 ag5Var = (ag5) obj;
        if (this.a != ag5Var.a || this.b != ag5Var.b || this.c != ag5Var.c || this.d != ag5Var.d || this.e != ag5Var.e || this.f != ag5Var.f || !dkn.b(this.g, ag5Var.g) || !dkn.b(this.h, ag5Var.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        StringBuilder s = sv6.s("CurrentLocationRequest[");
        s.append(jcn.f(this.c));
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            s.append(", maxAge=");
            tul.a(j, s);
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            ix2.A(s, ", duration=", j2, "ms");
        }
        int i = this.b;
        if (i != 0) {
            s.append(", ");
            s.append(xgn.h(i));
        }
        if (this.e) {
            s.append(", bypass");
        }
        int i2 = this.f;
        if (i2 != 0) {
            s.append(", ");
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        omf.a();
                        return null;
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            s.append(str);
        }
        WorkSource workSource = this.g;
        if (!uok.b(workSource)) {
            s.append(", workSource=");
            s.append(workSource);
        }
        ClientIdentity clientIdentity = this.h;
        if (clientIdentity != null) {
            s.append(", impersonation=");
            s.append(clientIdentity);
        }
        s.append(']');
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        hxn.o(parcel, 4, 8);
        parcel.writeLong(this.d);
        hxn.o(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        hxn.i(parcel, 6, this.g, i);
        hxn.o(parcel, 7, 4);
        parcel.writeInt(this.f);
        hxn.i(parcel, 9, this.h, i);
        hxn.q(parcel, p);
    }
}
