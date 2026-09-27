package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ush {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ssh.values().length];
        try {
            iArr[ssh.Root.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ssh.FindFriends.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[rsh.values().length];
        try {
            iArr2[rsh.Standard.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[rsh.Prominent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
