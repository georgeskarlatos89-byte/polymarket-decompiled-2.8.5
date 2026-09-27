package defpackage;

import com.polymarket.usviewmodels.WaitlistScene;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class se8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WaitlistScene.values().length];
        try {
            iArr[WaitlistScene.entry.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WaitlistScene.flywheel.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WaitlistScene.inviteCode.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
