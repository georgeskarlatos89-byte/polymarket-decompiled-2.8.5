package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class fpn {
    public static float a(float f, int i) {
        float f2 = ((f / 60.0f) + i) % 6.0f;
        return 0.72f - (Math.max(0.0f, Math.min(f2, Math.min(4.0f - f2, 1.0f))) * 0.5472f);
    }
}
