package defpackage;

import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class n1o extends o1o {
    public int b;

    @Override // defpackage.o1o
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // defpackage.o1o
    public final String b() {
        return "logInternal";
    }

    @Override // defpackage.o1o
    public final int c() {
        return 44;
    }

    @Override // defpackage.o1o
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.o1o
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n1o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            this.b = -1391114360;
            return -1391114360;
        }
        return i;
    }
}
