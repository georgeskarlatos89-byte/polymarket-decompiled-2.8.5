package bo.app;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r6 implements fa {
    public final long a;
    public final String b;
    public final ea c = ea.DISCONNECT_AND_RETRY;

    public r6(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // bo.app.fa
    public final ea a() {
        return this.c;
    }
}
