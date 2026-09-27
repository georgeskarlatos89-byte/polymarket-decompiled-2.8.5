package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rbb implements Parcelable {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rbb[] $VALUES;
    public static final rbb ALWAYS_DARK;
    public static final rbb ALWAYS_LIGHT;
    public static final rbb AUTOMATIC;
    public static final Parcelable.Creator<rbb> CREATOR;

    /* JADX WARN: Type inference failed for: r0v0, types: [rbb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rbb, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rbb, java.lang.Enum] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        AUTOMATIC = r0;
        ?? r1 = new Enum("ALWAYS_LIGHT", 1);
        ALWAYS_LIGHT = r1;
        ?? r2 = new Enum("ALWAYS_DARK", 2);
        ALWAYS_DARK = r2;
        rbb[] rbbVarArr = {r0, r1, r2};
        $VALUES = rbbVarArr;
        $ENTRIES = new wg7(rbbVarArr);
        CREATOR = new v5a(18);
    }

    public static rbb valueOf(String str) {
        return (rbb) Enum.valueOf(rbb.class, str);
    }

    public static rbb[] values() {
        return (rbb[]) $VALUES.clone();
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
