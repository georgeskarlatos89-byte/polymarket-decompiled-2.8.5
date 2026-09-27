package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n0g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n0g[] $VALUES;
    public static final m0g Companion;
    public static final n0g IGNORE;
    public static final n0g STRICT;
    public static final n0g WARN;
    private final String description;

    /* JADX WARN: Type inference failed for: r0v2, types: [m0g, java.lang.Object] */
    static {
        n0g n0gVar = new n0g("IGNORE", 0, "ignore");
        IGNORE = n0gVar;
        n0g n0gVar2 = new n0g("WARN", 1, "warn");
        WARN = n0gVar2;
        n0g n0gVar3 = new n0g("STRICT", 2, "strict");
        STRICT = n0gVar3;
        n0g[] n0gVarArr = {n0gVar, n0gVar2, n0gVar3};
        $VALUES = n0gVarArr;
        $ENTRIES = new wg7(n0gVarArr);
        Companion = new Object();
    }

    public n0g(String str, int i, String str2) {
        this.description = str2;
    }

    public static n0g valueOf(String str) {
        return (n0g) Enum.valueOf(n0g.class, str);
    }

    public static n0g[] values() {
        return (n0g[]) $VALUES.clone();
    }

    public final String a() {
        return this.description;
    }

    public final boolean b() {
        if (this == WARN) {
            return true;
        }
        return false;
    }
}
