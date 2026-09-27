package defpackage;

import java.util.Arrays;
import java.util.Optional;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tvd {
    public static final char[] c;
    public static final char[] d;
    public static final tvd e;
    public final char[] a;
    public final char[] b;

    static {
        char[] cArr = {'T', 't', ' '};
        c = cArr;
        char[] cArr2 = {'.'};
        d = cArr2;
        e = new tvd(cArr, cArr2);
        new tvd(new char[]{'T'}, cArr2);
    }

    public tvd(char[] cArr, char[] cArr2) {
        this.a = (char[]) Optional.ofNullable(cArr).orElse(c);
        this.b = (char[]) Optional.ofNullable(cArr2).orElse(d);
    }

    public final String toString() {
        return "ParseConfig{dateTimeSeparators=" + Arrays.toString(this.a) + ", fractionSeparators=" + Arrays.toString(this.b) + '}';
    }
}
