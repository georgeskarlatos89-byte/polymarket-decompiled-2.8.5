package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class pgk implements Parcelable {
    public static final Parcelable.Creator<pgk> CREATOR = new iek(1);
    public final String a;
    public final String b;
    public final ogk c;

    public pgk(String str, String str2, ogk ogkVar) {
        str.getClass();
        str2.getClass();
        ogkVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = ogkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgk)) {
            return false;
        }
        pgk pgkVar = (pgk) obj;
        if (Intrinsics.areEqual(this.a, pgkVar.a) && Intrinsics.areEqual(this.b, pgkVar.b) && this.c == pgkVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hdi.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = m51.r("Warning(id=", this.a, ", message=", this.b, ", severity=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
