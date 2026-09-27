package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vff {
    private static final /* synthetic */ vff[] $VALUES;
    public static final vff EDITIONS;
    public static final vff PROTO2;
    public static final vff PROTO3;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vff] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vff] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vff] */
    static {
        ?? r0 = new Enum("PROTO2", 0);
        PROTO2 = r0;
        ?? r1 = new Enum("PROTO3", 1);
        PROTO3 = r1;
        ?? r2 = new Enum("EDITIONS", 2);
        EDITIONS = r2;
        $VALUES = new vff[]{r0, r1, r2};
    }

    public static vff valueOf(String str) {
        return (vff) Enum.valueOf(vff.class, str);
    }

    public static vff[] values() {
        return (vff[]) $VALUES.clone();
    }
}
