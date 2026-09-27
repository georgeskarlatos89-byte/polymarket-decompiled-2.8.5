package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class sag extends gsn {
    @Override // defpackage.gsn
    public final void a(v1h v1hVar, float f, float f2) {
        float f3 = f2 * f;
        v1hVar.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        r1h r1hVar = new r1h(0.0f, 0.0f, f4, f4);
        r1hVar.f = 180.0f;
        r1hVar.g = 90.0f;
        v1hVar.f.add(r1hVar);
        p1h p1hVar = new p1h(r1hVar);
        v1hVar.a(180.0f);
        v1hVar.g.add(p1hVar);
        v1hVar.d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        v1hVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        v1hVar.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
