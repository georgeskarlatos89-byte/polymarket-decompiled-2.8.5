package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum s1g {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    private final boolean isComplete;

    s1g(boolean z) {
        this.isComplete = z;
    }

    public final boolean a() {
        return this.isComplete;
    }
}
