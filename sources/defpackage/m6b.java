package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m6b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ m6b[] $VALUES;
    public static final k6b Companion;
    public static final m6b ON_ANY;
    public static final m6b ON_CREATE;
    public static final m6b ON_DESTROY;
    public static final m6b ON_PAUSE;
    public static final m6b ON_RESUME;
    public static final m6b ON_START;
    public static final m6b ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, m6b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, m6b] */
    static {
        ?? r0 = new Enum("ON_CREATE", 0);
        ON_CREATE = r0;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r2 = new Enum("ON_RESUME", 2);
        ON_RESUME = r2;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        m6b[] m6bVarArr = {r0, r1, r2, r3, r4, r5, r6};
        $VALUES = m6bVarArr;
        $ENTRIES = new wg7(m6bVarArr);
        Companion = new k6b(null);
    }

    public static m6b valueOf(String str) {
        return (m6b) Enum.valueOf(m6b.class, str);
    }

    public static m6b[] values() {
        return (m6b[]) $VALUES.clone();
    }

    public final n6b a() {
        switch (l6b.a[ordinal()]) {
            case 1:
            case 2:
                return n6b.CREATED;
            case 3:
            case 4:
                return n6b.STARTED;
            case 5:
                return n6b.RESUMED;
            case 6:
                return n6b.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                dmk.a();
                return null;
        }
    }
}
