package defpackage;

import com.polymarket.data.ESquadsTutorialSlide;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ath {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ESquadsTutorialSlide.MediaType.values().length];
        try {
            iArr[ESquadsTutorialSlide.MediaType.image.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ESquadsTutorialSlide.MediaType.video.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ESquadsTutorialSlide.MediaType.web.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[m6b.values().length];
        try {
            iArr2[m6b.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m6b.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
