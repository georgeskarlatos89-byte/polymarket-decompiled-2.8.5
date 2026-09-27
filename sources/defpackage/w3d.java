package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w3d {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ w3d[] $VALUES;
    public static final w3d Mobile2G;
    public static final w3d Mobile3G;
    public static final w3d Mobile4G;
    public static final w3d Mobile5G;
    public static final w3d Unknown;
    public static final w3d WiFi;
    private final String value;

    static {
        w3d w3dVar = new w3d("WiFi", 0, "Wi-Fi");
        WiFi = w3dVar;
        w3d w3dVar2 = new w3d("Mobile2G", 1, "2G");
        Mobile2G = w3dVar2;
        w3d w3dVar3 = new w3d("Mobile3G", 2, "3G");
        Mobile3G = w3dVar3;
        w3d w3dVar4 = new w3d("Mobile4G", 3, "4G");
        Mobile4G = w3dVar4;
        w3d w3dVar5 = new w3d("Mobile5G", 4, "5G");
        Mobile5G = w3dVar5;
        w3d w3dVar6 = new w3d("Unknown", 5, "unknown");
        Unknown = w3dVar6;
        w3d[] w3dVarArr = {w3dVar, w3dVar2, w3dVar3, w3dVar4, w3dVar5, w3dVar6};
        $VALUES = w3dVarArr;
        $ENTRIES = new wg7(w3dVarArr);
    }

    public w3d(String str, int i, String str2) {
        this.value = str2;
    }

    public static w3d valueOf(String str) {
        return (w3d) Enum.valueOf(w3d.class, str);
    }

    public static w3d[] values() {
        return (w3d[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
