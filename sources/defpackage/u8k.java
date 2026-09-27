package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u8k extends e19 {
    public static final t8k d = t8k.OFF;
    public final t8k b;
    public final bx7 c;

    public u8k(t8k t8kVar) {
        t8kVar.getClass();
        this.b = t8kVar;
        this.c = bx7.VIDEO_STABILIZATION;
    }

    @Override // defpackage.e19
    public final bx7 a() {
        return this.c;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.b.name() + ')';
    }
}
