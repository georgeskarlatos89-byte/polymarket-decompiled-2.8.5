package defpackage;

import com.polymarket.usviewmodels.SquadsInviteChannel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class vlh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SquadsInviteChannel.values().length];
        try {
            iArr[SquadsInviteChannel.messages.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SquadsInviteChannel.whatsApp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SquadsInviteChannel.snapchat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SquadsInviteChannel.xTwitter.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SquadsInviteChannel.instagramStory.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
