package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum ogc {
    SMALL("version 1-9"),
    MEDIUM("version 10-26"),
    LARGE("version 27-40");

    private final String description;

    ogc(String str) {
        this.description = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.description;
    }
}
