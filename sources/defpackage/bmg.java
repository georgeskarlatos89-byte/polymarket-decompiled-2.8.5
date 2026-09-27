package defpackage;

import com.polymarket.data.APIEventTag;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class bmg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[APIEventTag.NavigationType.values().length];
        try {
            iArr[APIEventTag.NavigationType.league.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[APIEventTag.NavigationType.sport.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
