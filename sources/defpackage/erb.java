package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum erb {
    DISABLE(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);

    private final int priority;

    erb(int i) {
        this.priority = i;
    }

    public final int a() {
        return this.priority;
    }
}
