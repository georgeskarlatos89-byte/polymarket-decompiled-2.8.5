package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum h4k {
    LOCAL_STORAGE(PlaceTypes.STORAGE),
    INITIAL_VARIANTS("initial"),
    SECONDARY_LOCAL_STORAGE("secondary-storage"),
    SECONDARY_INITIAL_VARIANTS("secondary-initial"),
    FALLBACK_INLINE("fallback-inline"),
    FALLBACK_CONFIG("fallback-config"),
    LOCAL_EVALUATION("local-evaluation");

    private final String type;

    h4k(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.type;
    }
}
