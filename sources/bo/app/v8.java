package bo.app;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v8 {
    public v8() {
        w2 w2Var = w2.SESSION_START;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        w2 w2Var = w2.SESSION_START;
        return true;
    }

    public final int hashCode() {
        return w2.DUST_INITIATED.hashCode();
    }

    public final String toString() {
        return "FeatureFlagRefreshRequestedEvent(requestInitiatedBy=" + w2.DUST_INITIATED + ')';
    }
}
