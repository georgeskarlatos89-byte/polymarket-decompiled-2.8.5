package defpackage;

import com.polymarket.usviewmodels.FeedRowID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class dmj {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[rx7.values().length];
        try {
            iArr[rx7.Loading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rx7.Error.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rx7.Broken.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rx7.Content.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[FeedRowID.Kind.values().length];
        try {
            iArr2[FeedRowID.Kind.promoCard.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FeedRowID.Kind.moduleChildPromo.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FeedRowID.Kind.labelRow.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[FeedRowID.Kind.eventCard.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[FeedRowID.Kind.keyRaceCard.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[FeedRowID.Kind.heroEventCard.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[FeedRowID.Kind.moduleCarousel.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[FeedRowID.Kind.moduleHeader.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[FeedRowID.Kind.moduleShowMore.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[FeedRowID.Kind.polymapMiniMap.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[FeedRowID.Kind.bottomLoader.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
