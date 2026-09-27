package io.ably.lib.types;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public enum AnnotationAction {
    ANNOTATION_CREATE,
    ANNOTATION_DELETE;

    public static AnnotationAction tryFindByOrdinal(int i) {
        if (values().length <= i) {
            return null;
        }
        return values()[i];
    }
}
