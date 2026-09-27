package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface lpc extends qqc, nwh {
    @Override // defpackage.nwh
    default Object getValue() {
        return Long.valueOf(((ivd) this).y());
    }

    @Override // defpackage.qqc
    default void setValue(Object obj) {
        ((ivd) this).z(((Number) obj).longValue());
    }
}
