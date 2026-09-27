package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c23 implements bg8 {
    public static final c23 a = new Object();
    public static Boolean b;

    @Override // defpackage.bg8
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.bg8
    public final boolean e() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw ix2.g("canFocus is read before it is written");
    }
}
