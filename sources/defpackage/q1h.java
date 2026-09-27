package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q1h extends u1h {
    public final s1h a;
    public final float b;
    public final float c;

    public q1h(s1h s1hVar, float f, float f2) {
        this.a = s1hVar;
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        s1h s1hVar = this.a;
        return (float) Math.toDegrees(Math.atan((s1hVar.c - this.c) / (s1hVar.b - this.b)));
    }
}
