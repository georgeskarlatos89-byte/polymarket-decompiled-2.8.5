package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.KeyPair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class bv9 implements Parcelable {
    public static final Parcelable.Creator<bv9> CREATOR = new hl9(6);
    public final String a;
    public final KeyPair b;
    public final cd3 c;
    public final int d;
    public final w3a e;

    public bv9(String str, KeyPair keyPair, cd3 cd3Var, int i, w3a w3aVar) {
        str.getClass();
        keyPair.getClass();
        cd3Var.getClass();
        w3aVar.getClass();
        this.a = str;
        this.b = keyPair;
        this.c = cd3Var;
        this.d = i;
        this.e = w3aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv9)) {
            return false;
        }
        bv9 bv9Var = (bv9) obj;
        if (Intrinsics.areEqual(this.a, bv9Var.a) && Intrinsics.areEqual(this.b, bv9Var.b) && Intrinsics.areEqual(this.c, bv9Var.c) && this.d == bv9Var.d && Intrinsics.areEqual(this.e, bv9Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + woa.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.a + ", sdkKeyPair=" + this.b + ", challengeParameters=" + this.c + ", timeoutMins=" + this.d + ", intentData=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d);
        this.e.writeToParcel(parcel, i);
    }
}
