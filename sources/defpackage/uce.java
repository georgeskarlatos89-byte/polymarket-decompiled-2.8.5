package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uce implements Parcelable {
    public static final Parcelable.Creator<uce> CREATOR = new lce(2);
    public final sce a;
    public final sce b;
    public final sce c;
    public final rce d;
    public final boolean e;
    public final Set f;
    public final Lazy g;

    public uce(sce sceVar, sce sceVar2, sce sceVar3, rce rceVar, boolean z, Set set) {
        sceVar.getClass();
        sceVar2.getClass();
        sceVar3.getClass();
        rceVar.getClass();
        set.getClass();
        this.a = sceVar;
        this.b = sceVar2;
        this.c = sceVar3;
        this.d = rceVar;
        this.e = z;
        this.f = set;
        this.g = LazyKt.lazy(new mcd(this, 14));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Set e() {
        return (Set) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uce)) {
            return false;
        }
        uce uceVar = (uce) obj;
        if (this.a == uceVar.a && this.b == uceVar.b && this.c == uceVar.c && this.d == uceVar.d && this.e == uceVar.e && Intrinsics.areEqual(this.f, uceVar.f)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.c == sce.Always) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + hdi.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final boolean l() {
        if (this.a == sce.Always) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.b == sce.Always) {
            return true;
        }
        return false;
    }

    public final zy8 p() {
        yy8 yy8Var;
        int[] iArr = tce.a;
        rce rceVar = this.d;
        int i = iArr[rceVar.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                yy8Var = yy8.Full;
            } else {
                dmk.a();
                return null;
            }
        } else {
            yy8Var = yy8.Min;
        }
        if (rceVar != rce.Full && !o()) {
            z = false;
        }
        return new zy8(z, yy8Var, o());
    }

    public final String toString() {
        return "BillingDetailsCollectionConfiguration(name=" + this.a + ", phone=" + this.b + ", email=" + this.c + ", address=" + this.d + ", attachDefaultsToPaymentMethod=" + this.e + ", allowedCountries=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e ? 1 : 0);
        Set set = this.f;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uce(sce sceVar, sce sceVar2, sce sceVar3, rce rceVar, boolean z) {
        this(sceVar, sceVar2, sceVar3, rceVar, z, fd7.a);
        sceVar.getClass();
        sceVar2.getClass();
        sceVar3.getClass();
        rceVar.getClass();
    }
}
