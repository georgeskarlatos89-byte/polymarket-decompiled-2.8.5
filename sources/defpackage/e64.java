package defpackage;

import com.polymarket.clients.ClientHeroSheet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class e64 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientHeroSheet.Action.Role.values().length];
        try {
            iArr[ClientHeroSheet.Action.Role.primary.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientHeroSheet.Action.Role.secondary.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClientHeroSheet.Action.Role.destructive.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
