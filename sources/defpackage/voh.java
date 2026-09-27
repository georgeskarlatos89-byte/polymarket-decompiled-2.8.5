package defpackage;

import com.polymarket.usviewmodels.SquadsPositionsEventPageEntryGroupPresentation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class voh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SquadsPositionsEventPageEntryGroupPresentation.Kind.values().length];
        try {
            iArr[SquadsPositionsEventPageEntryGroupPresentation.Kind.joined.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SquadsPositionsEventPageEntryGroupPresentation.Kind.draw.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SquadsPositionsEventPageEntryGroupPresentation.Kind.outcome.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
