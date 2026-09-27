package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class m7l extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m7l(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder p = ace.p(j, "Pos: ", ", limit: ");
        p.append(j2);
        p.append(", len: ");
        p.append(i);
    }

    public m7l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
