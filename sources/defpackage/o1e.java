package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o1e {
    public static final o1e Redirect;
    public static final o1e ThreeDS;
    private static final /* synthetic */ o1e[] b;
    private static final /* synthetic */ ug7 c;
    private final String a;

    static {
        o1e o1eVar = new o1e("Redirect", 0, "redirect");
        Redirect = o1eVar;
        o1e o1eVar2 = new o1e("ThreeDS", 1, "3ds");
        ThreeDS = o1eVar2;
        o1e[] o1eVarArr = {o1eVar, o1eVar2};
        b = o1eVarArr;
        c = new wg7(o1eVarArr);
    }

    public o1e(String str, int i, String str2) {
        this.a = str2;
    }

    public static o1e valueOf(String str) {
        return (o1e) Enum.valueOf(o1e.class, str);
    }

    public static o1e[] values() {
        return (o1e[]) b.clone();
    }

    public final String a() {
        return this.a;
    }
}
