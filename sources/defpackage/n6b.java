package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n6b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n6b[] $VALUES;
    public static final n6b CREATED;
    public static final n6b DESTROYED;
    public static final n6b INITIALIZED;
    public static final n6b RESUMED;
    public static final n6b STARTED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n6b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n6b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n6b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n6b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, n6b] */
    static {
        ?? r0 = new Enum("DESTROYED", 0);
        DESTROYED = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        INITIALIZED = r1;
        ?? r2 = new Enum("CREATED", 2);
        CREATED = r2;
        ?? r3 = new Enum("STARTED", 3);
        STARTED = r3;
        ?? r4 = new Enum("RESUMED", 4);
        RESUMED = r4;
        n6b[] n6bVarArr = {r0, r1, r2, r3, r4};
        $VALUES = n6bVarArr;
        $ENTRIES = new wg7(n6bVarArr);
    }

    public static n6b valueOf(String str) {
        return (n6b) Enum.valueOf(n6b.class, str);
    }

    public static n6b[] values() {
        return (n6b[]) $VALUES.clone();
    }

    public final boolean a(n6b n6bVar) {
        n6bVar.getClass();
        if (compareTo(n6bVar) >= 0) {
            return true;
        }
        return false;
    }
}
