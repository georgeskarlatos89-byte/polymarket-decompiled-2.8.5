package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum fdl {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    fdl(char c) {
        this.zzk = c;
    }

    public static fdl a(char c) {
        for (fdl fdlVar : values()) {
            if (fdlVar.zzk == c) {
                return fdlVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.zzk;
    }
}
