package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface dpc extends qqc, nwh {
    @Override // defpackage.nwh
    default Object getValue() {
        return Integer.valueOf(((hvd) this).y());
    }

    @Override // defpackage.qqc
    default void setValue(Object obj) {
        ((hvd) this).z(((Number) obj).intValue());
    }
}
