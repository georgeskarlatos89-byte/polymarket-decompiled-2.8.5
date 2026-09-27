package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class s9c implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<s9c> CREATOR = new neb(28);
    public final String a;
    public final Map b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s9c(String str) {
        this(str, r0);
        zc7 zc7Var = zc7.a;
        zc7Var.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s9c) {
            s9c s9cVar = (s9c) obj;
            if (Intrinsics.areEqual(this.a, s9cVar.a) && Intrinsics.areEqual(this.b, s9cVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.a);
        sb.append(", extras=");
        return hdi.s(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Map map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public s9c(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
