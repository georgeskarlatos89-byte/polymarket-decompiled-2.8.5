package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z17 implements Comparator, Parcelable {
    public static final Parcelable.Creator<z17> CREATOR = new ji5(20);
    public final y17[] a;
    public int b;
    public final String c;
    public final int d;

    public z17(Parcel parcel) {
        this.c = parcel.readString();
        y17[] y17VarArr = (y17[]) parcel.createTypedArray(y17.CREATOR);
        int i = u1k.a;
        this.a = y17VarArr;
        this.d = y17VarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        y17 y17Var = (y17) obj;
        y17 y17Var2 = (y17) obj2;
        UUID uuid = uw1.a;
        if (uuid.equals(y17Var.b)) {
            if (uuid.equals(y17Var2.b)) {
                return 0;
            }
            return 1;
        }
        return y17Var.b.compareTo(y17Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final z17 e(String str) {
        if (Objects.equals(this.c, str)) {
            return this;
        }
        return new z17(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z17.class == obj.getClass()) {
            z17 z17Var = (z17) obj;
            if (Objects.equals(this.c, z17Var.c) && Arrays.equals(this.a, z17Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        if (i == 0) {
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.a);
            this.b = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public z17(String str, boolean z, y17... y17VarArr) {
        this.c = str;
        y17VarArr = z ? (y17[]) y17VarArr.clone() : y17VarArr;
        this.a = y17VarArr;
        this.d = y17VarArr.length;
        Arrays.sort(y17VarArr, this);
    }
}
