package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lzm implements Runnable {
    public final /* synthetic */ azm a;
    public final /* synthetic */ azm b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ q0n e;

    public lzm(q0n q0nVar, azm azmVar, azm azmVar2, long j, boolean z) {
        this.a = azmVar;
        this.b = azmVar2;
        this.c = j;
        this.d = z;
        this.e = q0nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.m1(this.a, this.b, this.c, this.d, null);
    }
}
