package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pkc extends svj {
    public final cqd e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pkc(cqd cqdVar) {
        super(r0, r1, r2);
        int i;
        Integer num;
        qvj qvjVar = drk.b;
        if (cqdVar == cqd.ZERO) {
            i = 2;
        } else {
            i = 1;
        }
        if (cqdVar == cqd.SPACE) {
            num = 2;
        } else {
            num = null;
        }
        this.e = cqdVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pkc) {
            if (this.e == ((pkc) obj).e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
