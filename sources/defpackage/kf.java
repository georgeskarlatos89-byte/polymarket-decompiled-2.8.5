package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class kf implements Parcelable {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kf[] $VALUES;
    public static final Parcelable.Creator<kf> CREATOR;
    public static final kf HIDDEN;
    public static final kf OPTIONAL;
    public static final kf REQUIRED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, kf] */
    static {
        ?? r0 = new Enum("HIDDEN", 0);
        HIDDEN = r0;
        ?? r1 = new Enum("OPTIONAL", 1);
        OPTIONAL = r1;
        ?? r2 = new Enum("REQUIRED", 2);
        REQUIRED = r2;
        kf[] kfVarArr = {r0, r1, r2};
        $VALUES = kfVarArr;
        $ENTRIES = new wg7(kfVarArr);
        CREATOR = new z4l(16);
    }

    public static kf valueOf(String str) {
        return (kf) Enum.valueOf(kf.class, str);
    }

    public static kf[] values() {
        return (kf[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
