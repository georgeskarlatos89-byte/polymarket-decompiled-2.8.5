package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o9i implements Parcelable {
    public static final Parcelable.Creator<o9i> CREATOR = new r7i(8);
    public final m9i a;
    public final h8i b;
    public final zqi c;
    public final AbstractMap d;
    public final HashMap e;
    public final String f;

    public o9i(Parcel parcel) {
        this.f = parcel.readString();
        this.a = (m9i) parcel.readParcelable(m9i.class.getClassLoader());
        this.b = (h8i) parcel.readParcelable(h8i.class.getClassLoader());
        this.c = (zqi) parcel.readParcelable(d9i.class.getClassLoader());
        this.d = new HashMap();
        Bundle readBundle = parcel.readBundle(o9i.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                mr1 mr1Var = (mr1) din.b(readBundle, str, mr1.class);
                if (mr1Var != null) {
                    this.d.put(etj.valueOf(str), mr1Var);
                }
            }
        }
        this.e = new HashMap();
        Bundle readBundle2 = parcel.readBundle(o9i.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                mr1 mr1Var2 = (mr1) din.b(readBundle2, str2, mr1.class);
                if (mr1Var2 != null) {
                    this.e.put(str2, mr1Var2);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final mr1 e(etj etjVar) {
        return (mr1) this.d.get(etjVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o9i) {
                o9i o9iVar = (o9i) obj;
                if (!Intrinsics.areEqual(this.a, o9iVar.a) || !Intrinsics.areEqual(this.f, o9iVar.f) || !Intrinsics.areEqual(this.b, o9iVar.b) || !Intrinsics.areEqual(this.c, o9iVar.c) || !Intrinsics.areEqual(this.d, o9iVar.d) || !Intrinsics.areEqual(this.e, o9iVar.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Arrays.copyOf(new Object[]{this.a, this.f, this.b, this.c, this.d, this.e}, 6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable((d9i) this.c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.d.entrySet()) {
            bundle.putParcelable(((etj) entry.getKey()).name(), (v5i) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.e.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (v5i) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public o9i() {
        this.d = new EnumMap(etj.class);
        this.e = new HashMap();
    }
}
