package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class svj implements jy7 {
    public final qvj a;
    public final int b;
    public final Integer c;
    public final int d;

    public svj(qvj qvjVar, int i, Integer num) {
        qvjVar.getClass();
        this.a = qvjVar;
        this.b = i;
        this.c = num;
        int i2 = qvjVar.e;
        this.d = i2;
        if (i >= 0) {
            if (i2 >= i) {
                if (num == null || num.intValue() > i) {
                    return;
                }
                throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
            }
            py2.g("The maximum number of digits (", i2, i, ") is less than the minimum number of digits (");
            throw null;
        }
        f27.q(sv6.j(i, "The minimum number of digits (", ") is negative"));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fs4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [fs4, java.lang.Object] */
    @Override // defpackage.jy7
    public final fs4 a() {
        lcf lcfVar = this.a.b;
        ?? obj = new Object();
        int i = this.b;
        if (i >= 0) {
            if (i <= 9) {
                if (this.c != null) {
                    return new Object();
                }
                return obj;
            }
            f27.q(sv6.j(i, "The minimum number of digits (", ") exceeds the length of an Int"));
            return null;
        }
        f27.q(sv6.j(i, "The minimum number of digits (", ") is negative"));
        return null;
    }

    @Override // defpackage.jy7
    public final gwd b() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.d);
        qvj qvjVar = this.a;
        return yln.b(valueOf, valueOf2, this.c, qvjVar.b, qvjVar.c, false);
    }
}
