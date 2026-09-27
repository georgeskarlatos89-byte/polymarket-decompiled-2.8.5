package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class fcm implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static fcm d(byte... bArr) {
        bArr.getClass();
        xcm xcmVar = new xcm(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return hgn.c(xcmVar);
        } finally {
            try {
                xcmVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final fcm b(Class cls) {
        if (cls.isInstance(this)) {
            return (fcm) cls.cast(this);
        }
        throw new Exception(m51.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
