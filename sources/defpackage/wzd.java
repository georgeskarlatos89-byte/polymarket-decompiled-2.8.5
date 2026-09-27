package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wzd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wzd[] $VALUES;
    public static final wzd NO_CONTACT_INFORMATION;
    public static final wzd RETAIN_CONTACT_INFORMATION;
    public static final wzd UPDATE_CONTACT_INFORMATION;
    private final String stringValue;

    static {
        wzd wzdVar = new wzd("NO_CONTACT_INFORMATION", 0, "NO_CONTACT_INFO");
        NO_CONTACT_INFORMATION = wzdVar;
        wzd wzdVar2 = new wzd("RETAIN_CONTACT_INFORMATION", 1, "RETAIN_CONTACT_INFO");
        RETAIN_CONTACT_INFORMATION = wzdVar2;
        wzd wzdVar3 = new wzd("UPDATE_CONTACT_INFORMATION", 2, "UPDATE_CONTACT_INFO");
        UPDATE_CONTACT_INFORMATION = wzdVar3;
        wzd[] wzdVarArr = {wzdVar, wzdVar2, wzdVar3};
        $VALUES = wzdVarArr;
        $ENTRIES = new wg7(wzdVarArr);
    }

    public wzd(String str, int i, String str2) {
        this.stringValue = str2;
    }

    public static wzd valueOf(String str) {
        return (wzd) Enum.valueOf(wzd.class, str);
    }

    public static wzd[] values() {
        return (wzd[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringValue;
    }
}
