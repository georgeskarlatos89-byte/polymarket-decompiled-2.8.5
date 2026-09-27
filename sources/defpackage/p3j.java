package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class p3j {
    private static final /* synthetic */ p3j[] $VALUES;
    public static final p3j ALGORITHM_NOT_FIPS;
    public static final p3j ALGORITHM_REQUIRES_BORINGCRYPTO;

    static {
        p3j p3jVar = new p3j() { // from class: n3j
            @Override // defpackage.p3j
            public final boolean a() {
                return !q3j.a();
            }
        };
        ALGORITHM_NOT_FIPS = p3jVar;
        p3j p3jVar2 = new p3j() { // from class: o3j
            @Override // defpackage.p3j
            public final boolean a() {
                Boolean bool;
                if (q3j.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                    } catch (Exception unused) {
                        q3j.a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (!bool.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
        };
        ALGORITHM_REQUIRES_BORINGCRYPTO = p3jVar2;
        $VALUES = new p3j[]{p3jVar, p3jVar2};
    }

    public static p3j valueOf(String str) {
        return (p3j) Enum.valueOf(p3j.class, str);
    }

    public static p3j[] values() {
        return (p3j[]) $VALUES.clone();
    }

    public abstract boolean a();
}
