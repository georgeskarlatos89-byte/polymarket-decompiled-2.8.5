package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.polymarket.android.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xbe extends ybe {
    public static final Parcelable.Creator<xbe> CREATOR = new u8e(20);
    public final j6e a;
    public final e8e b;
    public final mzj c;

    public /* synthetic */ xbe(j6e j6eVar, w7e w7eVar, mzj mzjVar, int i) {
        this(j6eVar, (i & 2) != 0 ? null : w7eVar, (i & 4) != 0 ? null : mzjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [e8e] */
    public static xbe l(xbe xbeVar, j6e j6eVar, w7e w7eVar, mzj mzjVar, int i) {
        if ((i & 1) != 0) {
            j6eVar = xbeVar.a;
        }
        w7e w7eVar2 = w7eVar;
        if ((i & 2) != 0) {
            w7eVar2 = xbeVar.b;
        }
        if ((i & 4) != 0) {
            mzjVar = xbeVar.c;
        }
        xbeVar.getClass();
        j6eVar.getClass();
        return new xbe(j6eVar, w7eVar2, mzjVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ybe
    public final boolean e() {
        c6e c6eVar = this.a.e;
        if (c6eVar != c6e.USBankAccount && c6eVar != c6e.SepaDebit) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbe)) {
            return false;
        }
        xbe xbeVar = (xbe) obj;
        if (Intrinsics.areEqual(this.a, xbeVar.a) && Intrinsics.areEqual(this.b, xbeVar.b) && Intrinsics.areEqual(this.c, xbeVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ybe
    public final d3g g(String str, boolean z) {
        int i;
        str.getClass();
        c6e c6eVar = this.a.e;
        if (c6eVar == null) {
            i = -1;
        } else {
            i = wbe.a[c6eVar.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return xun.f(R.string.stripe_sepa_mandate, new Object[]{str});
        }
        return xym.b(str, null, false, false, false, false, z);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        e8e e8eVar = this.b;
        if (e8eVar == null) {
            hashCode = 0;
        } else {
            hashCode = e8eVar.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        mzj mzjVar = this.c;
        if (mzjVar != null) {
            i = mzjVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Saved(paymentMethod=" + this.a + ", paymentMethodOptionsParams=" + this.b + ", linkInput=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public xbe(j6e j6eVar, e8e e8eVar, mzj mzjVar) {
        j6eVar.getClass();
        this.a = j6eVar;
        this.b = e8eVar;
        this.c = mzjVar;
    }
}
