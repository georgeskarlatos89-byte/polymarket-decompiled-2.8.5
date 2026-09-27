package defpackage;

import com.polymarket.data.EAppTab;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ji0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EAppTab.values().length];
        try {
            iArr[EAppTab.live.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EAppTab.profile.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EAppTab.squads.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EAppTab.search.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
