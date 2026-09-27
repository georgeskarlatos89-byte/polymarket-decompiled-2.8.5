package defpackage;

import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class p6n {
    public static final p6n c = new p6n(x4n.b, y3n.z());
    public final x4n a;
    public final y3n b;

    public p6n(x4n x4nVar, y3n y3nVar) {
        x4nVar.getClass();
        this.a = x4nVar;
        this.b = y3nVar;
    }

    public static p6n a(l0f l0fVar, boolean z) {
        x4n a;
        int min;
        int C = l0fVar.C();
        if (C <= 1) {
            l0fVar.C();
            int a2 = l0fVar.a(l0fVar.A());
            v7l v7lVar = v7l.a;
            int i = d7l.a;
            y3n y = y3n.y(l0fVar, v7l.b);
            l0fVar.b(a2);
            kl4 kl4Var = new kl4();
            Inflater inflater = (Inflater) kl4Var.b;
            try {
                if (z) {
                    int a3 = l0fVar.a(l0fVar.A());
                    int c2 = l0fVar.c();
                    if (c2 < 0) {
                        min = 4096;
                    } else {
                        min = Math.min(c2, 4096);
                    }
                    try {
                        a = x4n.a(l0f.h(new InflaterInputStream(new og1(kl4Var, l0fVar), inflater, min), 4096));
                        inflater.reset();
                        if (l0fVar.c() == 0) {
                            l0fVar.b(a3);
                            kl4Var.close();
                            return new p6n(a, y);
                        }
                        throw new IOException("Unexpected bytes remaining after FlagsBlob parsing.");
                    } finally {
                    }
                }
                inflater.setInput(l0fVar.z());
                try {
                    a = x4n.a(l0f.h(new og1(kl4Var, 4), 4096));
                    kl4Var.close();
                    return new p6n(a, y);
                } finally {
                }
            } finally {
                try {
                    kl4Var.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(C).length() + 44);
        sb.append("Unsupported version: ");
        sb.append(C);
        sb.append(". Current version is: 1");
        throw new IOException(sb.toString());
    }
}
