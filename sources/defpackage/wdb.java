package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class wdb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wdb[] $VALUES;
    public static final wdb DISABLED;
    public static final wdb ENABLED;
    public static final wdb ENABLED_NO_WEB_FALLBACK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wdb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wdb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wdb] */
    static {
        ?? r0 = new Enum("DISABLED", 0);
        DISABLED = r0;
        ?? r1 = new Enum("ENABLED", 1);
        ENABLED = r1;
        ?? r2 = new Enum("ENABLED_NO_WEB_FALLBACK", 2);
        ENABLED_NO_WEB_FALLBACK = r2;
        wdb[] wdbVarArr = {r0, r1, r2};
        $VALUES = wdbVarArr;
        $ENTRIES = new wg7(wdbVarArr);
    }

    public static wdb valueOf(String str) {
        return (wdb) Enum.valueOf(wdb.class, str);
    }

    public static wdb[] values() {
        return (wdb[]) $VALUES.clone();
    }
}
