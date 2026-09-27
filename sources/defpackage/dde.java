package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dde implements Parcelable {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dde[] $VALUES;
    public static final Parcelable.Creator<dde> CREATOR;
    public static final dde Credit;
    public static final dde Debit;
    public static final dde Prepaid;
    public static final dde Unknown;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dde] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dde] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dde] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, dde] */
    static {
        ?? r0 = new Enum("Debit", 0);
        Debit = r0;
        ?? r1 = new Enum("Credit", 1);
        Credit = r1;
        ?? r2 = new Enum("Prepaid", 2);
        Prepaid = r2;
        ?? r3 = new Enum("Unknown", 3);
        Unknown = r3;
        dde[] ddeVarArr = {r0, r1, r2, r3};
        $VALUES = ddeVarArr;
        $ENTRIES = new wg7(ddeVarArr);
        CREATOR = new lce(8);
    }

    public static ug7 g() {
        return $ENTRIES;
    }

    public static dde valueOf(String str) {
        return (dde) Enum.valueOf(dde.class, str);
    }

    public static dde[] values() {
        return (dde[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p63 e() {
        int i = cde.a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return p63.Unknown;
                    }
                    dmk.a();
                    return null;
                }
                return p63.Prepaid;
            }
            return p63.Credit;
        }
        return p63.Debit;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
