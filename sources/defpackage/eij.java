package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class eij {
    private static final /* synthetic */ eij[] $VALUES;
    public static final eij IN_IN_OUT_POSITION;
    public static final eij NO_CONFLICT;
    public static final eij OUT_IN_IN_POSITION;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eij] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eij] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, eij] */
    static {
        ?? r0 = new Enum("NO_CONFLICT", 0);
        NO_CONFLICT = r0;
        ?? r1 = new Enum("IN_IN_OUT_POSITION", 1);
        IN_IN_OUT_POSITION = r1;
        ?? r2 = new Enum("OUT_IN_IN_POSITION", 2);
        OUT_IN_IN_POSITION = r2;
        $VALUES = new eij[]{r0, r1, r2};
    }

    public static eij valueOf(String str) {
        return (eij) Enum.valueOf(eij.class, str);
    }

    public static eij[] values() {
        return (eij[]) $VALUES.clone();
    }
}
