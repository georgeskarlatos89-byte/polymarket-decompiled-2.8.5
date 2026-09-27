package defpackage;

import com.polymarket.usviewmodels.PayoutTimelinePresentation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class xie {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PayoutTimelinePresentation.ConnectorState.values().length];
        try {
            iArr[PayoutTimelinePresentation.ConnectorState.done.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayoutTimelinePresentation.ConnectorState.fading.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PayoutTimelinePresentation.ConnectorState.upcoming.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
