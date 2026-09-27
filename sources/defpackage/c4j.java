package defpackage;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class c4j {
    private static final /* synthetic */ c4j[] $VALUES;
    public static final c4j BIG_DECIMAL;
    public static final c4j DOUBLE;
    public static final c4j LAZILY_PARSED_NUMBER;
    public static final c4j LONG_OR_DOUBLE;

    static {
        c4j c4jVar = new c4j() { // from class: y3j
            @Override // defpackage.c4j
            public final Number a(ufa ufaVar) {
                return Double.valueOf(ufaVar.nextDouble());
            }
        };
        DOUBLE = c4jVar;
        c4j c4jVar2 = new c4j() { // from class: z3j
            @Override // defpackage.c4j
            public final Number a(ufa ufaVar) {
                return new bya(ufaVar.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = c4jVar2;
        c4j c4jVar3 = new c4j() { // from class: a4j
            public static Double b(String str, ufa ufaVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (ufaVar.b != g1i.LENIENT) {
                        throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + ufaVar.p(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e) {
                    StringBuilder s = ix2.s("Cannot parse ", str, "; at path ");
                    s.append(ufaVar.p(true));
                    throw new RuntimeException(s.toString(), e);
                }
            }

            @Override // defpackage.c4j
            public final Number a(ufa ufaVar) {
                String nextString = ufaVar.nextString();
                if (nextString.indexOf(46) >= 0) {
                    return b(nextString, ufaVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(nextString));
                } catch (NumberFormatException unused) {
                    return b(nextString, ufaVar);
                }
            }
        };
        LONG_OR_DOUBLE = c4jVar3;
        c4j c4jVar4 = new c4j() { // from class: b4j
            @Override // defpackage.c4j
            public final Number a(ufa ufaVar) {
                String nextString = ufaVar.nextString();
                try {
                    return sjn.c(nextString);
                } catch (NumberFormatException e) {
                    StringBuilder s = ix2.s("Cannot parse ", nextString, "; at path ");
                    s.append(ufaVar.p(true));
                    throw new RuntimeException(s.toString(), e);
                }
            }
        };
        BIG_DECIMAL = c4jVar4;
        $VALUES = new c4j[]{c4jVar, c4jVar2, c4jVar3, c4jVar4};
    }

    public static c4j valueOf(String str) {
        return (c4j) Enum.valueOf(c4j.class, str);
    }

    public static c4j[] values() {
        return (c4j[]) $VALUES.clone();
    }

    public abstract Number a(ufa ufaVar);
}
