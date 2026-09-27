package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bub {
    private static final /* synthetic */ bub[] $VALUES;
    public static final bub DEFAULT;
    public static final bub STRING;

    static {
        bub bubVar = new bub() { // from class: ztb
        };
        DEFAULT = bubVar;
        bub bubVar2 = new bub() { // from class: aub
        };
        STRING = bubVar2;
        $VALUES = new bub[]{bubVar, bubVar2};
    }

    public static bub valueOf(String str) {
        return (bub) Enum.valueOf(bub.class, str);
    }

    public static bub[] values() {
        return (bub[]) $VALUES.clone();
    }
}
