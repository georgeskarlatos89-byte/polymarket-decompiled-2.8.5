package defpackage;

import io.getstream.chat.android.models.VotingVisibility;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class xte {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VotingVisibility.values().length];
        try {
            iArr[VotingVisibility.ANONYMOUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VotingVisibility.PUBLIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
