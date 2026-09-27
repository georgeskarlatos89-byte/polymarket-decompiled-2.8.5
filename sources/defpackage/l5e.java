package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l5e implements j8i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l5e[] $VALUES;
    public static final l5e ALWAYS;
    public static final Parcelable.Creator<l5e> CREATOR;
    public static final l5e LIMITED;
    public static final l5e UNSPECIFIED;
    private final String value;

    static {
        l5e l5eVar = new l5e("UNSPECIFIED", 0, "unspecified");
        UNSPECIFIED = l5eVar;
        l5e l5eVar2 = new l5e("LIMITED", 1, "limited");
        LIMITED = l5eVar2;
        l5e l5eVar3 = new l5e("ALWAYS", 2, "always");
        ALWAYS = l5eVar3;
        l5e[] l5eVarArr = {l5eVar, l5eVar2, l5eVar3};
        $VALUES = l5eVarArr;
        $ENTRIES = new wg7(l5eVarArr);
        CREATOR = new i5e(1);
    }

    public l5e(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 e() {
        return $ENTRIES;
    }

    public static l5e valueOf(String str) {
        return (l5e) Enum.valueOf(l5e.class, str);
    }

    public static l5e[] values() {
        return (l5e[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String g() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
