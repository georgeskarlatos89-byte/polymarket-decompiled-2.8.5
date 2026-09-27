package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class uff {
    private static final /* synthetic */ uff[] $VALUES;
    public static final uff PROTO2;
    public static final uff PROTO3;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, uff] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, uff] */
    static {
        ?? r0 = new Enum("PROTO2", 0);
        PROTO2 = r0;
        ?? r1 = new Enum("PROTO3", 1);
        PROTO3 = r1;
        $VALUES = new uff[]{r0, r1};
    }

    public static uff valueOf(String str) {
        return (uff) Enum.valueOf(uff.class, str);
    }

    public static uff[] values() {
        return (uff[]) $VALUES.clone();
    }
}
