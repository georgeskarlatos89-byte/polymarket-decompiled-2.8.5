package bo.app;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum le {
    PENDING_START,
    PENDING_RETRY,
    IN_FLIGHT,
    BATCHED,
    COMPLETE;

    public final boolean a() {
        if (this != PENDING_START && this != PENDING_RETRY) {
            return false;
        }
        return true;
    }
}
